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
