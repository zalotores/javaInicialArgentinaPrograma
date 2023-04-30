CREATE TABLE materias_final(

nombre VARCHAR(50),

correlativas JSON,

primary key (nombre)

);

CREATE TABLE alumnos(

legajo integer unsigned NOT NULL UNIQUE,

nombre VARCHAR(50),

materias_aprovadas JSON,

primary key (legajo)

);