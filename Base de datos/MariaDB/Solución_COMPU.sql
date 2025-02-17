/* Solución BD COMPU*/

create database COMPU;
use COMPU;

create or replace table clientes(
	id tinyint auto_increment primary key,
	NIF char(9) unique,
	nombre varchar(30),	
	apellido1 varchar(20),
	apellido2 varchar(20),
	fecha_nacimiento date,
	tipo_via enum('Calle', 'Plaza', 'Avenida'),
	nom_via varchar (50),
	ciudad varchar(50),
	codigo_postal char (7),
	provincia varchar(30)
);

create or replace table telefonos_cliente(
	id_clientes tinyint,
	tel_clientes char(9),
	primary key(id_clientes,tel_clientes),
	constraint tel_cliente foreign key (id_clientes)
		references clientes(id)
		on delete cascade
		on update cascade
); 


create or replace table productos(
	id tinyint auto_increment primary key,
	stock smallint(3) unsigned check (stock <=500),
	descripcion text(500),
	precio decimal(10,2) unsigned,
	constraint min_precio check (precio>=5)
);

create or replace table proveedor(
	codigo tinyint auto_increment primary key,
	NIF char(9) unique,
	nombre varchar(30),
	apellido1 varchar(30),
	apellido2 varchar(30),
	teléfono char(9),
	tipo_via enum('Calle', 'Plaza', 'Avenida'),
	nombre_via varchar (50),
	codigo_postal char (7),
	localidad varchar(30),
	provincia varchar(30)
	
);

create or replace table suministra(
	cod_proveedor tinyint,
	id_productos tinyint,
	primary key(cod_proveedor,id_productos),
	constraint fk_proveedor foreign key (cod_proveedor)
		references proveedor(codigo)
		on delete cascade
		on update cascade,
	constraint fk_productos foreign key (id_productos)
		references productos(id)
		on delete cascade
		on update cascade
);


create or replace table compran(
	codigo_productos tinyint,
	id_clientes tinyint,
	fecha_compra date,
	primary key(codigo_productos,id_clientes),
	constraint fk_productos_compran foreign key (codigo_productos)
		references productos(id)
		on delete cascade
		on update cascade,
	constraint fk_clientes_compran foreign key (id_clientes)
		references clientes(id)
		on delete cascade
		on update cascade


);

INSERT into clientes(NIF, nombre, apellido1, apellido2, fecha_nacimiento, tipo_via, nom_via, ciudad, codigo_postal, provincia)values
('11111111A','Juan', 'Pérez', 'López', '2000-02-04', 'Calle', 'kkkkkkkkkkk', NULL, NULL, NULL),
('11111333A','Ana', 'kkkkk', 'Lópejkkj', '2000-07-04', 'Calle', 'kkkkkkkkkkk', NULL, NULL, NULL),
('22211111A','Manuel', 'eeeeee', 'López', '2000-02-04', 'Calle', 'kkkkkkkkkkk', NULL, NULL, NULL),
('33311111A','Luisa', 'eeeeee', 'López', '2001-02-04', 'Calle', 'kkkkkkkkkkk', NULL, NULL, NULL),
('55211111A','Luís Carlos', 'eeeeee', 'López', '2000-02-04', 'Calle', 'kkkkkkkkkkk', NULL, NULL, NULL);

INSERT INTO compu.telefonos_cliente (id_clientes, tel_clientes)values
(1, '954567876'),
(1, '600567876'),
(1, '957567876'),
(2, '689567876'),
(3, '670989099'),
(2, '954321321');


/*El proceso de borrado debe ser al contrario que el de creación:
drop table comprangts, suministragts, proveedorgts, productosgts, telefonos_clientesGTS, clientesgts ;*/

