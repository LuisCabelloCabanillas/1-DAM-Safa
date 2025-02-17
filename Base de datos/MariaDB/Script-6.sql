/*CORRIGE LOS ERRORES. Para ello ejecuta instrucción a
 instrucción. Comprueba si genera bien el modelo lógico 
 o relacional.*/

CREATE DATABASE empleados2;
USE empleados2;

CREATE OR REPLACE TABLE comunidad_A(
	CodA CHAR(3) not null,
	NombreC VARCHAR(45),	
	PRIMARY KEY(CodA)
);

CREATE OR REPLACE TABLE Provincia(
	CodProvincia CHAR(3),
	NombreP VARCHAR(45),
	CodA CHAR (3) not null,
	PRIMARY KEY(CodProvincia),
	foreign key (CodA)
		references comunidad_A(CodA)
);

create or replace TABLE Localidad(
	CodLocalidad CHAR(3),	
	NombreL VARCHAR(45),	
	CodProvincia CHAR(3) not null,
	PRIMARY KEY(CodLocalidad),
	foreign key (CodProvincia)
		references Provincia(CodProvincia)
);


create or replace TABLE Empleado(
	ID INT AUTO_INCREMENT,	
	DNI CHAR(9),
	Telefono CHAR(9),
	Nombre VARCHAR(45),
	FechaNacimiento DATE,
	Salario DECIMAL(6,2),
	CodLocalidad CHAR(3) not null,
	PRIMARY KEY(ID),
	UNIQUE(DNI),	
	CONSTRAINT salar_600 CHECK (Salario >= 600),
	foreign key (CodLocalidad)
		references Localidad(CodLocalidad)
)



