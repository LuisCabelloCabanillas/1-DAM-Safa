
/*C.1*/
SELECT a.dni, a.nombre, a.apellido1, a.apellido2, a.fechanac,c.nombrecurso
from alumnos a 
join matr�culas m on a.dni = m.DNIALUMNO
join cursos c on c.c�digocurso = m.CODCURSO
where nombrecurso like '%Python%';

/*C.2*/
SELECT to_char(m.fechapub,'YYYY') "A�o", count(m.referencia)"Cantidad de manuales"
from manuales m
group by to_char(m.fechapub,'YYYY')
order by 1;

/*C.3*/
SELECT to_char(m.fechapub,'YYYY') "A�o", count(m.referencia)"Cantidad de manuales"
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
SELECT m.t�tulo, m.precio || '�' "Precio", c.nombrecurso
FROM manuales m
join curso_manual cm on m.referencia = cm.referencia
join cursos c on c.c�digocurso = cm.codcurso
where m.t�tulo like '%Python%';

/*C.7*/
SELECT c.nombrecurso, a.dni,a.nombre, a.apellido1,a.apellido2
FROM cursos c 
join matr�culas m on c.c�digocurso = m.codcurso
join alumnos a on a.dni = m.dnialumno
order by 1;

/*C.8*/
SELECT c.nombrecurso
FROM cursos c 
join matr�culas m on c.c�digocurso = m.codcurso
join alumnos a on a.dni = m.dnialumno
group by c.nombrecurso
HAVING COUNT(c.nombrecurso)>2;

 /*C.9*/
 SELECT a.nombre|| ' ' ||a.apellido1 || ' ' || a.apellido2 "Alumnos mayores de 26 a�os"
 FROM alumnos a
 where trunc((sysdate-a.fechanac)/365.25)>26;