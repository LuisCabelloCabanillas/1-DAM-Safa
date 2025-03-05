/*Luis Cabello Cabanillas*/

/*Consulta 1*/
SELECT COUNT(t.id) "Número de tratamientos LCC",min(t.precio) || ' €' "Precio mínimo",max(t.precio) || ' €' "Precio máximo", avg(t.precio) || ' €' "Precio medio"
FROM tratamientos t;

/*Consulta 2*/
SELECT m.nombre "MASCOTA LCC", t.precio || ' €' "PRECIO", t.nombre "TRATAMIENTO"
FROM mascotas m 
join citas c on m.id = c.mascota_ID
join tratamientos t on t.id = c.tratamiento_ID
where c.fecha BETWEEN '01/03/25' and '31/03/25' and t.precio =(SELECT min(t.precio)
FROM tratamientos t);

/*Consulta 3*/
SELECT v.nombre || ' ' || v.apellido1 || ' ' || v.apellido2 "Veterinario LCC", count(c.cita_id) "Nºde citas"
FROM veterinarios v join citas c on  v.id=c.veterinario_id
group by v.nombre || ' ' || v.apellido1 || ' ' || v.apellido2
having COUNT(c.cita_id)>12
order by reverse(v.nombre || ' ' || v.apellido1 || ' ' || v.apellido2)desc;

/*Consulta 4*/
SELECT v.nombre"Nombre LCC",v.apellido1,v.apellido2,m.nombre,c.fecha,t.nombre"Tratamiento"
FROM veterinarios v join citas c on v.id=c.veterinario_id
join tratamientos t on t.id=c.tratamiento_ID
join mascotas m on m.id=c.mascota_id
where v.nombre = 'Laura'
order by 1,5 ;

/*Consulta 5*/
SELECT c.apellido1|| ' ' ||c.apellido2|| ', ' ||c.nombre "Nombre_Cliente LCC", sum(t.precio)||' €' "Total a pagar"
FROM clientes c join citas ci on c.id=ci.cliente_id
join tratamientos t on t.id=ci.tratamiento_id
group by c.apellido1|| ' ' ||c.apellido2|| ', ' ||c.nombre
having sum(t.precio)>500
order by 1 ;

/*Consulta 6*/
SELECT e.nombre "Especie LCC",m.nombre "Mascota", c.cita_id
FROM especies e join mascotas m on e.id=m.especie_id
left join citas c on m.id = c.mascota_id
where c.cita_id is null
order by 1;

/*Consulta 7*/
Create or replace view vLCC as
SELECT v.nombre "Vnombre LCC",v.apellido1"Vape1",v.apellido2"Vape2",c.nombre,c.apellido1,c.apellido2,c.teléfono,ci.fecha,ci.hora,tra.nombre"Tratamiento",tra.precio
FROM veterinarios v join citas ci on v.id =ci.veterinario_id
join clientes c on c.id=ci.cliente_id
join tratamientos tra on tra.id=ci.tratamiento_id;

/*Consulta 8*/
SELECT "Vnombre LCC","Vape1","Vape2",nombre,apellido1,apellido2,teléfono,fecha,hora,"Tratamiento",precio
FROM VLCC 
where fecha BETWEEN '01/05/25' and '31/05/25' and "Tratamiento" in ('Vacuna','Control de peso','Corte de uñas')
order by fecha,hora;

/*Consulta 9*/
SELECT "Tratamiento", count("Tratamiento") "Nº de citas LCC"
FROM vlcc
group by "Tratamiento"
having count("Tratamiento") = (SELECT MAX(COUNT("Tratamiento"))
                                                        FROM vlcc
                                                        group by "Tratamiento")
Order by 1;

