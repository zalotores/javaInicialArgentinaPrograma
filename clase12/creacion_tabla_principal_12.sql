/*
1. Realizar el modelo relacional del enunciado propuesto.
2. Generar el modelo en algún motor de DB (oracle, mysql, sqlite, etc.)
*/

CREATE TABLE practico12(
dni INTEGER UNSIGNED NOT NULL UNIQUE, 
nombre VARCHAR(50), 
apellido VARCHAR(50),
nacionalidad VARCHAR(40),
departamento INTEGER UNSIGNED,
PRIMARY KEY (dni));

CREATE TABLE practico12_secundaria(
id INTEGER UNSIGNED NOT NULL UNIQUE,
departamento VARCHAR(40),
presupuesto DOUBLE,
PRIMARY KEY(id));

INSERT INTO practico12_secundaria(id, departamento, presupuesto) VALUES 
(1, 'logística', 3425000);
INSERT INTO practico12_secundaria(id, departamento, presupuesto) VALUES 
(2, 'sistemas', 1300000);
INSERT INTO practico12_secundaria(id, departamento, presupuesto) VALUES 
(3, 'compras', 12400000);
INSERT INTO practico12_secundaria(id, departamento, presupuesto) VALUES 
(4, 'recursos humanos', 50000000);

/*
3. Realizar las consultas para:
4. Insertar un empleado nuevo en la nómina de trabajo.*/

INSERT INTO practico12(dni, nombre, apellido, nacionalidad, departamento) VALUES (
11425778, 'lucy', 'lawless', 'estados unidos', 1);

#5. Modificar la nacionalidad de algún empleado.

UPDATE practico12 SET nacionalidad = 'australia' WHERE dni = 11425778;

#6. Eliminar un departamento.

DELETE FROM practico12_secundaria WHERE id = 4;

#7. Conocer los empleados que trabajan en el departamento de “logística” (puede ser
#cualquiera de los que agreguen).

SELECT * FROM practico12 a JOIN practico12_secundaria b ON a.departamento = b.id WHERE b.id = 1;

#8. Mostrar todos los departamentos ordenados alfabéticamente.

SELECT * FROM practico12_secundaria ORDER BY departamento;


