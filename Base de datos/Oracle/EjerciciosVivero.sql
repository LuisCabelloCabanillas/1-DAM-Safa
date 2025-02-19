/*A los empleados que no son representantes de ventas se les quiere generar un código de
acceso, de 8 carácteres, necesario para una aplicación nueva que tienen que manejar. Ese
código estará formado por las dos primeras letras de su nombre en mayúscula y hasta
completar 8 caracteres se emplearán los símbolos ?!45. Consulta las funciones que tienes que
utilizar para generar el código en la página 233 y 234 del manual de ORACLE.
*/

SELECT e.nombre,e.apellido1,e.apellido2,e.puesto,RPAD(upper(SUBSTR(e.nombre,1,2)),8,'?!45') "Código acceso"
FROM empleado e
where e.puesto not like '%Ventas%' 
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