DROP table IF EXISTS departamentos;
DROP table IF EXISTS empleados;

-- Creamos la tabla departamentos, con ´cod_departamento´ como PRIMARY KEY
CREATE TABLE departamentos (
    cod_departamento INT,
    nombre VARCHAR(100),    
    presupuesto INT,
    PRIMARY KEY (cod_departamento)
);

-- Creamos la tabla empleados, con 'dni' como PRIMARY KEY
CREATE TABLE empleados (   
    dni VARCHAR(8) UNIQUE,    
    nombre VARCHAR(100),    
    apellidos VARCHAR(255),
    
    -- Columna 'clave foranea' del departamento (referencia a la tabla departamentos)
    departamento INT,
    
    -- 'dni' como clave primaria
    PRIMARY KEY (dni),
    
    -- Columna departamento como 'clave foranea' que hace referencia a la tabla departamentos
    -- Eliminacion y actualizacion en cascada
    FOREIGN KEY (departamento) REFERENCES departamentos(cod_departamento) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Insertamos dos registros en la tabla departamentos
INSERT INTO departamentos (cod_departamento, nombre, presupuesto)
VALUES (1, 'Programacion', 150000),
       (2, 'Desarrollo', 80000);

-- Insertamos dos registros en la tabla empleados
INSERT INTO empleados (dni, nombre, apellidos, departamento)
VALUES ('12345678', 'Alberto', 'del Pozo', 1),
       ('87654321', 'Tamy', 'Morales', 2);
	   

