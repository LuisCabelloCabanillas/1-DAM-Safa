/*BD INFOTIENDA*/

create database INFOTIENDA;
use INFOTIENDA;

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

-- INSERT para la tabla clientes (30 registros de Jaén, Sevilla y Málaga)
INSERT INTO clientes (NIF, nombre, apellido1, apellido2, fecha_nacimiento, tipo_via, nom_via, ciudad, codigo_postal, provincia)
VALUES
(null, 'Juan', 'García', 'López', '1985-06-15', 'Calle', 'Granada', 'Jaén', '23001', 'Jaén'),
(null, 'María', 'Fernández', 'Ruiz', '1990-03-21', 'Avenida', 'Sevilla', 'Jaén', '23002', 'Jaén'),
('34567890C', 'Antonio', 'Pérez', 'Martínez', '1978-12-05', 'Plaza', 'La Constitución', 'Jaén', '23003', 'Jaén'),
('45678901D', 'Lucía', 'Sánchez', 'Hernández', '1983-08-09', 'Calle', 'Real', 'Sevilla', '41001', 'Sevilla'),
('56789012E', 'Francisco', 'Jiménez', 'Ortiz', '1992-01-18', 'Avenida', 'Macarena', 'Sevilla', '41001', 'Sevilla'),
('67890123F', 'Carmen', 'López', 'Castro', '1987-11-30', 'Plaza', 'Encarnación', 'Sevilla', '41001', 'Sevilla'),
('78901234G', 'Miguel', 'Molina', 'Díaz', '1975-02-14', 'Calle', 'Larios', 'Málaga', '29001', 'Málaga'),
(null, 'Laura', 'Romero', 'Gómez', '1989-07-22', 'Avenida', 'Pacífico', 'Málaga', '29002', 'Málaga'),
('90123456I', 'José', 'González', 'Vargas', '1984-04-10', 'Plaza', 'Constitución', 'Málaga', '29005', 'Málaga'),
('01234567J', 'Rocío', 'Morales', 'Serrano', '1986-05-18', 'Calle', 'Alameda', 'Jaén', '23004', 'Jaén'),
('12345098K', 'Alejandro', 'Ramírez', 'Díaz', '1991-09-28', 'Avenida', 'Delicias', 'Jaén', '23005', 'Jaén'),
('23456109L', 'Isabel', 'González', 'Cano', '1988-02-16', 'Plaza', 'España', 'Jaén', '23006', 'Jaén'),
('34567210M', 'Carlos', 'Núñez', 'Vega', '1982-07-11', 'Calle', 'Granada', 'Sevilla', '41001', 'Sevilla'),
('45678321N', 'Ana', 'Castillo', 'Reyes', '1983-03-23', 'Avenida', 'Los Remedios', 'Sevilla', '41005', 'Sevilla'),
('56789432O', 'Raúl', 'Martínez', 'Sánchez', '1979-10-30', 'Plaza', 'Nueva', 'Sevilla', '41005', 'Sevilla'),
(null, 'Victoria', 'Hernández', 'Moreno', '1985-06-07', 'Calle', 'Mayor', 'Málaga', '29004', 'Málaga'),
('78901654Q', 'Pablo', 'Díaz', 'Ortega', '1994-08-01', 'Avenida', 'Andalucía', 'Málaga', '29005', 'Málaga'),
('89012765R', 'Clara', 'Luna', 'Giménez', '1987-04-17', 'Plaza', 'Marina', 'Málaga', '29006', 'Málaga'),
('90123876S', 'Alberto', 'Gil', 'Fernández', '1990-11-13', 'Calle', 'San Pedro', 'Jaén', '23007', 'Jaén'),
('01234987T', 'Beatriz', 'Martínez', 'Pérez', '1986-03-15', 'Avenida', 'Alcalá', 'Jaén', '23008', 'Jaén'),
('12345001U', 'Javier', 'Ruiz', 'López', '1993-05-26', 'Plaza', 'Universidad', 'Jaén', '23009', 'Jaén'),
('23456112V', 'Marta', 'Torres', 'Castro', '1995-06-21', 'Calle', 'Santander', 'Sevilla', '41008', 'Sevilla'),
('34567223W', 'David', 'Ortiz', 'Ramos', '1991-09-12', 'Avenida', 'Reina Mercedes', 'Sevilla', '41008', 'Sevilla'),
('45678334X', 'Sonia', 'Vargas', 'García', '1989-01-07', 'Plaza', 'Encarnación', 'Sevilla', '41008', 'Sevilla'),
('56789445Y', 'Adrián', 'Fernández', 'Jiménez', '1980-12-20', 'Calle', 'Mármoles', 'Málaga', '29007', 'Málaga'),
('67890556Z', 'Sara', 'Reyes', 'Navas', '1992-02-05', 'Avenida', 'Pacifico', 'Málaga', '29008', 'Málaga'),
('78901667A', 'Luis', 'Román', 'López', '1984-10-19', 'Plaza', 'De la Merced', 'Málaga', '29009', 'Málaga'),
('89012778B', 'Patricia', 'Castro', 'Fernández', '1985-12-03', 'Calle', 'Alameda', 'Málaga', '29010', 'Málaga'),
('90123889C', 'Fernando', 'Navarro', 'Serrano', '1996-07-25', 'Avenida', 'Carlos Haya', 'Málaga', '29011', 'Málaga');

-- INSERT para la tabla telefonos_clientes (40 registros)
INSERT INTO telefonos_cliente (id_clientes, tel_clientes)
VALUES
(1, '600123456'),
(2, '600654321'),
(2, '601234567'),
(2, '601765432'),
(3, '602345678'),
(4, '603456789'),
(5, '604567890'),
(6, '605678901'),
(7, '606789012'),
(8, '607890123'),
(9, '608901234'),
(10, '609012345'),
(11, '610123456'),
(12, '611234567'),
(11, '612345678'),
(11, '613456789'),
(15, '614567890'),
(16, '615678901'),
(17, '616789012'),
(18, '617890123'),
(18, '618901234'),
(20, '619012345'),
(20, '620123456'),
(22, '621234567'),
(22, '622345678'),
(24, '623456789'),
(25, '624567890'),
(26, '625678901'),
(27, '626789012'),
(28, '627890123'),
(29, '628901234'),
(1, '629012345'),
(1, '630123456'),
(3, '631234567'),
(3, '632345678'),
(4, '633456789'),
(5, '634567890'),
(6, '635678901'),
(7, '636789012'),
(8, '637890123'),
(9, '638901234'),
(10, '639012345');

-- INSERT para la tabla productos (20 registros)
INSERT INTO productos (stock, descripcion, precio)
VALUES
(50, 'Procesador Intel Core i5', 199.99),
(30, 'tarjeta gráfica NVIDIA RTX 3060', 399.99),
(100, 'Disco SSD 1TB', 89.99),
(75, 'Memoria RAM 16GB DDR4', 79.99),
(40, 'Placa base ASUS TUF Gaming', 159.99),
(25, 'Fuente de alimentación 650W', 69.99),
(60, 'Teclado mecánico RGB', 59.99),
(90, 'Ratón inalámbrico Logitech', 29.99),
(35, 'Monitor 24 pulgadas Full HD', 149.99),
(45, 'Auriculares gaming con micrófono', 49.99),
(80, 'Webcam HD 1080p', 39.99),
(55, 'Impresora multifunción', 99.99),
(20, 'Router WiFi 6', 129.99),
(65, 'Caja PC ATX', 79.99),
(85, 'Cargador USB-C', 19.99),
(50, 'Tarjeta de sonido externa', 89.99),
(70, 'Capturadora de video HDMI', 119.99),
(100, 'Memoria USB 64GB', 12.99),
(95, 'Hub USB 4 puertos', 24.99),
(110, 'Lámpara LED para escritorio', 29.99);

-- INSERT para la tabla proveedor (10 registros de localidades de Andalucía)
INSERT INTO proveedor (NIF, nombre, apellido1, apellido2, teléfono, tipo_via, nombre_via, codigo_postal, localidad, provincia)
VALUES
('11223344J', 'Sergio', 'Martín', 'García', '650987123', 'Calle', 'Alameda', '18001', 'Granada', 'Granada'),
('22334455K', 'Ana', 'Castillo', 'Fernández', '651234987', 'Avenida', 'Andalucía', '29004', 'Málaga', 'Málaga'),
('33445566L', 'Pedro', 'López', 'Pérez', '652987654', 'Plaza', 'España', '41004', 'Sevilla', 'Sevilla'),
('44556677M', 'María', 'Jiménez', 'Ortiz', '653456789', 'Calle', 'Real', 'Córdoba', '14001', 'Córdoba'),
('55667788N', 'José', 'Moreno', 'Vega', '654567890', 'Avenida', 'Libertad', 'Almería', '04001', 'Almería'),
('66778899O', 'Rosa', 'Hernández', 'Gómez', '655678901', 'Plaza', 'San Antonio', 'Cádiz', '11001', 'Cádiz'),
('77889900P', 'Manuel', 'Ruiz', 'Navarro', '656789012', 'Calle', 'Velázquez', 'Huelva', '21001', 'Huelva'),
('88990011Q', 'Elena', 'Martínez', 'López', '657890123', 'Avenida', 'La Palmera', 'Sevilla', '41012', 'Sevilla'),
('99001122R', 'Pablo', 'Castro', 'Méndez', '658901234', 'Plaza', 'De la Luz', 'Granada', '18002', 'Granada'),
('10111233S', 'Isabel', 'Luna', 'Serrano', '659012345', 'Calle', 'Mayor', 'Málaga', '29005', 'Málaga');

-- INSERT para la tabla suministra (40 registros)
INSERT INTO suministra (cod_proveedor, id_productos)
VALUES
(1, 1),
(1, 2),
(2, 3),
(2, 4),
(3, 5),
(3, 6),
(4, 7),
(4, 8),
(5, 9),
(5, 10),
(6, 11),
(6, 12),
(7, 13),
(7, 14),
(8, 15),
(8, 16),
(9, 17),
(9, 18),
(10, 19),
(10, 20),
(1, 3),
(2, 6),
(3, 9),
(4, 12),
(5, 15),
(6, 18),
(7, 2),
(8, 5),
(9, 8),
(10, 11),
(1, 14),
(2, 17),
(3, 20),
(4, 1),
(5, 4),
(6, 7),
(7, 10),
(8, 13),
(9, 16),
(10, 9);

-- INSERT para la tabla compran (60 registros)
INSERT INTO compran (codigo_productos, id_clientes, fecha_compra)
VALUES
(1, 1, '2024-01-01'),
(2, 1, '2024-01-02'),
(3, 2, '2024-01-03'),
(4, 2, '2024-02-04'),
(5, 3, '2024-02-05'),
(6, 3, '2024-05-06'),
(7, 4, '2024-05-07'),
(8, 4, '2024-05-08'),
(9, 5, '2024-06-09'),
(10, 5, '2024-07-10'),
(11, 6, '2024-07-11'),
(12, 6, '2024-07-12'),
(13, 7, '2024-07-13'),
(14, 7, '2024-07-14'),
(15, 8, '2024-03-15'),
(16, 8, '2024-03-16'),
(17, 9, '2024-03-17'),
(18, 9, '2024-04-18'),
(19, 10, '2024-04-19'),
(20, 10, '2024-04-20'),
(1, 11, '2024-04-21'),
(2, 11, '2024-05-22'),
(3, 12, '2024-06-23'),
(4, 12, '2024-08-24'),
(5, 13, '2024-08-25'),
(6, 13, '2024-08-26'),
(7, 14, '2024-09-27'),
(8, 14, '2024-09-28'),
(9, 15, '2024-09-29'),
(10, 15, '2024-09-30'),
(11, 16, '2024-09-30'),
(12, 16, '2024-12-01'),
(13, 17, '2024-12-02'),
(14, 17, '2024-12-03'),
(15, 18, '2024-12-04'),
(16, 18, '2024-12-05'),
(17, 19, '2024-12-06'),
(18, 19, '2024-12-07'),
(19, 20, '2024-12-08'),
(20, 20, '2024-12-09'),
(1, 21, '2024-12-10'),
(2, 21, '2024-12-11'),
(3, 22, '2024-12-12'),
(4, 22, '2024-12-13'),
(5, 23, '2024-01-14'),
(6, 23, '2024-01-15'),
(7, 24, '2024-02-16'),
(8, 24, '2024-02-17'),
(9, 25, '2024-02-18'),
(10, 25, '2024-12-19'),
(11, 26, '2024-12-20'),
(12, 26, '2024-11-21'),
(13, 27, '2024-11-22'),
(14, 27, '2024-11-23'),
(15, 28, '2024-10-24');