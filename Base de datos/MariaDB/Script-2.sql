-- Diferentes formas de crear una Base de Datos.

CREATE DATABASE  bd_actividad1;
CREATE DATABASE IF NOT EXISTS bd_actividad1;

-- Para conectarme a la base de datos
USE bd_actividad1;

-- Otra forma de crear una BD
CREATE SCHEMA  bd_actividad2;
CREATE SCHEMA IF NOT EXISTS bd_actividad2;

-- Eliminar una base de datos
-- DROP {DATABASE | SCHEMA} [IF EXISTS] nombre_base_datos;
DROP DATABASE  bd_actividad2;
DROP SCHEMA  bd_actividad2;

DROP DATABASE IF EXISTS  bd_actividad2;
DROP SCHEMA if EXISTS bd_actividad2;

-- CREACIÓN DE TABLAS en la base de datos bd_actividad1
-- Hay que asegurarse que la BD está seleccionada.
USE bd_actividad1;

CREATE TABLE Alumno (
NumMatricula CHAR(3) ,
Nombre VARCHAR(15) ,
FechaNacimiento DATE ,
PRIMARY KEY (NumMatricula)
);

-- Esto es equivalente a borrar la tabla y volverla a crear
-- Es útil para añadir campos si la tabla no tiene datos almacenados
-- todavía.
CREATE OR REPLACE TABLE Alumno (
NumMatricula CHAR(3) ,
Nombre VARCHAR(15) ,
FechaNacimiento DATE ,
Teléfono CHAR(9) ,
PRIMARY KEY (NumMatricula)
);

-- Muestra las definición de la tabla
DESCRIBE alumno;

-- Ejemplo de añadir un campo sin borrar la tabla
ALTER TABLE alumno ADD fecha_matrícula DATE NOT NULL;

-- Borrar una tabla
-- DROP TABLE nombre_tabla;
-- DROP TABLE IF EXISTS nombre_tabla;
DROP TABLE alumno;

-- Para explicar las restricciones de UNIQUE y DEFAULT
-- Diapositiva 33
CREATE TABLE profesor(
IDProfesor CHAR (3),
NIF_P CHAR (9),
Nombre VARCHAR(20) ,
Especialidad VARCHAR(15) DEFAULT 'Sin especificar',
Teléfono CHAR(9) ,
PRIMARY KEY (IDProfesor),
UNIQUE (NIF_P)
);

-- Otra forma de crear la tabla CON LAS RESTRICCIONES
-- DE CAMPO EN LA DEFINICIÓN DE CAMPO.
CREATE OR REPLACE TABLE profesor(
IDProfesor CHAR (3) PRIMARY KEY,
NIF_P CHAR (9) UNIQUE ,
Nombre VARCHAR(20) ,
Especialidad VARCHAR(15) DEFAULT 'Sin especificar',
Teléfono CHAR(9) 
);

-- EXPLICAR EL 9 DE Nov
-- TABLA CON FK SIN ESPECIFICAR UN COMPORTAMIENTO
-- PARA ON DELETE Y ON CASCADE

CREATE TABLE Asignatura(
CodAsignatura CHAR (3) ,
Nombre VARCHAR (15) ,
IDProfesor CHAR(3),
PRIMARY KEY (CodAsignatura),
FOREIGN KEY (IDProfesor) 
   REFERENCES profesor(IDProfesor)
);
DESCRIBE asignatura;

CREATE OR REPLACE TABLE  Asignatura(
CodAsignatura CHAR (3) ,
Nombre ENUM ('Programación','Lenguajes de Marcas','Base de Datos','FOL','Sistemas Informáticos','Entornos de Desarrollo'),
IDProfesor CHAR(3),
PRIMARY KEY (CodAsignatura),
FOREIGN KEY (IDProfesor) 
   REFERENCES profesor(IDProfesor)
);
DESCRIBE asignatura;

-- Vamos a insertar estos datos
-- Comprobar la propiedad de unicidad de la PK
INSERT INTO profesor VALUES('P1','11111111R','Alex','Informática','999999999');
INSERT INTO profesor VALUES('P2','22222222D','María de los Ángeles','Informática','999999999');
INSERT INTO profesor VALUES('P3','33333331K','Jose Ignacio','Informática','999999999');
INSERT INTO profesor VALUES('P4','11111111L','Jose Carlos','Derecho','999999999');
INSERT INTO profesor VALUES('P5','11111771R','María José','Informática','999999999');
INSERT INTO profesor VALUES('P6','11211771R','Jose Márquez','Informática','999999999');
INSERT INTO profesor VALUES('P7','12111771R','Estrella','Informática','999999999');
INSERT INTO profesor VALUES('P8','21111771R','Alba','Informática','999999999');

SELECT * FROM profesor;
-- Comprobar la integridad referencial insertando un valor de FK que no exista.
-- Comprobar que no deja insertar un valor diferente al de la lista.
INSERT INTO asignatura VALUES ('A1','Programación','P1');
INSERT INTO asignatura VALUES ('A2','Lenguajes de Marcas','P1');
INSERT INTO asignatura VALUES ('A3','Base de Datos','P5');
INSERT INTO asignatura VALUES ('A4','FOL','P4');
INSERT INTO asignatura VALUES ('A5','Sistemas Informáticos','P2');
INSERT INTO asignatura VALUES ('A6','Entornos de Desarrollo','P4');

SELECT * FROM asignatura;

-- Mostrar el listado de los nombres de los profesores junto con las asignaturas que imparten.
SELECT a.nombre "Asignatura", p.nombre "Profesor"
FROM asignatura a JOIN profesor p ON a.IDProfesor=p.idprofesor;

-- PROPIEDAD DE INTEGRIDAD REFERENCIAL
-- Borro un profesor. ¿Podemos borrarlo?
DELETE from profesor WHERE idprofesor='P1';

-- Tenemos que borrar primero sus registros referenciados en la tabla asignatura
DELETE from asignatura WHERE idprofesor='P1';

-- ¿Cómo podemos automatizarlo?
-- ACTIVANDO EL BORRADO EN CASCADA EN LA FK.
-- SI NO QUEREMOS QUE SE BORREN LAS ASIGNATURAS PORQUE NO ES DÉBIL POR EXISTENCIA 
-- ACTIVAMOS EL SET NULL
-- COMPROBAMOS LA ACTUALIZACIÓN EN CASCADA.
UPDATE PROFESOR SET IDProfesor = 'P7' WHERE IDProfesor = 'P1';

-- TABLA CON  FK ESPECIFICANDO UN COMPORTAMIENTO
-- PARA ON DELETE Y ON CASCADE y asignatura como tipo de dato
-- una lista de valores y una restricción de tipo CHECK.
CREATE OR REPLACE TABLE Asignatura( 
CodAsignatura CHAR (3) ,
Nombre ENUM ('Programación','Lenguajes de Marcas','Base de Datos','FOL','Sistemas Informáticos','Entornos de Desarrollo'),
numalumnos INT CHECK (numalumnos <=30),
IDProfesor CHAR (3) ,
PRIMARY KEY (CodAsignatura),
CONSTRAINT FK1 FOREIGN KEY (IDProfesor) 
   REFERENCES profesor(IDProfesor)
   ON DELETE CASCADE
   ON UPDATE CASCADE
);
DESCRIBE asignatura;
SELECT * FROM asignatura;

-- TABLA CON NOMBRE EN LAS RESTRICCIONES 

CREATE OR REPLACE TABLE Asignatura( 
CodAsignatura CHAR (3) ,
Nombre ENUM ('Programación','Lenguajes de Marcas','Base de Datos','FOL','Sistemas Informáticos','Entornos de Desarrollo'),
numalumnos INT ,
IDProfesor CHAR (3),
PRIMARY KEY (CodAsignatura),
CONSTRAINT numalu CHECK (numalumnos <=30),
CONSTRAINT FK1 FOREIGN KEY (IDProfesor) 
   REFERENCES profesor(IDProfesor)
   ON DELETE CASCADE
   ON UPDATE CASCADE
);

-- EXPLICAR LA REGLA DE INTEGRIDAD REFERENCIAL
-- Orden de borrado incorrecto con la opción RESTRICT activada
DROP TABLE profesor;
DROP TABLE asignatura;

-- Orden de borrado correcto con la opción RESTRICT activada.
DROP TABLE asignatura;
DROP TABLE profesor;


DESCRIBE asignatura;
DESCRIBE profesor;

SELECT * FROM profesor;



select @@GLOBAL.sql_mode;



