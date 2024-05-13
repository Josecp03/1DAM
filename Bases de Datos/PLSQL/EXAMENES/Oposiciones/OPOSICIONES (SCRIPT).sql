--set verify off
--set serveroutput on


/*
##############################################
############### EJERCICIO 1 ##################
##############################################
*/

-- Procedimiento
create or replace procedure mostrarOpositoresProfesores (p_codigo_academia opositor_academia_profesor.cod_academia%type)
is
    -- Variable para el nombre de la acadmeia
    v_nombre_academia academias.nom_academia%type;
    
    -- Variables para los contadores de profesores y alumnos
    v_contador_profesores number(8) := 0;
    v_contador_alumnos number(8) := 0;
    
    -- Variables para guardar la información de un profesor y un opositor
    v_profesor profesores%rowtype;
    v_opositor opositores%rowtype;

    -- Cursor para guardar la información de los profesores
    cursor cursor_profesores is
        select *
        from profesores
        where cod_profesor in (
            select cod_profesor
            from opositor_academia_profesor
            where cod_academia = p_codigo_academia
        );
    
    -- Cursor para guardar la información de los opositores
    cursor cursor_opositores(p_codigo_profesor profesores.cod_profesor%type) is
        select *
        from opositores
        where cod_opositor in (
            select cod_opositor
            from opositor_academia_profesor
            where cod_profesor = p_codigo_profesor
        );
begin
    
    -- Consulta para seleccionar el nombre de la academia según su código
    select nom_academia into v_nombre_academia
    from academias
    where cod_academia = p_codigo_academia;
    
    dbms_output.put_line('NOMBRE DE LA ACADEMIA: ' || v_nombre_academia);
    
    -- Primer cursor
    open cursor_profesores;
        loop
            fetch cursor_profesores into v_profesor;
            exit when cursor_profesores%notfound;
            -- Si encuentra un profesor, sumarlo al contador de profesores
            if cursor_profesores%found then
                v_contador_profesores := v_contador_profesores + 1;
            end if;
            dbms_output.put_line('----------------------------------------------------------------------------------------------------');
            dbms_output.put_line('PROFESOR: ' || v_profesor.nom_profesor || ' ' || v_profesor.ape_profesor);
            dbms_output.put_line('----------------------------------------------------------------------------------------------------');
            dbms_output.put_line('      NOMBRE ALUMNO           APELLIDOS ALUMNO            FECHA NACIMIENTO');
            -- Segundo Cursor
            open cursor_opositores (v_profesor.cod_profesor);
                loop
                    fetch cursor_opositores into v_opositor;
                    exit when cursor_opositores%notfound;
                    -- Si encuentra un opositor, sumarlo al contador de alumnos
                    if cursor_opositores%found then
                        v_contador_alumnos := v_contador_alumnos + 1;
                 end if;
                    dbms_output.put_line('      ' || 
                                         RPAD(v_opositor.nom_opositor, 24, ' ') ||
                                         RPAD(v_opositor.ape_opositor, 30, ' ') ||
                                         v_opositor.fecha_nac
                                        );

                end loop;
            close cursor_opositores;
        end loop;
    close cursor_profesores;
    
    dbms_output.put_line('----------------------------------------------------------------------------------------------------');
    dbms_output.put_line('NÚMERO TOTAL DE PROFESORES: ' || v_contador_profesores || '                       ' || 'NÚMERO TOTAL DE ALUMNOS: ' || v_contador_alumnos);
    dbms_output.put_line('----------------------------------------------------------------------------------------------------');

-- Manejo de excepciones
exception
    when no_data_found then
        dbms_output.put_line('No se ha encontró la academia en la base de datos');
    when others then
        dbms_output.put_line('Error indeteminado en la Base de Datos');
end;
/

-- Bloque para llamar al procedimiento
declare
    v_codigo_academia opositor_academia_profesor.cod_academia%type := &codigo; 
begin
    mostrarOpositoresProfesores(v_codigo_academia);
end;
/

/*
##############################################
############### EJERCICIO 2 ##################
##############################################
*/

-- Creación de la tabla
create table audita_opositores (
    mensaje varchar2(500)
);

-- Creción del trigger
create or replace trigger audita_profesor before insert or update or delete on opositores for each row
declare
    v_mensaje varchar2(500) := '';
begin
    v_mensaje := 'FECHA: ' || sysdate || ' HORA:' || to_char(sysdate,'HH:MM:SS' || ' ');
    
    -- En caso de inserción
    if inserting then
        v_mensaje := v_mensaje || 'OPERACIÓN: INSERCIÓN';
    end if;
    
    -- En caso de borrado
    if deleting then
        v_mensaje := v_mensaje || 'OPERACIÓN: BORRADO || ' || 'CÓDIGO: ' || :old.cod_opositor || ', APELLIDO: ' || :old.ape_opositor || ', NOMBRE: ' || :old.nom_opositor || ', FECHA NACIMIENTO: ' || :old.fecha_nac;
    end if;
    
    -- En caso de actualizar el apellido
    if updating('ape_opositor') then
        v_mensaje := v_mensaje || 'OPERACIÓN: MODIFICACIÓN || ' || 'APELLIDO ANTERIOR: '  || :old.ape_opositor || ', APELLIDO NUEVO: ' || :new.ape_opositor;
    end if;
    
    -- En caso de actualizar el nombre
    if updating('nom_opositor') then
        v_mensaje := v_mensaje || 'OPERACIÓN: MODIFICACIÓN || ' || 'NOMBRE ANTERIOR: ' || :old.nom_opositor || ', NOMBRE NUEVO: ' || :new.nom_opositor;
    end if;
    
    -- En caso de actualizar la fecha de nacimiento
    if updating('fecha_nac') then
        v_mensaje := v_mensaje || 'OPERACIÓN: MODIFICACIÓN || ' || 'FECHA DE NACIMIENTO ANTERIOR: ' || :old.fecha_nac || ', FECHA DE NACIEMIENTO NUEVA: ' || :new.fecha_nac;
    end if;
    
    -- Realizar la inserción a la nueva tabla
    insert into audita_opositores values(v_mensaje);
end;
/
--Pruebas para el trigger

    -- Prueba de inserción
    insert into opositores values (90, 'Corrochano Pardo', 'José', '28/04/03');
    
    -- Prueba de actualización de apellido
    update opositores set ape_opositor = 'Corrochano' where cod_opositor = 90;
    -- Prueba de actualización de nombre
    update opositores set nom_opositor = 'Pepe' where cod_opositor = 90;

    -- Prueba de actualización de fecha de nacimiento
    update opositores set fecha_nac = '22/04/2003' where cod_opositor = 90;

    -- Prueba de borrado
    delete from opositores where cod_opositor = 90;


