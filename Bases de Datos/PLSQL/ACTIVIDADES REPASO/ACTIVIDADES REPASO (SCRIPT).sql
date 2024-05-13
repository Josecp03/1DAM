--set verify off
--set serveroutput on

/*
#########################################
############## EJERCICIO 4 ##############
#########################################

Crear un procedimiento que a partir de un 
código de almacén nos muestre todas sus 
compras y para cada compra todos sus 
artículos. El código de almacén se pasará 
como parámetro al procedimiento. En caso de 
que no exista el código del almacén, 
mostraremos un mensaje que así lo indique 
y se realizará la llamada al procedimiento.
*/

-- Procedimiento
create or replace procedure mostrarArticulosCompras (p_codigo_almacen compras.codalma%type)
is
    
    -- Cursor para guardar los número de compras de un almacén
    cursor c_compras is
        select num_compra 
        from compras
        where codalma = p_codigo_almacen;
    
    -- Cursor para guardar los a
    cursor c_articulos (p_numero_compra compras.num_compra%type) is
        select * 
        from articulos
        where codarti in (
            select codarti
            from det_compras
            where num_compra = p_numero_compra
        );
        
    -- Variable para guardar la información del número de compra
    v_numero_compra compras.num_compra%type;
    
    -- Variable para guardar la información de los artículos
    v_articulo articulos%rowtype;
    
begin
    -- Abrir el primer cursor
    open c_compras;
        loop
            fetch c_compras into v_numero_compra;
            exit when c_compras%notfound;
            dbms_output.put_line('----------------------------------------------------------------------------------------------');
            dbms_output.put_line('NUMERO_COMPRA: ' || v_numero_compra);
            dbms_output.put_line('----------------------------------------------------------------------------------------------');
            dbms_output.put_line('      DENOMINACION        UNIDADES        PRECIO');
            dbms_output.put_line('    ---------------      ----------      --------');
            -- Abrir el segundo cursor
            open c_articulos (v_numero_compra);
                loop
                    fetch c_articulos into v_articulo;
                    exit when c_articulos%notfound;
                    dbms_output.put_line(
                        '        ' ||
                        rpad(v_articulo.denominacion, 21, ' ') ||
                        rpad(v_articulo.stock, 15, ' ') ||
                        v_articulo.pvp
                    );
                end loop;
            close c_articulos;
        end loop;
    close c_compras;

end;
/

-- Bloque para llamar al procedimiento
declare
    v_codigo_almacen compras.codalma%type := &codigo;
    
    v_contador_almacen_almacenes number(8) := 0;
    v_contador_almacen_compras number(8) := 0;
    
    e_almacen_compras exception;
    e_almacen_almacenes exception;
begin
    
    -- Consultar el número de veces que aparece el almacén en la tabla compras
    select count(*) into v_contador_almacen_compras
    from compras
    where codalma = v_codigo_almacen;
    
    -- Consultar el número de veces que aparece el almacén en la tabla almacenes
    select count(*) into v_contador_almacen_almacenes
    from almacenes
    where codalma = v_codigo_almacen;
    
    dbms_output.put_line(v_contador_almacen_compras);
    dbms_output.put_line(v_contador_almacen_almacenes);

    -- Coprobar la existencia del almacén en la base de datos
    if v_contador_almacen_almacenes = 1 and v_contador_almacen_compras = 0 then
        raise e_almacen_almacenes;
    else 
        if v_contador_almacen_compras = 0 then
            raise e_almacen_compras;
        end if;
    end if;

    -- Llamar al procedimiento
    mostrarArticulosCompras(v_codigo_almacen);

-- Manejo de excepciones
exception
    when e_almacen_compras then
        dbms_output.put_line('El almacén no se encontró en la base de datos');
    when e_almacen_almacenes then
        dbms_output.put_line('El almacén no está relacionado con ninguna compra');
    when others then
        dbms_output.put_line('Error indeterminado en la base de datos');
end;
/

/*
#########################################
############## EJERCICIO 5 ##############
#########################################

Crear una función que nos devuelva el 
código del empleado que tenga el mayor 
sueldo del almacén que introduzca el 
usuario. La función será llamada desde un 
bloque donde se mostrarán los datos del 
empleado. A la función le paremos como 
parámetro el código del almacén y nos 
devolverá el código del empleado. En caso 
de que el almacén no exista, o se produzca 
otro error. Se mostrará un mensaje y la 
función no realizará ninguna acción.

*/

-- Función
create or replace function mayor_sueldo_almacen (p_codigo_almacen empleados.codalma%type)
return empleados.codemple%type
is
    v_codigo_empleado empleados.codemple%type;
begin

    -- Consutar el empleado con el salario máximo del almacén dado
    select codemple into v_codigo_empleado
    from empleados
    where codalma = p_codigo_almacen
    and salario = (
        select max(salario)
        from empleados
        where codalma = p_codigo_almacen
    );
    
    
    return v_codigo_empleado;

-- Manejo de excepciones
exception
    when no_data_found then
        return -1;
end;
/

-- Bloque para llamar a la función y mostrar los datos del empleado
declare
    v_codigo_almacen empleados.codalma%type := &codigo;
    v_codigo_empleado empleados.codemple%type := mayor_sueldo_almacen(v_codigo_almacen);
    v_empleado empleados%rowtype;
begin

    if v_codigo_empleado = -1 then
        dbms_output.put_line('El almacén no se encontró en la base de datos');
    else
        -- Consultar todos los datos del empleado
        select * into v_empleado
        from empleados
        where codemple = v_codigo_empleado;
    
        -- Mostrar los datos del empleado por pantalla
        dbms_output.put_line('CÓDIGO: ' || v_empleado.codemple);
        dbms_output.put_line('NOMBRE: ' || v_empleado.nombre);
        dbms_output.put_line('POBLACIÓN: ' || v_empleado.poblacion);
        dbms_output.put_line('FECHA ALTA: ' || v_empleado.fechaalta);
        dbms_output.put_line('SALARIO: ' || v_empleado.salario);
        dbms_output.put_line('ALMACÉN: ' || v_empleado.codalma);
        dbms_output.put_line('CÓDIGO: ' || v_empleado.codemple);
        dbms_output.put_line('JEFE: ' || v_empleado.codjefe);
    end if;
    
end;
/


/*
#########################################
############## EJERCICIO 6 ##############
#########################################

Crear una función que devolverá el código 
del proveedor que introduzca el usuario 
por teclado, esta información será pasada 
a un procedimiento que se encargará de 
mostrar los datos del proveedor introducido 
o bien un mensaje de error en caso de que 
no exista el proveedor.

*/

-- Función para pedir el código del proveedor
create or replace function pedir_codigo_proveedor 
return proveedores.codprov%type
is
    v_codigo_proveedor proveedores.codprov%type := &codigo;
begin
    return v_codigo_proveedor;
end;
/

-- Procedimiento para mostrar los datos del proveedor
create or replace procedure mostrar_datos_proveedor (p_codigo_proveedor proveedores.codprov%type)
is
    v_proveedor proveedores%rowtype;
begin
    select * into v_proveedor
    from proveedores
    where codprov = p_codigo_proveedor;
    
    dbms_output.put_line('CÓDIGO: ' || v_proveedor.codprov);
    dbms_output.put_line('NOMBRE: ' || v_proveedor.nombre);
    dbms_output.put_line('POBLACIÓN: ' || v_proveedor.poblacion);
    dbms_output.put_line('ZONA: ' || v_proveedor.zona);
    dbms_output.put_line('COMISIÓN: ' || v_proveedor.comision);
    
exception
    when no_data_found then
        dbms_output.put_line('No se econtró el proveedor en la base de datos');
end;
/

-- Bloque para llamar al procedimiento
declare

    -- Declaro la función
    function pedir_codigo_proveedor 
    return proveedores.codprov%type
    is
        v_codigo_proveedor proveedores.codprov%type := &codigo;
    begin
        return v_codigo_proveedor;
    end pedir_codigo_proveedor;
    
    -- Declaro el procedimiento
    procedure mostrar_datos_proveedor (p_codigo_proveedor proveedores.codprov%type)
    is
        v_proveedor proveedores%rowtype;
    begin
        select * into v_proveedor
        from proveedores
        where codprov = p_codigo_proveedor;
    
        dbms_output.put_line('CÓDIGO: ' || v_proveedor.codprov);
        dbms_output.put_line('NOMBRE: ' || v_proveedor.nombre);
        dbms_output.put_line('POBLACIÓN: ' || v_proveedor.poblacion);
        dbms_output.put_line('ZONA: ' || v_proveedor.zona);
        dbms_output.put_line('COMISIÓN: ' || v_proveedor.comision);
    -- Manejo de excepciones
    exception
        when no_data_found then
            dbms_output.put_line('No se econtró el proveedor en la base de datos');
    end mostrar_datos_proveedor;
begin
    mostrar_datos_proveedor (pedir_codigo_proveedor);
end;
/


/*
#########################################
############## EJERCICIO 7 ##############
#########################################

Crear un trigger que nos permita 
controlar si existe el proveedor y el 
artículo cuando insertemos un registro en 
la tabla de suministros.

*/
create or replace trigger trigger_suministros before insert on suministros for each row
declare
    -- Inicializar variables
    v_suministro suministros%rowtype;
    v_proveedor suministros.codarti%type;
    v_articulo suministros.codarti%type;
    
begin
    -- Consultar el código del proveedor
    select codprov into v_proveedor from proveedores where codprov = :new.codprov;
    
    -- Consultar el código del artículo
    select codarti into v_articulo from articulos where codarti = :new.codarti;
    
    -- Consultar el suministro con los códigos anteirores
    select * into v_suministro from suministros where codarti = :new.codarti and codprov = :new.codprov;
    
exception
    when no_data_found then
        dbms_output.put_line('LOS DATOS NO EXISTEN');
    when dup_val_on_index then
        dbms_output.put_line('LOS DATOS EXISTEN');
end;
/

-- Prueba del trigger
insert into suministros values (8, 3);
 

/*
#########################################
############## EJERCICIO 8 ##############
#########################################

Crear un trigger que almacene en la tabla 
de HISTORIAL_EMPLEADOS (que no existe) el 
usuario, la fecha y la operación que se ha 
realizado. El trigger se disparará cada 
vez que se realice una operación sobre la 
tabla de empleados.

*/

-- Primero creo la tabla
create table historial_empleados (
    usuario varchar2(100),
    fecha date,
    operacion varchar2(50)
);

-- Creación del trigger
create or replace trigger t_operacion_empleados after insert or update or delete on empleados for each row
declare
begin

    -- En caso de insertar
    if inserting then
        insert into historial_empleados values (:new.nombre, sysdate, 'INSERCIÓN');
    end if;
    
    -- En caso de actualizar 
    if updating then
        insert into historial_empleados values (:old.nombre, sysdate, 'ACTUALIZACIÓN');
    end if;
    
    -- En caso de borrar
    if deleting then
        insert into historial_empleados values (:old.nombre, sysdate, 'BORRADO');
    end if;
    
end;
/

-- Prueba de inserción
insert into empleados values (20, 'Empleado 20', 'Talavera', sysdate, 1000, 4, 17);

-- Prueba de actualización
update empleados
set poblacion = 'Sevilla'
where codemple = 20;

-- Prueba de borrado
delete from empleados where codemple = 20;

/*
#########################################
############## EJERCICIO 9 ##############
#########################################

Crear un trigger que se ejecute cuando 
modifiques el stock de un artículo, de tal 
forma que no pueda tomar valores negativos.

Si al realizar la modificación el campo stock 
tomara un valor negativo, le asignaremos 10 
unidades.

Si al realizar la modificación el campo stock 
el valor nuevo fuera menor que el valor que 
tenía anteriormente el campo no se realizará 
la modificación y se almacenará el stock que 
había anteriormente.

*/

-- Creación del trigger
create or replace trigger t_cambio_stock before update of stock on articulos for each row
declare
    
begin

    -- Comprobar si el nuevi stock es negativo
    if :new.stock < 0 then
        :new.stock := 10;
    else 
        -- Comprobar que el nuevo stock sea mayor que el antiguo, sino, lanza una excepcion
        if :new.stock < :old.stock then
            raise_application_error(-20001, 'No se puede introducir un stock menor al anterior');
        end if;
    end if;  
end;
/

-- Prueba de actualización de stock negativo
update articulos
set stock = 8
where codarti = 1;

/*
#########################################
############ EJERCICIO 10 ###############
#########################################

Crear un trigger que se ejecute cuando se 
realice un cambio de los datos de un 
empleado de tal forma que realice las 
siguientes comprobaciones sobre los nuevos 
datos del empleado:

a.	La fecha de alta del nuevo contrato del 
empleado debe ser mayor o igual a la fecha 
de hoy. En caso contrario, se le asignará 
la fecha de hoy.

b.	El salario debe ser mayor que 0 y mayor 
que el salario anterior. Si no es así, se le 
asignará un salario un 10% mayor del salario 
que tenía anteriormente.

c.	El código de almacén debe existir en la 
tabla de almacenes. Si el nuevo código de 
almacén no se existe le asignaremos el código 
que tenía anteriormente.

*/

create or replace trigger t_operacion_avanzada_empleados before update on empleados for each row
declare
    v_contador number(8) := 0;
begin
    
    -- a
    if :new.fechaalta < sysdate then
        :new.fechaalta := sysdate;
    end if;
    
    -- b
    if :new.salario < 0 or :new.salario < :old.salario then
        :new.salario := :old.salario + (:old.salario * 0.1);
    end if;
    
    -- c
    -- Contar el número de veces que aparece el almacén en la tabla almacenes
    select count(*) into v_contador
    from almacenes
    where codalma = :new.codalma;
    
    -- Si el contador es 0, no se ha encontrado el almacén, por lo que asignamos el antiguo código
    if v_contador = 0 then
        :new.codalma := :old.codalma;
    end if;
end;
/

-- Prueba para la fecha
update empleados
set fechaalta = sysdate-1
where codemple = 1;

-- Prueba para el salario
update empleados
set salario = 1000
where codemple = 1;

-- Prueba para el código de almacen
update empleados
set codalma = 9
where codemple = 1;















