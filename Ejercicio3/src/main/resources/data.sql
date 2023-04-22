DROP table IF EXISTS almacenes;
DROP table IF EXISTS cajas;

/*Creamos la primera tabla que no tiene ninguna clave foránea
establecemos que es auto incrementable (identity)*/
CREATE TABLE almacenes(
codigo int AUTO_INCREMENT NOT NULL,
lugar nvarchar(100),
capacidad int,
PRIMARY KEY(codigo) 
);

/*Creamos la segunda tabla que tiene clave foránea que al eliminar ponga null
pero que si actualizada actualice en cascata*/
CREATE TABLE cajas(
num_referencia char(5) ,
contenido nvarchar(100),
valor int,
almacen int NULL,
primary key(num_referencia),
foreign key(almacen) references almacenes(codigo)
on delete cascade on update cascade
);

INSERT INTO almacenes (lugar, capacidad) VALUES ('Almacen A', 500);
INSERT INTO almacenes (lugar, capacidad) VALUES ('Almacen B', 300);
INSERT INTO almacenes (lugar, capacidad) VALUES ('Almacen C', 700);
INSERT INTO almacenes (lugar, capacidad) VALUES ('Almacen D', 250);
INSERT INTO almacenes (lugar, capacidad) VALUES ('Almacen E', 1000);

INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('A0001', 'Tornillos', 100, 1);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('B0002', 'Tuercas', 50, 2);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('C0003', 'Martillos', 200, 3);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('D0004', 'Destornilladores', 150, 4);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('E0005', 'Alicates', 80, 5);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('F0006', 'Clavos', 75, 1);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('G0007', 'Pintura', 250, 2);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('H0008', 'Cinta metrica', 30, 3);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('I0009', 'Taladros', 400, 4);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('J0010', 'Lijadoras', 300, 5);

