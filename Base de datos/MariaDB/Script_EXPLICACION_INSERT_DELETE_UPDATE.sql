-- Explicación de INSERT, UPDATE, DELETE
-- INSERCCIÓN DE DATOS: INSERT
CREATE DATABASE IF NOT EXISTS insertar;
USE insertar;

CREATE TABLE empleados (
COD int(3) PRIMARY KEY AUTO_INCREMENT,
NOMBRE VARCHAR(50) NOT NULL,
LOCALIDAD VARCHAR(50) DEFAULT 'Écija',
FECHANAC DATE
);

-- La forma más habitual de introducir datos es la siguiente:
-- Como el campo COD es autoincrementable no hace falta indicar ni su nombre ni su valor.
INSERT INTO EMPLEADOS(nombre,localidad,fechanac) VALUES ('Pepe', 'Osuna', '1970/01/01');
INSERT INTO EMPLEADOS(nombre,localidad,fechanac) VALUES ('María', 'Sevilla', '1981/01/01');

-- Podemos insertar un conjunto de registros con un sólo INSERT separados por comas
INSERT INTO EMPLEADOS(nombre,localidad,fechanac) VALUES
    ('María', 'Sevilla', '1981/01/12'),
    ('María', 'Sevilla', '1990/02/9'),
	 ('Juan', 'Sevilla', '1993/05/21');
	 
-- Para mostrar el contenido de la tabla.
SELECT * FROM empleados;

-- Para saber el último autoincrementable generado
SELECT LAST_INSERT_ID();

-- Para reiniciar el autoincrementable después de borrar registros.
ALTER TABLE empleados AUTO_INCREMENT=1;
SHOW CREATE TABLE empleados;

-- En MariaDB las fechas se han de introducir con el formato YYYY/mm/dd.
-- Para mostrar las fechas en el formato día, mes y año hay que realizar una consulta
-- usando la función DATE_FORMAT como se muestra en el ejemplo siguiente.
SELECT nombre, localidad, DATE_FORMAT(fechanac,'%d-%m-%Y')
FROM empleados;

-- Para insertar el valor por defecto y dejar un atributo sin rellenar.
INSERT INTO EMPLEADOS(nombre,localidad,fechanac) VALUES ('Juan',DEFAULT, NULL);

-- Lo anterior también se puede hacer así:
INSERT INTO EMPLEADOS(nombre,localidad) VALUES ('Manuel',DEFAULT);

SELECT * FROM empleados;

-- El orden en que indicamos los valores debe de coincidir con el orden de los atributos.
INSERT INTO EMPLEADOS(nombre,localidad,fechanac) VALUES ('Alba','2000/05/26', 'Jaén');
-- Esto sería lo correcto.
INSERT INTO EMPLEADOS(nombre,localidad,fechanac) VALUES ('Alba','Jaén','2000/05/26');

-- Borra todos los registros
DELETE FROM empleados;

-- Borra todos los registros que cumplen una condición
DELETE FROM empleados WHERE cod=1;


-- MODIFICACIÓN DE DATOS: UPDATE
-- Se modifican las columnas indicadas en el apartado SET 
-- con los valores indicados.
-- Ponemos todos los nombresa mayúsculas
-- y todas las localidades a Estepa
UPDATE EMPLEADOS
SET NOMBRE=UPPER(NOMBRE), LOCALIDAD='Estepa';

-- También podemos usar la cláusula WHERE para actualizar
-- los registros o filas o tuplas que cumplan una determinada 
-- condición.
UPDATE EMPLEADOS
SET NOMBRE=CONCAT(LEFT(NOMBRE,1),LOWER(SUBSTRING(NOMBRE,2) )),LOCALIDAD='Marchena'
WHERE FECHANAC >= '1990/02/09';

-- ELIMINACIÓN DE DATOS: DELETE
-- Elimina los registros de la tabla que cumplan la condición indicada.

-- Borramos empleados de Estepa
DELETE FROM EMPLEADOS
WHERE LOCALIDAD='Estepa';

-- Borramos empleados cuya fecha de nacimiento sea anterior a 1970
-- ylocalidad sea Osuna
DELETE FROM EMPLEADOS
WHERE FECHANAC < '1970/01/01' AND LOCALIDAD = 'Osuna';

-- Borramos TODOS los registros de la tabla empleados;
DELETE FROM EMPLEADOS;

--Otro forma de borrar todos los registros de la tabla y dejarla vacía
TRUNCATE TABLE empleados;

-- ¿Que hará lo siguiente?
DROP TABLE empleados;

SELECT * FROM empleados;

-- IMPORTANTE 
-- REGLA DE INTEGRIDAD REFERENCIAL
/* Los datos se insertan en el orden de creación de las tablas. Es decir, primero se
han de introducir los datos en las tablas que no tienen foráneas y luego en las tablas 
que tienen foráneas.*/
/*Hay que tener en cuenta que el borrado de un registro no puede
provocar fallos de integridad.

En la práctica esto significa que no se pueden borrar registros cuya clave primaria sea
referenciada por alguna clave foránea en otra tabla, a no ser que dicha tabla secundaria
tenga activada la cláusula ON DELETE CASCADE en su clave foránea, en cuyo caso se borraría
el/los registro/s de la tabla principal y los registros de tabla secundaria
cuya clave foránea coincide con la clave primaria eliminada en latabla primera.*/


-- Regla de integridad referencial
/* Siginifica que asegura la relación que existe entre una 
llave primaria y una llave foránea.
	- Si el valor de una llave primaria no se ha introducido en una llave foránea
	entonces se puede borrar el registro en la tabla primaria.
	-Si se el valor de una llave primaria se ha introducido en una llave foránea hay tres
	comportamientos en relación al borrado:
		NO ACTION: no se borra ni la primaria ni la foránea
		ON DELETE CASCADE: se borra la primaria y la foránea
		PONER NULOS EN LA FORÁNEA: se borra la primaria  y en la foránea se pone NULL
¿Dónde se definen los compartamientos anteriores? En la foránea cuando realizamos
el create table o luego se modifica*/







