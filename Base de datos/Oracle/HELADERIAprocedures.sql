SET SERVEROUTPUT ON

/*CREATE OR REPLACE PROCEDURE clientes_pedido (num CHAR) AS 
    regemple clientes%ROWTYPE;
    gastos NUMBER; 

BEGIN
    SELECT c.nombre, 
           SUM(d.cantidad * pro.precio) 
    INTO regemple.nombre, gastos
    FROM clientes c
    JOIN pedidos p ON c.id = p.id_cliente
    JOIN detalles_pedido d ON p.id = d.id_pedido
    JOIN productos pro ON d.id_producto = pro.id
    WHERE c.id = num 
    GROUP BY c.nombre;  
    dbms_output.put_line('Nombre: ' || regemple.nombre);
    dbms_output.put_line('Gastos en compras: ' || gastos || ' €');
    
END;
/

exec clientes_pedido(10);*/
/*
CREATE OR REPLACE PROCEDURE clientes_pedido2 (codigo clientes.id%type) AS 
    nombre clientes.nombre%TYPE;
    precio NUMBER; 
    
BEGIN
    SELECT c.nombre,sum(d.cantidad*pr.precio) into nombre, precio
    FROM clientes c JOIN pedidos pe ON c.id = pe.id_cliente JOIN detalles_pedido d 
    ON pe.id = d.id_pedido JOIN productos pr ON d.id_producto = pr.id
    where c.id=codigo
    group by c.nombre;
    
    dbms_output.put_line('Nombre: ' || nombre);
    dbms_output.put_line('Gastos en compras: ' || precio || ' €');
end;
/

exec clientes_pedido2(10);
*/

create or replace procedure p_p_c (numero productos.id%type) AS 
    nombre productos.nombre%type;
    precio productos.precio%type;
    unidades number;
    
begin
    SELECT p.nombre, p.precio into nombre,precio
    FROM productos p
    where p.id=numero;
    
    SELECT sum(d.cantidad) into unidades
    FROM detalles_pedido d
    where d.id_producto=numero;
    
    dbms_output.put_line('Nombre del producto: ' || nombre);
    dbms_output.put_line('Precio del producto: ' || precio || ' €');
    dbms_output.put_line('Número de compras: ' || unidades || ' ' ||Sysdate);
end;
/

exec p_p_c(1);




SELECT p.nombre, p.precio, sum(d.cantidad)
FROM productos p join detalles_pedido d on p.id=d.id_producto
where p.id=1
group by p.nombre,p.precio;





















