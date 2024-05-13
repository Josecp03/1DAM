--set verify off
--set serveroutput on 

/*
###################################
########### EJERCIICO 1 ###########
###################################
*/
create or replace procedure mostrarPasajerosVuelos (p_codigo_avion vuelos.cod_avion%type)
is
    -- Variable para guardar el nombre del avion
    v_nombre_avion aviones.nom_avion%type;
        
    -- Variables para contar los pasajeros por vuelos y los pasajeros totales
    v_contador_pasajeros_vuelo number(8) := 0;
    v_contador_pasajeros_totales number(8) := 0;

    -- Varaibles para guadar toda la información de un vuelo y de un pasajero
    v_vuelo vuelos%rowtype;
    v_pasajero pasajeros%rowtype;
    
    -- Cursor para guardar la información de los vuelos
    cursor cursor_vuelos is
        select *
        from vuelos
        where cod_avion = p_codigo_avion;
        
    -- Cursor para guardar la información de los pasajeros
    cursor cursor_pasajeros (codigo_vuelo reservas.cod_vuelo%type) is
        select * 
        from pasajeros
        where cod_pasajero in (
            select cod_pasajero
            from reservas
            where cod_vuelo = codigo_vuelo
        );
        
begin

    -- Consulta para seleccionar el nombre del avion dado su código
    select nom_avion into v_nombre_avion
    from aviones
    where cod_avion = p_codigo_avion;

    dbms_output.put_line('NOMBRE DEL AVIÓN: ' || v_nombre_avion);
    
    -- Abrir el primer cursor
    open cursor_vuelos;
        loop
            fetch cursor_vuelos into v_vuelo;
            exit when cursor_vuelos%notfound;
            dbms_output.put_line('----------------------------------------------------------------------------------------------');
            dbms_output.put_line('ORIGEN VUELO: ' || v_vuelo.origen_vuelo || '      ' || 'DESTINO VUELO: ' || v_vuelo.destino_vuelo || '        ' || 'FECHA VUELO: ' || v_vuelo.fecha_vuelo );
            dbms_output.put_line('----------------------------------------------------------------------------------------------');
            dbms_output.put_line(' ');
            dbms_output.put_line('      NOMBRE              APELLIDOS           DIRECCIÓN                           TELÉFONO');
            
            -- Abrir el segundo cursor
            open cursor_pasajeros (v_vuelo.cod_vuelo);
                loop
                    fetch cursor_pasajeros into v_pasajero;
                    exit when cursor_pasajeros%notfound;
                    dbms_output.put_line('      ' ||
                                        RPAD(v_pasajero.nom_pasajero, 20, ' ') ||
                                        RPAD(v_pasajero.ape_pasajero, 20, ' ') ||
                                        RPAD(v_pasajero.dir_pasajero, 36, ' ') ||
                                        v_pasajero.tel_pasajero
                                        );
                                        
                    -- Si encuentra un pasajero sumar el contador de pasajeros por vuelo
                    if cursor_pasajeros%found then
                        v_contador_pasajeros_vuelo := v_contador_pasajeros_vuelo + 1;
                    end if;
                end loop;
            close cursor_pasajeros;
            dbms_output.put_line('----------------------------------------------------------------------------------------------');
            dbms_output.put_line('                                                                   NÚMERO PASAJEROS VUELO: ' || v_contador_pasajeros_vuelo);
            
            -- Sumar el número de pasajeros del vuelo al contador de pasajeros totales
            v_contador_pasajeros_totales := v_contador_pasajeros_totales + v_contador_pasajeros_vuelo;
            
            -- Inicializar el contador de pasajeros por vuelo para que empeice a contar desde 0
            v_contador_pasajeros_vuelo := 0;
        end loop;
    close cursor_vuelos;
    dbms_output.put_line('----------------------------------------------------------------------------------------------');
    dbms_output.put_line('NÚMERO TOTAL DE PASAJEROS AVIÓN: ' || v_contador_pasajeros_totales);
    dbms_output.put_line('----------------------------------------------------------------------------------------------');
    
exception
    when no_data_found then
        dbms_output.put_line('No se ha encontró el avión en la base de datos');
    when others then
        dbms_output.put_line('Error indeteminado en la Base de Datos');
end;
/

-- Bloque para llamar al procedimiento 
declare
    v_codigo_avion vuelos.cod_avion%type := 4;
begin
    mostrarPasajerosVuelos (v_codigo_avion);
end;
/

/*
###################################
########### EJERCIICO 2 ###########
###################################
*/

-- Creación de la tabla
create table audita_pasajeros (
    mensaje varchar2(500)
);

-- Creación del trigger
create or replace trigger audita_pasajeros before insert or update or delete on  pasajeros for each row
declare
    mensaje varchar2(500) := '';
begin

    -- En caso de inserción
    if inserting then
        mensaje := 'INSERCIÓN [' || to_char(sysdate, 'dd-mm-yy hh:mm') || ']: ' || :new.cod_pasajero || ' ' || :new.ape_pasajero || ', ' || :new.nom_pasajero;
    end if;
    
    -- En caso de modificación
    if updating('ape_pasajero') or updating('nom_pasajero') or updating ('dir_pasajero') then
        mensaje := 'MODIFICACIÓN [' || to_char(sysdate, 'dd-mm-yy hh:mm') || ']: ' || :old.cod_pasajero || ' ' || :old.ape_pasajero || ', ' || :old.nom_pasajero || ' cambia a ' || :new.ape_pasajero || ', ' || :new.nom_pasajero;
    end if;
    
    -- En caso de borrado
    if deleting then
        mensaje := 'BORRADO [' || to_char(sysdate, 'dd-mm-yy hh:mm') || ']: ' || :old.cod_pasajero;
    end if;
    
    -- Inserción del mensaje en la tabla audita_pasajeros
    insert into audita_pasajeros values(mensaje);
end;
/

-- Pruebas para el trigger

    --Prueba de inserción
    insert into pasajeros values(51, 'Corrochano', 'José', 'Talavera de la Reina', 123456789);
    
    --Prueba de modificación nombre
    update pasajeros set nom_pasajero = 'Pepe' where cod_pasajero = 51;
    
    --Prueba de modificación apellido
    update pasajeros set ape_pasajero = 'Pardo' where cod_pasajero = 51;
    
    --Prueba de modificación de dirección
    update pasajeros set dir_pasajero = 'Nueva dirección' where cod_pasajero = 51;
    
    -- Prueba de borrado
    delete from pasajeros where cod_pasajero = 51;
    
    




