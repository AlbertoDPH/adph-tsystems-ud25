DROP table IF EXISTS peliculas;
DROP table IF EXISTS salas;

-- Creamos la tabla peliculas, almacena informacion sobre peliculas
CREATE TABLE peliculas (
    -- Columna 'codigo de la película' PRIMARY KEY
    cod_pelicula INT,   
    nombre VARCHAR(100),
    
    -- Columna calificacion por edades
    calificacion_edad INT,
    -- Columna 'cod_pelicula' como PRIMARY KEY
    PRIMARY KEY (cod_pelicula)
);

-- Creamos la tabla salas, almacena informacion sobre salas y las peliculas
CREATE TABLE salas (
    -- Columna 'codigo de la sala' PRIMARY KEY AUTO_INCREMENT
    cod_sala INT AUTO_INCREMENT,    
    nombre VARCHAR(100),
    
    -- Columna 'clave foranea' de la pelicula (referencia a la tabla peliculas)
    pelicula INT,
    
    -- Columna 'cod_sala' como clave primaria PRIMARY KEY
    PRIMARY KEY (cod_sala),
    -- Columna pelicula como clave foranea que hace referencia a la tabla peliculas
    -- con eliminacion y actualizacion en cascada
    FOREIGN KEY (pelicula) REFERENCES peliculas(cod_pelicula) ON DELETE CASCADE ON UPDATE CASCADE
);

--  registros peliculas
INSERT INTO peliculas (cod_pelicula, nombre, calificacion_edad) VALUES (1, 'La Gran Aventura', 7);
INSERT INTO peliculas (cod_pelicula, nombre, calificacion_edad) VALUES (2, 'El Misterio Oculto', 12);
INSERT INTO peliculas (cod_pelicula, nombre, calificacion_edad) VALUES (3, 'La Comedia del Ano', 16);
INSERT INTO peliculas (cod_pelicula, nombre, calificacion_edad) VALUES (4, 'Accion en la Ciudad', 18);
INSERT INTO peliculas (cod_pelicula, nombre, calificacion_edad) VALUES (5, 'El Amor de un Sueno', 13);

--  registros  salas
INSERT INTO salas (nombre, pelicula) VALUES ('Sala 1', 1);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala 2', 2);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala 3', 3);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala 4', 4);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala 5', 5);




