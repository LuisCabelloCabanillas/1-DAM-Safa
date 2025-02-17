create database if not exists FRESAS;
use FRESAS;

create or replace table alumnos(
	NumMatricula Char(3) ,
	Nombre VarChar (15) ,
	Fecha Date ,
	primary key (NumMatricula)
);

# No tendrá foreign key
create or replace table profesores(
	IDProfesor Char (3),
	NIF_P Char (9) not null unique,
	Nombre VarChar(20) not null,
	Especialidad VarChar(15) DEFAULT 'Sin especificar',
	primary key (IDProfesor)
);

create or replace table asignaturas(
	CodAsign Char(3) ,
	Nombre ENUM ('Programación','Lenguajes de Marcas','Base de Datos','Sistemas Informáticos','Entornos de Desarrollo') not null ,
	IDProfesor Char(3),
	primary key (CodAsign) ,
	foreign key (IDProfesor)
		references profesores(IDProfesor)
);

create or replace table recibe(
	NumMatricula Char(3) ,
	CodAsign Char(3) ,
	CursoEsc Char(7) ,
	primary key (NumMatricula,CodAsign) ,
	foreign key (NumMatricula) 
		references alumnos(NumMatricula) ,
	foreign key (CodAsign) 
		references asignaturas(CodAsign)
);

create or replace table tel_alumnos(
	NumMatricula Char(3) ,
	Telefono Char(9) ,
	primary key (NumMatricula, Telefono) ,
	foreign key (NumMatricula)
		references alumnos(NumMatricula) 
);

create or replace table tel_profes(
	IDProfesor Char(3) ,
	Telefono Char(9) ,
	primary key (IDProfesor, Telefono) ,
	foreign key (IDProfesor)
		references profesores(IDProfesor)
);

