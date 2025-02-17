
/*C.1*/
SELECT a.dni, a.nombre, a.apellido1, a.apellido2, a.fechanac,c.nombrecurso
from alumnos a 
join matrículas m on a.dni = m.DNIALUMNO
join cursos c on c.códigocurso = m.CODCURSO
where nombrecurso like '%Python%';

/*C.2*/
SELECT to_char(m.fechapub,'YYYY') "Año", count(m.referencia)"Cantidad de manuales"
from manuales m
group by to_char(m.fechapub,'YYYY')
order by 1;

/*C.3*/
SELECT to_char(m.fechapub,'YYYY') "Año", count(m.referencia)"Cantidad de manuales"
from manuales m
group by to_char(m.fechapub,'YYYY')
having count(m.referencia)= (SELECT max(count(m.referencia))
                            from manuales m 
                            group by to_char(m.fechapub,'YYYY'))
order by 1 desc; 

/*C.4*/
SELECT c.nombrecurso,c.fechaini,c.fechafin,p.Nombre ||' ' || p.apellido1 || ' ' || p.apellido2 "Profesor"
FROM cursos c
join profesores p on p.dni = c.profesor
WHERE to_char(c.fechafin, 'MM')= '08';

/*C.5*/
select c.nombrecurso
from cursos c
where c.numhoras> (SELECT avg(c.numhoras)
                    FROM cursos c)
order by 1;

/*C.6*/
SELECT m.título, m.precio || '€' "Precio", c.nombrecurso
FROM manuales m
join curso_manual cm on m.referencia = cm.referencia
join cursos c on c.códigocurso = cm.codcurso
where m.título like '%Python%';

/*C.7*/
SELECT c.nombrecurso, a.dni,a.nombre, a.apellido1,a.apellido2
FROM cursos c 
join matrículas m on c.códigocurso = m.codcurso
join alumnos a on a.dni = m.dnialumno
order by 1;

/*C.8*/
SELECT c.nombrecurso
FROM cursos c 
join matrículas m on c.códigocurso = m.codcurso
join alumnos a on a.dni = m.dnialumno
group by c.nombrecurso
HAVING COUNT(c.nombrecurso)>2;

 /*C.9*/
 SELECT a.nombre|| ' ' ||a.apellido1 || ' ' || a.apellido2 "Alumnos mayores de 26 años"
 FROM alumnos a
 where trunc((sysdate-a.fechanac)/365.25)>26;
 
 /*C.10*/
 SELECT p.dni, p.nombre,p.apellido1,p.apellido2,
 (p.sueldo*1.15)||' €' "Sueldo incrementado", COUNT(a.dni) "Cantidad de alumnos"
 FROM profesores p join cursos c on p.dni=c.profesor
 join matrículas m on c.códigocurso=m.codcurso
 join alumnos a on a.dni=m.dnialumno
 GROUP BY p.dni,p.nombre,p.apellido1,p.apellido2,(p.sueldo*1.15)
 having COUNT(a.dni)>=3;
 
 /*C.11*/
 SELECT a.nombre,a.apellido1,a.apellido2,m.codcurso
 FROM alumnos a left join matrículas m on a.dni=m.dnialumno
 where m.codcurso is null;
 
 /*C.12*/
 SELECT c.nombrecurso , m.dnialumno
 FROM cursos c left JOIN matrículas m on c.códigocurso=m.codcurso
 where m.dnialumno is null;
 
 /*C.13*/
 SELECT a.nombre,a.apellido1,a.apellido2,c.nombrecurso
 FROM alumnos a join matrículas m on a.dni=m.dnialumno
 right join cursos c on c.códigocurso=m.codcurso
 where a.nombre is null
 
 union 
 
 SELECT a.nombre,a.apellido1,a.apellido2,m.codcurso
 FROM alumnos a left join matrículas m on a.dni=m.dnialumno
 where m.codcurso is null
 ORDER by 1 desc;
 
 /*C.14*/
 