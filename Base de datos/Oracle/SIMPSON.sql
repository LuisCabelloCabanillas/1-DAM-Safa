/*1.*/
SELECT p.nombre,p.descripcion
FROM personajes p
where lower(p.descripcion) like lower('%Planta Nuclear%');

/*2.*/
SELECT 'Temporada nº: ' || t.numero_temporada "temporadas", t.año_lanzamiento, EXTRACT( year from SYSDATE)-t.año_lanzamiento || ' años' "Años desde su lanzamiento"
FROM temporadas t;

/*3.*/
SELECT 'Temporada nº: ' || t.numero_temporada "temporadas", t.cantidad_episodios
FROM temporadas t
where t.cantidad_episodios >(SELECT  round(sum(cantidad_episodios)/count(numero_temporada),2)
from temporadas)
order by 2;

/*4.*/
SELECT NOMBRE "CANCIONES",  TRUNC(DURACION_SEGUNDOS / 60) || 'min ' || MOD(DURACION_SEGUNDOS, 60) || 's'  "DURACIÓN"
FROM canciones
order by 2;

/*5.*/
select DISTINCT EXTRACT(year from e.fecha_emision) "Años", count(t.cantidad_episodios) "Cantidad de episodios"
from temporadas t
join episodios e on t.id=e.id_temporada
group by EXTRACT(year from e.fecha_emision)
HAVING COUNT (e.numero_episodio)>15;