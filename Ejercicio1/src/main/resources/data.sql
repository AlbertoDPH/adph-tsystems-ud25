DROP table IF EXISTS fabricantes;
DROP table IF EXISTS articulos;

-- Creamos la tabla fabricantes
CREATE TABLE fabricantes (

    -- Columna codigo del fabricante 'autoincremental'
    cod_fabricante INT AUTO_INCREMENT,
    
    -- Columna nombre del fabricante
    nombre VARCHAR(100),
    
    -- cod_fabricante como 'clave primaria'
    PRIMARY KEY (cod_fabricante)
);

-- Creamos la tabla articulos
CREATE TABLE articulos (
    
    -- Columna codigo del articulo 'autoincremental'
    cod_articulo INT AUTO_INCREMENT,
    
    -- Columna nombre del artículo
    nombre VARCHAR(100),
    
    -- Columna precio del artículo
    precio INT,
    
    -- Columna 'clave foranea' del fabricante (referencia a la tabla fabricantes)
    fabricante INT,
    
    -- cod_articulo como 'clave primaria'
    PRIMARY KEY (cod_articulo),
    
    -- Columna fabricante como 'clave foranea' que hace referencia a la tabla fabricantes
    -- Eliminacion y actualizacion en cascada
    CONSTRAINT articulo_fk FOREIGN KEY (fabricante) REFERENCES fabricantes(cod_fabricante)
);

-- Insertamos 10 fabricantes de coches
INSERT INTO fabricantes (nombre)
VALUES ('Toyota'),
       ('Honda'),
       ('Ford'),
       ('Chevrolet'),
       ('Volkswagen'),
       ('BMW'),
       ('Mercedes-Benz'),
       ('Audi'),
       ('Nissan'),
       ('Hyundai');

-- Insertamos 10 tuplas en la tabla articulos
INSERT INTO articulos (nombre, precio, fabricante)
VALUES ('Toyota Corolla', 20000, 1),
       ('Honda Civic', 22000, 2),
       ('Ford Focus', 19000, 3),
       ('Chevrolet Cruze', 21000, 4),
       ('Volkswagen Golf', 23000, 5),
       ('BMW 3 Series', 40000, 6),
       ('Mercedes-Benz C-Class', 42000, 7),
       ('Audi A4', 41000, 8),
       ('Nissan Sentra', 18000, 9),
       ('Hyundai Elantra', 17500, 10);