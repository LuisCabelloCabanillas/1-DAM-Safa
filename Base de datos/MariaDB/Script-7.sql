create or replace database datascraping;
use programación;

create or replace table datascraping.producto1(
	id int AUTO_INCREMENT primary key comment 'Clave primaria de la tabla',
	nombre varchar (50) not null comment 'Columna que almacena el nombre del producto',
	precio int not null comment 'Columna que almacena el precio',
	descripcion varchar(100) comment 'Columna que almacena la descripción',
	imagen varchar(100)comment 'Columna que almacena la imagen'
) comment 'tabla que almacena XXXX'

