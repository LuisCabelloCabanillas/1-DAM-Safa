UPDATE citas c
SET veterinario_id = (SELECT v.id
                                    FROM veterinarios v 
                                    where v.nombre || ' ' ||v.apellido1 || ' ' || v.apellido2 = 'Mar�a Garc�a Mart�nez')
where c.veterinario_id = (select DISTINCT v.id
                                            from veterinarios v join citas c on v.id=c.veterinario_id
                                            where  v.nombre || ' ' ||v.apellido1 || ' ' || v.apellido2 = 'Ana P�rez Gonz�lez ') and c.fecha BETWEEN '1/04/25' and '30/04/25';

update tratamientos
SET precio = precio *0.98
WHERE precio = (SELECT max(precio)
                FROM tratamientos);

INSERT INTO mascotas VALUES ('31','Luna','06/12/2023', (select id
                                                                                                from especies
                                                                                                where nombre = 'Hamster'));


INSERT INTO tratamientos (id, nombre, precio)
SELECT 10 || id,  nombre || ' - Descuento', precio *0.80
FROM tratamientos
WHERE precio > 50;

select *
from tratamientos;

/*Consulta 6*/
insert into citas(cita_id,cliente_id,veterinario_id,mascota_id,fecha,hora,tratamiento_id)
values (88,(SELECT id from clientes 
where nombre|| ' ' ||apellido1 || ' ' || apellido2 = 'Diego Gonz�lez Fern�ndez'),
(SELECT id from veterinarios
where nombre|| ' ' ||apellido1 || ' ' || apellido2 = 'Carmen Fern�ndez L�pez'),
(SELECT id from mascotas where nombre = 'Shelly'),'18/03/2025','17:00',
(SELECT id from tratamientos where nombre = 'Radiograf�a'));


/*Consulta 7*/
create table cli_sincitas(
    Cita_ID NUMBER PRIMARY KEY,
    Cliente_ID NUMBER,
    Veterinario_ID NUMBER,
    Mascota_ID NUMBER,
    Fecha DATE NOT NULL,
    Hora varchar2(6) NOT NULL,
    Tratamiento_ID NUMBER,
    FOREIGN KEY (Cliente_ID) REFERENCES Clientes(ID),
    FOREIGN KEY (Veterinario_ID) REFERENCES Veterinarios(ID),
    FOREIGN KEY (Mascota_ID) REFERENCES Mascotas(ID),
    FOREIGN KEY (Tratamiento_ID) REFERENCES Tratamientos(ID)
);
