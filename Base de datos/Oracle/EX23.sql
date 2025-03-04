/*1*/
SELECT p.apellido1 || ' ' ||p.apellido2 || ', ' || p.nombre "Apellidos y Nombre del alumno/a PRR",  trunc((SYSDATE-p.fecha_nacimiento)/365.25) || ' años' "Edad"
FROM personas p
where p.tipo= 'alumno'
order by 2 desc,1;

/*2*/
SELECT a.tipo "tipo PRR", count(a.tipo)"Cantidad de asignaturas"
FROM asignatura a
GROUP BY a.tipo
having COUNT(*)>15;

/*3*/
SELECT DISTINCT p.nombre, p.apellido1,p.apellido2,c.año_inicio,c.año_fin
FROM  personas p  
join alumno_se_matricula_asignatura a on p.id=a.id_alumno
join curso_escolar c on a.id_curso_escolar=c.id
where c.año_inicio= 2022
order by 2;

/*4*/
SELECT p.nombre, p.apellido1,p.apellido2,p.nif,p.tipo
FROM personas p
where p.nif like '%G'
order by 1;

/*15*/
CREATE or REPLACE view vista_profesores as 
SELECT pe.nombre, pe.apellido1, pe.apellido2, pe.ciudad, pe.TELÉFONO, pe.fecha_nacimiento,
pe.sexo,pe.tipo,d.nombre as "Departamento"
from personas pe join profesor p on pe.id=p.id_profesor
join departamento d on d.id=p.id_departamento ;

/*16*/
select "Departamento", sexo, count(*) as "Cantidad profesores/as"
from vista_profesores
group by "Departamento", sexo
order by 1;