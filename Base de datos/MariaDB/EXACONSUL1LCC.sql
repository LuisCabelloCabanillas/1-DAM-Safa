/*Luis Cabello Cabanillas*/

/*Consulta nº1 */
select max(precio) 'PRECIO MÁXIMOLCC', min(precio) 'PRECIO MINIMO', 
avg(precio) 'PRECIO MEDIO', count(codigo_fabricante) 'Nº TOTAL DE PRODUCTOS DE CRUCIAL'
from producto
where codigo_fabricante = 6;

select max(precio) as 'Precio maximo', min(precio) as 'precio minimo', 
avg(precio) as 'precio medio', count(*) as 'Nº de productos crucial' 
from producto p 
where codigo_fabricante = (select codigo 
							from fabricante f 
							where nombre = 'Crucial');


/*Consulta nº2 */
select codigo_fabricante 'CÓDIGO FABRICANTELCC', max(precio) 'PRECIO MÁXIMO', min(precio) 'PRECIO MÍNIMO',
truncate(avg(precio),2) 'PRECIO MEDIO', count(*) 'Nº TOTAL PRODUCTOS FABRICANTES CON PRECIO MEDIO > 200€'
from producto
group by codigo_fabricante 
having avg(precio) > 200;


/*Consulta nº3 */
select nombre 'FabricanteLCC'
from fabricante
where codigo in (select codigo_fabricante
				 from producto
				 group by codigo_fabricante
				having sum(precio) >200)
order by codigo;


/*Consulta nº4 */
select codigo 'CÓDIGOLCC', NOMBRE, PRECIO, CODIGO_FABRICANTE
from producto
where precio < (select max(precio)
				from producto
				where codigo_fabricante = 2)
order by precio;

SELECT CODIGO AS "CÓDIGO", NOMBRE AS "NOMBRE", PRECIO, 
CODIGO_FABRICANTE AS "CÓDIGO DEL FABRICANTE" 
FROM PRODUCTO 
WHERE PRECIO < (SELECT MAX(PRECIO) 
FROM PRODUCTO 
WHERE CODIGO_FABRICANTE = (SELECT CODIGO 
							FROM FABRICANTE 
							WHERE NOMBRE = 'Lenovo')) 
order by precio;


/*Consulta nº5 */
select nombre 'NOMBRE FABRICANTES SIN PRODUCTOSLCC'
from fabricante
where codigo not in (select codigo_fabricante from producto);


/*Consulta nº6 */
select NOMBRE 'NOMBRELCC', PRECIO 
from producto 
where precio>100 and precio<200
order by precio;


/*Consulta nº7 */
select NOMBRE, (precio*100) 'CéntimosLCC'
from producto
order by precio;


/*Consulta nº8 */
select NOMBRE 'NOMBRELCC'
from producto 
where nombre like '%Full%';


/*Consulta nº9 */
select NOMBRE 'NOMBRELCC'
from fabricante
where char_length(nombre) = 7; 


/*Consulta nº10 */
select count(distinct (codigo_fabricante)) 'Nº DE CÓDIGOS DISTINTOSLCC'
from producto;