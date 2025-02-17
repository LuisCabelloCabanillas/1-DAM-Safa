/*
create database viajamas2;
use viajamas;

create or replace table agencia(
	id tinyint AUTO_INCREMENT primary key,
	fec_inc date,
	telefono_ag char(9) unique not null,
	email varchar(40) unique not null,
	tipo_via enum('plaza', 'avenida', 'calle'),
	nombre_via varchar(30),
	numero varchar(4),
	planta varchar(4),
	codigo_postal char(6),
	localidad varchar(30),
	provincia varchar(30),
	pais varchar(15)
);

create or replace table banco(
	id tinyint AUTO_INCREMENT primary key,
	nombre varchar(20),
	sucursal varchar(20)
);

create or replace table empleados(
	id tinyint AUTO_INCREMENT primary key,
	dni_emp char(9) unique,
	id_agencia tinyint not null,
	nombre varchar(25),
	apellido1 varchar(25),
	apellido2 varchar(25),
	fec_nac date,
	sueldo decimal(6,2),
	tipo_via enum('plaza', 'avenida', 'calle'),
	nombre_via varchar(30),
	numero varchar(4),
	planta varchar(4),
	codigo_postal varchar(6),
	localidad varchar(30),
	provincia varchar(30),
	pais varchar(15),
	constraint idagencia foreign key (id_agencia)
		references agencia(id)
		
);

create or replace table telefono_empleados(
	telefono_emp char(9),
	id_empleado tinyint,
	primary key(telefono_emp,id_empleado),
	constraint tlf_emlpe foreign key (id_empleado)
		references empleados(id)
);

create or replace table email_empleados(
	email_emp varchar(100),
	id_empleado tinyint,
	primary key(email_emp,id_empleado),
	constraint email_e foreign key (id_empleado)
		references empleados(id)
);

create or replace table paquetes_turisticos(
	id tinyint AUTO_INCREMENT primary key,
	id_agencia tinyint not null,
	nombre varchar(30),
	fec_ini date,
	fec_fin date,	
	precio decimal(10,2),
	constraint paq_agen foreign key (id_agencia)
		references agencia(id)
);

create or replace table destinos_paquetes(
	destino varchar(25),
	id_paquete tinyint,
	primary key(destino,id_paquete),
	constraint desti_paq foreign key (id_paquete)
		references paquetes_turisticos(id)
);

create or replace table se_relacionan(
	id_paquete1 tinyint,
	id_paquete2 tinyint,
	primary key(id_paquete1,id_paquete2),
	constraint paq1 foreign key (id_paquete1)
		references paquetes_turisticos(id),
	constraint paq2 foreign key (id_paquete2)
		references paquetes_turisticos(id)	
);

create or replace table clientes(
	id tinyint AUTO_INCREMENT primary key,
	dni_clientes char(9) unique,
	nombre varchar(25),
	apellido1 varchar(25),
	apellido2 varchar(25),
	fec_nac date,
	tipo_via enum('plaza', 'avenida', 'calle'),
	nombre_via varchar(30),
	numero varchar(4),
	planta varchar(4),
	codigo_postal varchar(5),
	localidad varchar(30),
	provincia varchar(30),
	pais varchar(15),
	email_clientes varchar(20)
);

create or replace table telefono_clientes(
	telefono_client char(9),
	id_cliente tinyint,
	primary key(telefono_client,id_cliente),
	constraint tlf_c foreign key (id_cliente)
		references clientes(id)
);

create or replace table compran(
	id_paquete tinyint,
	id_cliente tinyint,
	primary key (id_paquete, id_cliente),
	constraint paquet foreign key (id_paquete)
		references paquetes_turisticos(id),
	constraint dnic foreign key (id_cliente)
		references clientes(id)
);

create or replace table formas_pago(
	id tinyint AUTO_INCREMENT primary key,
	id_banco tinyint not null,
	id_cliente tinyint not null,
	fec_val date,
	tipo_pago enum('bizum', 'tarjeta', 'metálico', 'transferencia'),
	constraint banco foreign key (id_banco)
		references banco(id),		
	constraint dnicli foreign key (id_cliente)
		references clientes(id)
		
);

*/