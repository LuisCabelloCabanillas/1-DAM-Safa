create database alumno1LCC;
use  alumLCC1_BD;

create table Profesor(
IDprofesor Char(3),
NIF CHAR(9),
Nombre VARCHAR(15),
Especialidad VARCHAR(20),
telefono char(9),
PRIMARY key (IDprofesor),
unique (NIF)
);

create table Alumno(
NumMatricula char(3),
Nombre Varchar(15),
Fecha_nacimineto Date,
PRIMARY KEY (NumMatricula)
);

create table Asignaturas(
CodAsignatura Char(3),
Nombre Varchar(15),
primary key (CodAsignatura),
foreign key (IDprofesor)
	references (IDprofesor)
);

create table Recibe (
CursoEscolar Varchar(10)
);

create table teleprofe(
Telefono char(9),
primary key (Telefono),
foreign key (IDprofesor)
	references profesor(IDprofesor)
);

create table telealum(
Telefono char(9),
primary key (telefono),
foreign key (NumMatricula)
	references alumno(NumMatricula)
);