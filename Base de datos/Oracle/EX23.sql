CREATE or REPLACE view vista_profesores as 
SELECT pe.nombre, pe.apellido1, pe.apellido2, pe.ciudad, pe.TELÉFONO, pe.fecha_nacimiento,
pe.sexo,pe.tipo,d.nombre as "Departamento"
from personas pe join profesor p on pe.id=p.id_profesor
join departamento d on d.id=p.id_departamento ;

select "Departamento", sexo, count(*) as "Cantidad profesores/as"
from vista_profesores
group by "Departamento", sexo
order by 1;