-- LEFT JOIN, RIGHT JOIN Y FULL JOIN
Select * from centros;
select * from departamentos;
select * from empleados;

-- Si hacemos un JOIN me muestra sólo  los departamentos que tienen asignados 
-- empleados.
SELECT D.nomde, E.nomem
FROM DEPARTAMENTOS D JOIN EMPLEADOS E ON D.NUMDE = E.NUMDE;

-- Si hacemos un LEFT JOIN muestra tanto los departamentos que tienen
-- empleados asignados como los que no tienen
SELECT D.nomde, E.nomem
FROM DEPARTAMENTOS D LEFT JOIN EMPLEADOS E ON D.NUMDE = E.NUMDE;

-- Si queremos los departamentos que no tienen empleados asignados añadimos
-- la condición IS NULL
SELECT D.nomde, E.nomem
FROM DEPARTAMENTOS D LEFT JOIN EMPLEADOS E ON D.NUMDE = E.NUMDE
WHERE e.nomem IS NULL;


-- La misma consulta anterior pero con RIGHT. Se cambia el orden de las tablas
-- Si no se pone condición muestra los departamentos tengan o no tengan
-- empleados asignados.
SELECT D.nomde, E.nomem
FROM EMPLEADOS E RIGHT JOIN DEPARTAMENTOS D ON D.NUMDE = E.NUMDE;

-- Añado condición para saber los que no tienen empleados asignados.
SELECT D.nomde, E.nomem
FROM EMPLEADOS E RIGHT JOIN DEPARTAMENTOS D ON D.NUMDE = E.NUMDE
WHERE e.nomem IS NULL;


/*Nombres de los CENTROS  que no tienen DEPARTAMENTO ASOCIADO.*/
SELECT C.nomce, D.nomde
FROM CENTROS C LEFT JOIN DEPARTAMENTOS D ON C.NUMCE = D.NUMCE 
WHERE d.nomde IS NULL;

SELECT C.nomce, D.nomde
FROM DEPARTAMENTOS D RIGHT JOIN CENTROS C ON C.NUMCE = D.NUMCE 
WHERE d.nomde IS NULL;


-- Si queremos saber los CENTROS que no tienen asignados departamentos
-- y los departamentos que no tienen CENTRO asociado.
-- usamos FULL JOIN
SELECT C.nomce, D.nomde, nomem
FROM CENTROS C FULL JOIN DEPARTAMENTOS D ON C.NUMCE = D.NUMCE
Full join empleados e on d.numde=e.numde
WHERE nomce is NULL or nomde is null or nomem is null; 

-- Ahora añadimos condición para quedarnos con lo pedido.

SELECT C.nomce, D.nomde 
FROM CENTROS C FULL JOIN DEPARTAMENTOS D ON C.NUMCE = D.NUMCE
WHERE C.nomce IS NULL OR D.nomde IS NULL;

-- FULL JOIN de las tres tablas

SELECT C.nomce, D.nomde, E.nomem
FROM CENTROS C FULL JOIN DEPARTAMENTOS D ON C.NUMCE = D.NUMCE 
                            FULL JOIN EMPLEADOS E ON D.NUMDE=E.NUMDE;
WHERE C.nomce IS NULL OR D.nomde IS NULL OR E.NUMDE IS NULL;

-- Mostrar los Centros que no tienen departamentos asociados, los departamentos que no 
-- tienen Centros asociados y los empleados no no tienen departamento asignado.
SELECT C.nomce, D.nomde, E.nomem
FROM CENTROS C FULL JOIN DEPARTAMENTOS D ON C.NUMCE = D.NUMCE 
                            FULL JOIN EMPLEADOS E ON D.NUMDE=E.NUMDE
WHERE C.nomce IS NULL OR D.nomde IS NULL OR E.NUMDE IS NULL;
