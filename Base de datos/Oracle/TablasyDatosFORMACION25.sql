create table alumnos (
    dni       VARCHAR2(4),
    nombre    VARCHAR2(30),
    apellido1 VARCHAR2(30),
    apellido2 VARCHAR2(30),
    direcci�n VARCHAR2(50),
    sexo      VARCHAR2(2),
    fechanac  DATE,
    -- restricciones    
    CONSTRAINT pk_alumnos PRIMARY KEY (dni)
);

CREATE TABLE profesores (
    dni       VARCHAR2(4),
    nombre    VARCHAR(20),
    apellido1 VARCHAR2(20),
    apellido2 VARCHAR2(20),
    direcci�n VARCHAR2(50),
    t�tulo    VARCHAR(30),
    sueldo    INTEGER,
    -- restricciones    
    CONSTRAINT pk_profesores PRIMARY KEY (dni)    
);

CREATE TABLE cursos (
    c�digocurso VARCHAR2(5),
    nombrecurso VARCHAR2(40),
    maxalumnos  INTEGER,
    fechaini    DATE,
    fechafin    DATE,
    numhoras    INTEGER,
    profesor    VARCHAR2(4),
    -- restricciones    
    CONSTRAINT pk_cursos PRIMARY KEY (c�digocurso),
    CONSTRAINT fk_profesor FOREIGN KEY (profesor) REFERENCES profesores(dni)
);

CREATE TABLE matr�culas (
    dnialumno   VARCHAR2(4),
    codcurso    VARCHAR2(5),
    pruebaA     INTEGER,
    pruebaB     INTEGER,
    tipo        VARCHAR2(10),
    inscripci�n DATE,
    -- restricciones    
    CONSTRAINT pk_matriculas PRIMARY KEY (dnialumno, codcurso),
    CONSTRAINT fk_dnialumno FOREIGN KEY (dnialumno) REFERENCES alumnos (dni),
    CONSTRAINT fk_codcurso FOREIGN KEY (codcurso) REFERENCES cursos (c�digocurso),
    CONSTRAINT pruebaA_ok CHECK ( pruebaA BETWEEN 0 AND 50 ),
    CONSTRAINT pruebaB_ok CHECK ( pruebaB BETWEEN 0 AND 50 )
);

CREATE TABLE oposiciones (
    c�digo    VARCHAR2(6),
    nombre    VARCHAR2(30),
    fecexam   DATE,
    organismo VARCHAR2(50),
    plazas    INTEGER,
    categor�a VARCHAR2(1),
    -- restricciones    
    CONSTRAINT pk_oposiciones PRIMARY KEY (c�digo),
    CONSTRAINT categoria_ok CHECK ('A' <= categor�a and categor�a <= 'E')
);

CREATE TABLE curso_oposici�n (
    codcurso     VARCHAR2(4),
    codoposici�n VARCHAR2(6),
    -- restricciones    
    CONSTRAINT pk_curso_oposicion PRIMARY KEY (codcurso,codoposici�n),
    CONSTRAINT fk_codcursoop FOREIGN KEY (codcurso) REFERENCES cursos (c�digocurso),
    CONSTRAINT fk_codoposicion FOREIGN KEY (codoposici�n) REFERENCES oposiciones (c�digo)        
);

CREATE TABLE manuales (
    referencia VARCHAR2(5),
    t�tulo     VARCHAR2(50),
    autor      VARCHAR2(30),
    fechapub   DATE,
    precio     INTEGER,
    -- restricciones    
    CONSTRAINT pk_manuales PRIMARY KEY (referencia)    
);

CREATE TABLE curso_manual (
    codcurso    VARCHAR2(6),
    referencia  VARCHAR2(5),
    -- restricciones    
    CONSTRAINT pk_curso_manual PRIMARY KEY (codcurso, referencia),
    CONSTRAINT fk_codcursomanual FOREIGN KEY (codcurso) REFERENCES cursos (c�digocurso),
    CONSTRAINT fk_refcursomanual FOREIGN KEY (referencia) REFERENCES manuales (referencia)
);
INSERT INTO alumnos VALUES('1111','Carlos','Puerta','P�rez','c/ Paz, 21','V','12/09/1989');
INSERT INTO alumnos VALUES('2222','Luisa','S�nchez','Donoso','c/ Sierpes, 1','M','12/05/1998');
INSERT INTO alumnos VALUES('3333','Eva','Ramos','Prieto','c/ Rueda, 31','M','10/03/2000');
INSERT INTO alumnos VALUES('4444','Luis','P�ez','Garc�a','c/ Mart�n Villa, 21','V','10/04/1999');
INSERT INTO alumnos VALUES('5555','Ana','Padilla','Torres','c/ Tetu�n, 2','M','12/09/1998');
INSERT INTO alumnos VALUES('6666','Lola','Flores','Ru�z','c/ Real, 14','M','10/03/1996');

INSERT INTO profesores  VALUES('111','Manuel','L�pez','Garc�a','c/ Albeniz,12','Ingeniero de Caminos',2000);
INSERT INTO profesores  VALUES('222','Luis','P�rez','S�nchez','c/ Huelva, 1','Graduado en Psicolog�a',1400);
INSERT INTO profesores  VALUES('333','Ana','Garc�a','L�pez','c/ Sevilla,2','Ingeniero de Caminos',2200);
INSERT INTO profesores  VALUES('444','Eva','Parra','Ru�z','c/ Astoria,7','Graduado en Derecho',1200);
INSERT INTO profesores  VALUES('555','Federico','Flores','Alba','c/ Tarifa, 1','Ingeniero Inform�tico',2500);
INSERT INTO profesores  VALUES('666','Alberto','Moreno','Rodr�guez','c/ Parra, 2','Ingeniero de Caminos',2100);

INSERT INTO cursos VALUES('0001','Funci�n P�blica',120,'03/05/24','30/06/24',400,'444');
INSERT INTO cursos VALUES('0002','Psicolog�a del Desarrollo',180,'13/05/24','30/08/24',600,'222');
INSERT INTO cursos VALUES('0003','Puentes Infinitos',20,'03/12/24','30/06/24',800,'111');
INSERT INTO cursos VALUES('0004','Derecho Internacional',120,'03/05/24','30/06/24',400,'222');
INSERT INTO cursos VALUES('0005','Derecho Constitucional',230,'03/05/25','30/06/25',100,'444');
INSERT INTO cursos VALUES('0006','Programaci�n en Python',80,'03/09/24','30/09/24',30,'555');

INSERT INTO manuales  VALUES('M001', 'El Derecho y sus secretos', 'Garz�n', '12/05/16', 23);
INSERT INTO manuales  VALUES('M002', 'Python y Java: lo mismo es', 'Joseph Sunday','12/09/17', 12);
INSERT INTO manuales  VALUES('M003', 'Los delincuentes y sus sentimientos', 'El Chori','12/07/20', 16);
INSERT INTO manuales  VALUES('M004', 'Las Administraciones P�blicas', 'Ru�z','12/07/20', 8);
INSERT INTO manuales  VALUES('M005', 'Est�tica y Din�mica', 'Calatrava','02/05/22', 43);
INSERT INTO manuales  VALUES('M006', 'Problemas irresolubles en Python', 'John Tagua','07/07/22', 25);



INSERT INTO oposiciones VALUES('C-502','Maestros de Primaria','27/05/10','Consejer�a Educaci�n', 1220, 'B');
INSERT INTO oposiciones VALUES('C-512','Funcionarios de Prisiones','20/06/10','Consejer�a Justicia', 120, 'C');
INSERT INTO oposiciones VALUES('C-522','Profesores de Inform�tica','27/06/09','Consejer�a Educaci�n', 12, 'A');
INSERT INTO oposiciones VALUES('C-532','Jardineros del Estado','27/05/10','Ministerio Medio Ambiente', 10, 'D');
INSERT INTO oposiciones VALUES('C-542','Administrativos','27/05/10','Ayuntamiento DH', 12, 'C');
INSERT INTO oposiciones VALUES('C-552','Ingenieros del Ejercito','27/09/10','Ministerio Defensa', 120, 'A');

INSERT INTO matr�culas  VALUES('1111','0001',12,8,'Oficial','12/06/23');
INSERT INTO matr�culas  VALUES('1111','0005',18,5,'Oficial','12/07/23');
INSERT INTO matr�culas  VALUES('2222','0003',25,28,'Libre','12/08/23');
INSERT INTO matr�culas  VALUES('2222','0005',32,28,'Libre','12/09/23');
INSERT INTO matr�culas  VALUES('3333','0006',12,45,'Oficial','12/10/23');
INSERT INTO matr�culas  VALUES('4444','0006',18,15,'Oficial','12/11/23');
INSERT INTO matr�culas  VALUES('5555','0006',20,48,'Oficial','12/12/23');
INSERT INTO matr�culas  VALUES('5555','0002',32,38,'Libre','12/01/24');
INSERT INTO matr�culas  VALUES('5555','0003',11,18,'Oficial','12/02/24');
INSERT INTO matr�culas  VALUES('5555','0001',11,38,'Oficial','12/03/24');
INSERT INTO matr�culas  VALUES('5555','0005',42,48,'Oficial','12/04/24');

INSERT INTO curso_oposici�n VALUES('0001','C-502');
INSERT INTO curso_oposici�n VALUES('0001','C-512');
INSERT INTO curso_oposici�n VALUES('0001','C-522');
INSERT INTO curso_oposici�n VALUES('0001','C-532');
INSERT INTO curso_oposici�n VALUES('0001','C-542');
INSERT INTO curso_oposici�n VALUES('0001','C-552');
INSERT INTO curso_oposici�n VALUES('0002','C-502');
INSERT INTO curso_oposici�n VALUES('0003','C-552');
INSERT INTO curso_oposici�n VALUES('0004','C-512');
INSERT INTO curso_oposici�n VALUES('0006','C-522');
INSERT INTO curso_oposici�n VALUES('0005','C-502');
INSERT INTO curso_oposici�n VALUES('0005','C-512');
INSERT INTO curso_oposici�n VALUES('0005','C-522');
INSERT INTO curso_oposici�n VALUES('0005','C-532');
INSERT INTO curso_oposici�n VALUES('0005','C-542');

INSERT INTO curso_manual VALUES('0001','M001');
INSERT INTO curso_manual VALUES('0004','M001');
INSERT INTO curso_manual VALUES('0005','M001');
INSERT INTO curso_manual VALUES('0006','M002');
INSERT INTO curso_manual VALUES('0004','M003');
INSERT INTO curso_manual VALUES('0001','M004');
INSERT INTO curso_manual VALUES('0005','M004');
INSERT INTO curso_manual VALUES('0003','M005');
INSERT INTO curso_manual VALUES('0006','M006');
