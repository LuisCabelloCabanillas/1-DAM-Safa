create database alumno1LCC;
use  alumLCC1_BD;

create or replace table Profesor(
IDprofesor Char(3),
NIF CHAR(9),
Nombre VARCHAR(15),
Especialidad VARCHAR(20),
PRIMARY key (IDprofesor),
unique (NIF)
);

create or replace table Alumnos(
NumMatricula char(3),
Nombre Varchar(15),
Fecha_nacimineto Date,
PRIMARY KEY (NumMatricula)
);

create or replace table Asignaturas(
CodAsignatura Char(3),
Nombre Varchar(15) ENUM ('progrmacion, Lenguaje de marcas, base de datos') not null,
IDprofesor char(3),
primary key (CodAsignatura),
foreign key (IDprofesor)
	references Profesor(IDprofesor)
);

create or replace table Recibe (
NumMatricula char(3),
CodAsignatura Char(3),
CursoEscolar Char(10),
primary key (NumMatricula, CodAsignatura),
foreign key (NumMatricula)
	references Alumnos(NumMatricula),
foreign key (CodAsignatura)
	references Asignaturas(CodAsignatura)
);


create or replace table teleprofe(
IDprofesor Char(3),
Telefono char(9),
primary key (Telefono),
foreign key (IDprofesor)
	references Profesor(IDprofesor)
);

create or replace table telealum(
NumMatricula char(3),
Telefono char(9),
primary key (telefono),
foreign key (NumMatricula)
	references Alumnos(NumMatricula)
)