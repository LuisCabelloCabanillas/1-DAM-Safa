/*A los empleados que no son representantes de ventas se les quiere generar un código de
acceso, de 8 carácteres, necesario para una aplicación nueva que tienen que manejar. Ese
código estará formado por las dos primeras letras de su nombre en mayúscula y hasta
completar 8 caracteres se emplearán los símbolos ?!45. Consulta las funciones que tienes que
utilizar para generar el código en la página 233 y 234 del manual de ORACLE.
*/

SELECT e.nombre,e.apellido1,e.apellido2,e.puesto,RPAD(upper(SUBSTR(e.nombre,1,2)),8,'?!45') "Código acceso"
FROM empleado e
where e.puesto not like '%Representante Ventas%' 
ORDER BY 1;

/*Cantidad de clientes que son de Spain.*/
SELECT c.pais, COUNT(c.pais) "Cantidad de clientes"
FROM cliente c
group by c.pais
having c.pais = 'Spain';

/*Cuenta la cantidad de pedidos no entregados a tiempo. Asigna el alias que ves en la imagen.*/
SELECT COUNT(p.fecha_entrega) "Cantidad de pedidos no entregados a tiempo"
FROM pedido p
where p.fecha_entrega>p.fecha_esperada;

/*Nombre de los clientes que hayan realizado pagos junto con el nombre de sus 
Representantes de Ventas*/
SELECT DISTINCT c.nombre_cliente,e.puesto,e.nombre,e.apellido1,e.apellido2
FROM empleado e join cliente c on c.CODIGO_EMPLEADO_REP_VENTAS= e.codigo_empleado
join pago p on p.codigo_cliente=c.codigo_cliente
where e.puesto like '%Representante Ventas%' and p.codigo_cliente is not null
order by 4;

/*Nombre de los clientes que han hecho pagos y el nombre de sus Representantes de Ventas
junto con la ciudad de la oficina a la que pertenece el representante de Ventas.*/
SELECT c.nombre_cliente,e.puesto,e.nombre,e.apellido1,e.apellido2,c.ciudad
FROM empleado e join cliente c on c.CODIGO_EMPLEADO_REP_VENTAS= e.codigo_empleado
join pago p on p.codigo_cliente=c.codigo_cliente
where e.puesto like '%Representante Ventas%' and p.codigo_cliente is not null
order by 4,5,1;

/*Dirección de las oficinas que tengan clientes en Fuenlabrada.*/
SELECT o.ciudad, o.pais,o.region,o.codigo_postal,o.linea_direccion1,o.linea_direccion2
FROM oficina o natural join empleado e
join cliente c on c.codigo_empleado_rep_ventas=e.codigo_empleado
WHERE c.ciudad like 'Fuenlabrada';

/* Nombre de los clientes a los que no se les ha entregado a tiempo un pedido. ¿Puedes hacerlo
con natural join? SI*/
SELECT c.nombre_cliente
FROM pedido p
join cliente c on p.CODIGO_CLIENTE=c.CODIGO_CLIENTE
where p.fecha_entrega>p.fecha_esperada
order by 1;

/*Listado de las diferentes gamas de producto que ha comprado cada cliente*/
SELECT distinct p.gama
FROM producto p
natural join detalle_pedido d;

/* Listado que muestre solamente los clientes que NO han realizado ningún pago.*/
SELECT c.nombre_cliente
from cliente c
left JOIN pago p on c.codigo_cliente=p.codigo_cliente
where p.codigo_cliente is null
order by 1;

/*Listado de los productos que todavía no están siendo pedidos.*/
select distinct p.nombre
from producto p left join detalle_pedido dp on p.codigo_producto=dp.codigo_producto
where dp.codigo_producto is null
order by 1;

/*Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de los
pedidos.*/
select codigo_pedido, sum(cantidad)
from detalle_pedido 
group by codigo_pedido;

/*Clientes cuyo límite de crédito sea mayor que los pagos que haya realizado, junto con el límite
de crédito disponible.*/
select cliente.nombre_cliente, cliente.limite_credito||' €'"Limite de credito",sum(total)||' €'"Cantidad pagada",limite_credito-sum(total)||' €' "Crédito disponible"
from cliente natural join pago 
group by cliente.nombre_cliente,cliente.limite_credito
having (sum(total))<limite_credito
order by 1;

SELECT em.nombre, e.nombre "Nombre Jefe"
from empleado e join empleado em on e.codigo_jefe=em.codigo_empleado
order by 1;

