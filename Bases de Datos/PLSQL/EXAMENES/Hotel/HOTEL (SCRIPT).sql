--set verify off
--set serveroutput on

/*
##############################################
############### EJERCICIO 1 ##################
##############################################
*/

-- Funci�n
create or replace function habitacion_libre (p_numero_habitacion reservas.numhabitacion%type)
return boolean
is
    v_contador number(8) := 0;
begin
    
    -- Consulta para contar cuantas habitaciones hay libres en la fecha de hoy 
    select count(*) into v_contador
    from reservas
    where sysdate between fechaentrada and fechasalida
    and numhabitacion = p_numero_habitacion;
    
    -- Comprobar que la habitaci�n est� libre o ocupada
    if v_contador > 0 then
        return false;
    else
        return true;
    end if;
    
exception
    when others then
        dbms_output.put_line('Error inesperado en la base de datos');
end;
/


-- N�mero habitaci�n no encontrada en la base de datos --> 1
-- N�mero habitaci�n ocupada --> 202
-- N�mero habitaci�n libre --> 101

-- Bloque para llamar a la funci�n
declare
    v_numero_habitacion reservas.numhabitacion%type := &habitacion;
    v_contador_verificador number(8) := 0;
    mi_excepcion exception;
begin 

    -- Consulta para contar cuantas habitaciones hay con el numero de habitacion proporcionado
    select count(*) into v_contador_verificador
    from reservas
    where numhabitacion = v_numero_habitacion;
    
    -- Lanzar excepcion si no se ha encontrado el numero de habitacion
    if v_contador_verificador = 0 then
        raise mi_excepcion;
    end if;

    -- Llamar a la funci�n para comprobar la ocupaci�n de la habitaci�n
    if habitacion_libre(v_numero_habitacion) then
        dbms_output.put_line('La habitaci�n esta libre');
    else
        dbms_output.put_line('La habitaci�n esta ocupada');
    end if;
    
exception
    when mi_excepcion then
        dbms_output.put_line('No se encontr� la habitaci�n en la base de datos');
end;
/

/*
##############################################
############### EJERCICIO 2 ##################
##############################################
*/
create or replace procedure reserva_express (p_numero_habitacion reservas.numhabitacion%type, p_codigo_cliente clientes.codigocliente%type)
is
    -- Variable para el nuevo c�digo de reserva
    v_codigo_reserva reservas.codreserva%type;
    
    -- Variables para las excepciones
    excepcion_cliente exception;
    excepcion_habitacion exception;
    
    -- Variables para los contadores
    v_contador_cliente number(8) := 0;
    v_contador_habitacion number(8) := 0;
    
begin

    -- Comprobar si la habitaci�n est� libre
    if not habitacion_libre(p_numero_habitacion) then
        dbms_output.put_line('La habitaci�n no esta libre');
    else
        
        -- Comprobar si el cliente existe
        select count(*) into v_contador_cliente
        from clientes
        where codigocliente = p_codigo_cliente; 
        
        -- Si no existe se lanza una excepcion
        if v_contador_cliente = 0 then
            raise excepcion_cliente;
        end if;
        
        -- Comprobar si la habitaci�n existe
        select count(*) into v_contador_habitacion
        from habitaciones
        where numhabitacion = p_numero_habitacion; 
        
        -- Si no existe se lanza una excepcion
        if v_contador_habitacion = 0 then
            raise excepcion_habitacion;
        end if;
        
        -- Conseguir el nuevo c�digo de reserva
        select max(codreserva)+1 into v_codigo_reserva
        from reservas;
        
        -- Realizar inserci�n en la tabla resrevas
        insert into reservas values (
            v_codigo_reserva, 
            p_numero_habitacion,
            p_codigo_cliente,
            0,
            sysdate,
            sysdate+1,
            0
        );
        
    end if;
    
exception
    when excepcion_cliente then
        dbms_output.put_line('No se ha encontrado el cliente en la base de datos');
    when excepcion_habitacion then
         dbms_output.put_line('No se ha encontrado la habitaci�n en la base de datos');
    when others then
        dbms_output.put_line('Error indetemrinado en la base de datos');
end;
/

-- Habitaci�n inv�lida --> habitaci�n 33, cliente = 1
-- Cliente inv�lido --> habitaci�n 101, cliente 200
-- Habitaci�n ocupada --> habitaci�n 202, cliente 5
-- Prueba v�lida --> habitaci�n 101, cliente = 1

-- Bloque para llamar al m�todo
declare
    v_numero_habitacion reservas.numhabitacion%type := &habitacion;
    v_codigo_cliente clientes.codigocliente%type := &cliente;
begin
    
    -- Llamar al m�todo
    reserva_express(v_numero_habitacion, v_codigo_cliente);
end;
/

/*
##############################################
############### EJERCICIO 3 ##################
##############################################
*/
--a) A�adir campo a habitaciones
alter table habitaciones
add numreservas number(8);

--b) Actualizar el campo numreservas
update habitaciones h
set numreservas = (
    select count(*) 
    from reservas r
    where h.numhabitacion = r.numhabitacion
);

--c) Crear el trigger
create or replace trigger mi_trigger before insert or update or delete on  reservas for each row
declare
begin   
    -- En caso de insertar
    if inserting then
        update habitaciones
        set numreservas = numreservas + 1
        where numhabitacion = :new.numhabitacion;
    end if;
    
    -- En caso de eliminar
    if deleting then
        update habitaciones
        set numreservas = numreservas - 1
        where numhabitacion = :old.numhabitacion;
    end if;
    
    -- En caso de actualizar 
    if updating('numhabitacion') then
        -- Restar el numero de reservas a la antigua
        update habitaciones
        set numreservas = numreservas - 1
        where numhabitacion = :old.numhabitacion;
        
        -- Sumar el n�mero de reservas a la nueva
        update habitaciones
        set numreservas = numreservas + 1
        where numhabitacion = :new.numhabitacion;
    end if;
end;
/
-- Probar el trigger
    
    -- Insertar una nueva reserva en la habitaci�n 101
    insert into reservas values (50, 101, 1, 2, sysdate, sysdate+1, 0);
    
    -- Actualizar la habitaci�n en la primera reserva
    update reservas
    set numhabitacion = 102
    where codreserva = 1;
    
    -- Borrar reserva
    delete from reservas where codreserva = 21;

/*
##############################################
############### EJERCICIO 4 ##################
##############################################
*/

-- Procdemiento para mostrar las reservas de cada habitaci�n
create or replace procedure mostrarReservasHabitaciones
is
    -- Variables para guardar informaci�n de los cursores
    v_habitacion reservas.numhabitacion%type;
    v_reserva reservas%rowtype;
    
    -- Variables para mostrar datos espec�ficos de la habitaci�n
    v_nombre_habitacion habitaciones.nombrehabitacion%type;
    v_tipo_habitacion habitaciones.tipo%type;
    
    -- Variables para mostrar datos espec�ficos del cliente
    v_nombre_cliente clientes.nombrecliente%type;
    v_pais_cliente clientes.pais%type;
    
    -- Variables para los contadores
    v_contador_supletorias number(8) := 0;
    v_contador_supletorias_reserva number(8):= 0;
    v_contador_total number(8) := 0;
    v_contador_reservas number(8) := 0;
    
    -- Cursor para las habitaciones que tienen reservas
    cursor cursor_habitaciones is
        select distinct(numhabitacion)
        from reservas;

    -- Cursor para las reservas 
    cursor cursor_reservas (p_numero_habitacion reservas.numhabitacion%type) is
        select * 
        from reservas 
        where numhabitacion = p_numero_habitacion;
begin
    
    -- Abrir el primer cursor
    open cursor_habitaciones;
        loop
            fetch cursor_habitaciones into v_habitacion;
            exit when cursor_habitaciones%notfound;
            
            -- Consultar el nombre de la habitaci�n
            select nombrehabitacion into v_nombre_habitacion
            from habitaciones 
            where numhabitacion = v_habitacion;
            
            -- Consultar el tipo de habitaci�n
            select tipo into v_tipo_habitacion
            from habitaciones 
            where numhabitacion = v_habitacion;
            
            dbms_output.put_line('==============================================================================================');
            dbms_output.put_line('HABITACI�N: ' || v_nombre_habitacion || '                 NUMERO: ' || v_habitacion || '                  TIPO: ' || v_tipo_habitacion);
            dbms_output.put_line('==============================================================================================');
            dbms_output.put_line('CLIENTE                   PAIS            ENTRADA     SALIDA');
            dbms_output.put_line('------------------------- --------------- ----------- ---------');
            
            -- Abrir el segundo cursor
            open cursor_reservas(v_habitacion);
                loop
                    fetch cursor_reservas into v_reserva;
                    exit when cursor_reservas%notfound;
                    
                    -- Contar el n�mero de reservas para luego realizar la media
                    if cursor_reservas%found then
                        v_contador_reservas := v_contador_reservas + 1;
                    end if;
                    
                    -- Consultar el nombre del cliente
                    select nombrecliente into v_nombre_cliente
                    from clientes
                    where codigocliente = v_reserva.codigocliente;
                    
                    -- Consultar el pa�s del cliente
                    select pais into v_pais_cliente
                    from clientes
                    where codigocliente = v_reserva.codigocliente;
                    
                    dbms_output.put_line(RPAD(v_nombre_cliente, 26, ' ') ||
                                        RPAD(v_pais_cliente, 16 ,' ') ||
                                        RPAD(v_reserva.fechaentrada, 12, ' ') ||
                                        v_reserva.fechasalida);
                                        
                    -- Consultar el n�mero de camas supletorias por habitaci�n
                    select camassupletorias into v_contador_supletorias_reserva
                    from reservas 
                    where numhabitacion = v_habitacion
                    and codreserva = v_reserva.codreserva;
                    
                    -- Sumar las camas supletorias de cada habitaci�n en las distintas reservas de la misma habitaci�n
                    v_contador_supletorias := v_contador_supletorias + v_contador_supletorias_reserva;
                    
                end loop;
                
            close cursor_reservas;
            dbms_output.put_line('----------------------------------------------------------------------------------------------');
            dbms_output.put_line('RESERVAS CON CAMAS SUPLETORIAS: ' || v_contador_supletorias);
            v_contador_total := v_contador_total + v_contador_supletorias;
            
            -- Inicializar los contadores a 0 para que realicen bien la suma
            v_contador_supletorias := 0;
            v_contador_supletorias_reserva := 0;
        end loop;
    close cursor_habitaciones;
    dbms_output.put_line('==============================================================================================');
    dbms_output.put_line(' ');
    dbms_output.put_line('==============================================================================================');
    dbms_output.put_line('N�MERO TOTAL DE CAMAS SUPLETORIAS CONTRATADAS: ' || v_contador_total);
    dbms_output.put_line('MEDIA DE CAMAS POR RESERVA: ' || round(v_contador_total / v_contador_reservas, 2));
    
exception
    when no_data_found then
        dbms_output.put_line('No se encontr� ninguna reserva');
    when others then
        dbms_output.put_line('Error indeterminado en la base de datos');
end;
/

-- Bloque para llamar al m�todo
declare
begin
    mostrarReservasHabitaciones;
end;
/








