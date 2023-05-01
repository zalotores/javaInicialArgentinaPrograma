CREATE TABLE materias_final(

nombre VARCHAR(50),

correlativas JSON,

primary key (nombre)

);

CREATE TABLE alumnos(

legajo integer unsigned NOT NULL UNIQUE,

nombre VARCHAR(50),

materias_aprobadas JSON,

primary key (legajo)

);

INSERT INTO materias_final(nombre, correlativas) VALUES ( "matematica 1", '[]');
INSERT INTO materias_final(nombre, correlativas) VALUES ( "matematica 2", '["matematica 1"]');
INSERT INTO materias_final(nombre, correlativas) VALUES ( "matematica 3", '["matematica 2", "programacion 1"]');
INSERT INTO materias_final(nombre, correlativas) VALUES ( "fisica 1", '[]');
INSERT INTO materias_final(nombre, correlativas) VALUES ( "fisica 2", '["fisica 1"]');
INSERT INTO materias_final(nombre, correlativas) VALUES ( "programacion 1", '[]');
INSERT INTO materias_final(nombre, correlativas) VALUES ( "programacion 2", '["programacion 1", "matematica 1"]');
INSERT INTO materias_final(nombre, correlativas) VALUES ( "programacion 3", '["programacion 2", "ingles"]');
INSERT INTO materias_final(nombre, correlativas) VALUES ( "ingles", '[]');

INSERT INTO alumnos( legajo, nombre, materias_aprobadas) VALUES ( 14652, "Pierre Nodoyuma", '["matematica 1", "fisica 1", "ingles"]');
INSERT INTO alumnos( legajo, nombre, materias_aprobadas) VALUES ( 76419, "Pepe Marrone", '["matematica 1", "fisica 1", "ingles", "programacion 1"]');
INSERT INTO alumnos( legajo, nombre, materias_aprobadas) VALUES ( 08514, "Maria Ladel Barrio", '["matematica 1",  "ingles"]');
INSERT INTO alumnos( legajo, nombre, materias_aprobadas) VALUES ( 23451, "Pippi Calzaslargas", '["matematica 1", "fisica 1", "programacion 1"]');



