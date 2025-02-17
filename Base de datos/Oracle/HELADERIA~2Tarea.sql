/*Consulta.1*/
Select p.nombre, sum(d.cantidad) "Nº de unidades pedidas"
from productos p join detalles_pedido d on p.id = d.id_producto
GROUP by p.nombre,d.id_producto
order by 2,1;

/*Consulta.2*/
SELECT DISTINCT c.nombre,c.dirección, c.cp, c.teléfono
from clientes c 
JOIN pedidos p on c.id =p.id_cliente
where p.fecha_pedido BETWEEN '01-02-2025' AND '28-02-2025';

/*Consulta.3*/
SELECT c.NOMBRE AS CLIENTE, q.NOMBRE AS HELADO
FROM CLIENTES c
JOIN PEDIDOS p ON c.ID = p.ID_CLIENTE
JOIN DETALLES_PEDIDO d ON p.ID = d.ID_PEDIDO
JOIN PRODUCTOS q ON d.ID_PRODUCTO = q.ID
Order by 1;

/*Consulta.4*/
SELECT c.nombre,c.dirección, c.teléfono,sum(d.cantidad)
from clientes c
Join pedidos p on c.id=p.id_cliente
Join detalles_pedido d on p.id= d.id_pedido
GROUP BY c.nombre, c.dirección, c.teléfono
HAVING sum(d.cantidad)=(SELECT max(sum(d.cantidad))
                        from pedidos p 
                        join detalles_pedido d on p.id =d.id_pedido
                        GROUP BY p.id_cliente);

/*Consulta.5*/
SELECT c.nombre, count(p.id_cliente)
from pedidos p
join clientes c on p.id_cliente=c.id
where p.id_cliente in (select p.id_cliente
                        from pedidos p
                        Join detalles_pedido d on p.id= d.id_pedido
                        GROUP BY p.id_cliente
                        HAVING sum(d.cantidad) = (SELECT max(sum(d.cantidad))
                                                from pedidos p 
                                                join detalles_pedido d on p.id =d.id_pedido
                                                GROUP BY p.id_cliente))
GROUP BY c.nombre;

/*Consulta.6*/
select id_producto, sum(cantidad)
from detalles_pedido
GROUP BY id_producto
having sum(cantidad) =(SELECT min(sum(d.cantidad))
                        from pedidos p
                        join detalles_pedido d on p.id =d.id_pedido
                        GROUP BY p.id_cliente);
                        
select nombre
from productos
where id in (select id_producto
from detalles_pedido
GROUP BY id_producto
having sum(cantidad) =(SELECT min(sum(d.cantidad))
                        from detalles_pedido d
                        GROUP BY p.id_producto));
                        
/*Consulta.7*/
SELECT c.nombre, sum(d.cantidad*pro.precio)|| '€'"Cantidad total a pagar"
FROM clientes c 
join pedidos p on c.id = p.id_cliente
join detalles_pedido d on p.id=d.id_pedido
join productos pro on d.id_producto=pro.id
where c.nombre ='&nombre_del_cliente'
group by c.nombre;




