create table alumnos (
    dni       VARCHAR2(4),
    nombre    VARCHAR2(30),
    apellido1 VARCHAR2(30),
    apellido2 VARCHAR2(30),
    dirección VARCHAR2(50),
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
    dirección VARCHAR2(50),
    título    VARCHAR(30),
    sueldo    INTEGER,
    -- restricciones    
    CONSTRAINT pk_profesores PRIMARY KEY (dni)    
);

CREATE TABLE cursos (
    códigocurso VARCHAR2(5),
    nombrecurso VARCHAR2(40),
    maxalumnos  INTEGER,
    fechaini    DATE,
    fechafin    DATE,
    numhoras    INTEGER,
    profesor    VARCHAR2(4),
    -- restricciones    
    CONSTRAINT pk_cursos PRIMARY KEY (códigocurso),
    CONSTRAINT fk_profesor FOREIGN KEY (profesor) REFERENCES profesores(dni)
);

CREATE TABLE matrículas (
    dnialumno   VARCHAR2(4),
    codcurso    VARCHAR2(5),
    pruebaA     INTEGER,
    pruebaB     INTEGER,
    tipo        VARCHAR2(10),
    inscripción DATE,
    -- restricciones    
    CONSTRAINT pk_matriculas PRIMARY KEY (dnialumno, codcurso),
    CONSTRAINT fk_dnialumno FOREIGN KEY (dnialumno) REFERENCES alumnos (dni),
    CONSTRAINT fk_codcurso FOREIGN KEY (codcurso) REFERENCES cursos (códigocurso),
    CONSTRAINT pruebaA_ok CHECK ( pruebaA BETWEEN 0 AND 50 ),
    CONSTRAINT pruebaB_ok CHECK ( pruebaB BETWEEN 0 AND 50 )
);

CREATE TABLE oposiciones (
    código    VARCHAR2(6),
    nombre    VARCHAR2(30),
    fecexam   DATE,
    organismo VARCHAR2(50),
    plazas    INTEGER,
    categoría VARCHAR2(1),
    -- restricciones    
    CONSTRAINT pk_oposiciones PRIMARY KEY (código),
    CONSTRAINT categoria_ok CHECK ('A' <= categoría and categoría <= 'E')
);

CREATE TABLE curso_oposición (
    codcurso     VARCHAR2(4),
    codoposición VARCHAR2(6),
    -- restricciones    
    CONSTRAINT pk_curso_oposicion PRIMARY KEY (codcurso,codoposición),
    CONSTRAINT fk_codcursoop FOREIGN KEY (codcurso) REFERENCES cursos (códigocurso),
    CONSTRAINT fk_codoposicion FOREIGN KEY (codoposición) REFERENCES oposiciones (código)        
);

CREATE TABLE manuales (
    referencia VARCHAR2(5),
    título     VARCHAR2(50),
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
    CONSTRAINT fk_codcursomanual FOREIGN KEY (codcurso) REFERENCES cursos (códigocurso),
    CONSTRAINT fk_refcursomanual FOREIGN KEY (referencia) REFERENCES manuales (referencia)
);
INSERT INTO alumnos VALUES('1111','Carlos','Puerta','Pérez','c/ Paz, 21','V','12/09/1989');
INSERT INTO alumnos VALUES('2222','Luisa','Sánchez','Donoso','c/ Sierpes, 1','M','12/05/1998');
INSERT INTO alumnos VALUES('3333','Eva','Ramos','Prieto','c/ Rueda, 31','M','10/03/2000');
INSERT INTO alumnos VALUES('4444','Luis','Páez','García','c/ Martín Villa, 21','V','10/04/1999');
INSERT INTO alumnos VALUES('5555','Ana','Padilla','Torres','c/ Tetuán, 2','M','12/09/1998');
INSERT INTO alumnos VALUES('6666','Lola','Flores','Ruíz','c/ Real, 14','M','10/03/1996');

INSERT INTO profesores  VALUES('111','Manuel','López','García','c/ Albeniz,12','Ingeniero de Caminos',2000);
INSERT INTO profesores  VALUES('222','Luis','Pérez','Sánchez','c/ Huelva, 1','Graduado en Psicología',1400);
INSERT INTO profesores  VALUES('333','Ana','García','López','c/ Sevilla,2','Ingeniero de Caminos',2200);
INSERT INTO profesores  VALUES('444','Eva','Parra','Ruíz','c/ Astoria,7','Graduado en Derecho',1200);
INSERT INTO profesores  VALUES('555','Federico','Flores','Alba','c/ Tarifa, 1','Ingeniero Informático',2500);
INSERT INTO profesores  VALUES('666','Alberto','Moreno','Rodríguez','c/ Parra, 2','Ingeniero de Caminos',2100);

INSERT INTO cursos VALUES('0001','Función Pública',120,'03/05/24','30/06/24',400,'444');
INSERT INTO cursos VALUES('0002','Psicología del Desarrollo',180,'13/05/24','30/08/24',600,'222');
INSERT INTO cursos VALUES('0003','Puentes Infinitos',20,'03/12/24','30/06/24',800,'111');
INSERT INTO cursos VALUES('0004','Derecho Internacional',120,'03/05/24','30/06/24',400,'222');
INSERT INTO cursos VALUES('0005','Derecho Constitucional',230,'03/05/25','30/06/25',100,'444');
INSERT INTO cursos VALUES('0006','Programación en Python',80,'03/09/24','30/09/24',30,'555');

INSERT INTO manuales  VALUES('M001', 'El Derecho y sus secretos', 'Garzón', '12/05/16', 23);
INSERT INTO manuales  VALUES('M002', 'Python y Java: lo mismo es', 'Joseph Sunday','12/09/17', 12);
INSERT INTO manuales  VALUES('M003', 'Los delincuentes y sus sentimientos', 'El Chori','12/07/20', 16);
INSERT INTO manuales  VALUES('M004', 'Las Administraciones Públicas', 'Ruíz','12/07/20', 8);
INSERT INTO manuales  VALUES('M005', 'Estática y Dinámica', 'Calatrava','02/05/22', 43);
INSERT INTO manuales  VALUES('M006', 'Problemas irresolubles en Python', 'John Tagua','07/07/22', 25);



INSERT INTO oposiciones VALUES('C-502','Maestros de Primaria','27/05/10','Consejería Educación', 1220, 'B');
INSERT INTO oposiciones VALUES('C-512','Funcionarios de Prisiones','20/06/10','Consejería Justicia', 120, 'C');
INSERT INTO oposiciones VALUES('C-522','Profesores de Informática','27/06/09','Consejería Educación', 12, 'A');
INSERT INTO oposiciones VALUES('C-532','Jardineros del Estado','27/05/10','Ministerio Medio Ambiente', 10, 'D');
INSERT INTO oposiciones VALUES('C-542','Administrativos','27/05/10','Ayuntamiento DH', 12, 'C');
INSERT INTO oposiciones VALUES('C-552','Ingenieros del Ejercito','27/09/10','Ministerio Defensa', 120, 'A');

INSERT INTO matrículas  VALUES('1111','0001',12,8,'Oficial','12/06/23');
INSERT INTO matrículas  VALUES('1111','0005',18,5,'Oficial','12/07/23');
INSERT INTO matrículas  VALUES('2222','0003',25,28,'Libre','12/08/23');
INSERT INTO matrículas  VALUES('2222','0005',32,28,'Libre','12/09/23');
INSERT INTO matrículas  VALUES('3333','0006',12,45,'Oficial','12/10/23');
INSERT INTO matrículas  VALUES('4444','0006',18,15,'Oficial','12/11/23');
INSERT INTO matrículas  VALUES('5555','0006',20,48,'Oficial','12/12/23');
INSERT INTO matrículas  VALUES('5555','0002',32,38,'Libre','12/01/24');
INSERT INTO matrículas  VALUES('5555','0003',11,18,'Oficial','12/02/24');
INSERT INTO matrículas  VALUES('5555','0001',11,38,'Oficial','12/03/24');
INSERT INTO matrículas  VALUES('5555','0005',42,48,'Oficial','12/04/24');

INSERT INTO curso_oposición VALUES('0001','C-502');
INSERT INTO curso_oposición VALUES('0001','C-512');
INSERT INTO curso_oposición VALUES('0001','C-522');
INSERT INTO curso_oposición VALUES('0001','C-532');
INSERT INTO curso_oposición VALUES('0001','C-542');
INSERT INTO curso_oposición VALUES('0001','C-552');
INSERT INTO curso_oposición VALUES('0002','C-502');
INSERT INTO curso_oposición VALUES('0003','C-552');
INSERT INTO curso_oposición VALUES('0004','C-512');
INSERT INTO curso_oposición VALUES('0006','C-522');
INSERT INTO curso_oposición VALUES('0005','C-502');
INSERT INTO curso_oposición VALUES('0005','C-512');
INSERT INTO curso_oposición VALUES('0005','C-522');
INSERT INTO curso_oposición VALUES('0005','C-532');
INSERT INTO curso_oposición VALUES('0005','C-542');

INSERT INTO curso_manual VALUES('0001','M001');
INSERT INTO curso_manual VALUES('0004','M001');
INSERT INTO curso_manual VALUES('0005','M001');
INSERT INTO curso_manual VALUES('0006','M002');
INSERT INTO curso_manual VALUES('0004','M003');
INSERT INTO curso_manual VALUES('0001','M004');
INSERT INTO curso_manual VALUES('0005','M004');
INSERT INTO curso_manual VALUES('0003','M005');
INSERT INTO curso_manual VALUES('0006','M006');
