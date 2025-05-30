create database bdproyectos;
use bdproyectos;
CREATE TABLE Productos (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre NVARCHAR(50),
    ancho DOUBLE,
    largo DOUBLE,
    precio DOUBLE,
    imagen NVARCHAR(50),
    cantidad INT
);

CREATE TABLE Usuarios (
    IDU INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Nombre NVARCHAR(50),
    ApellidoP NVARCHAR(50),
    ApellidoM NVARCHAR(50),
    Genero NVARCHAR(50),
    FechaN date,
    Correo NVARCHAR(50),
    Contrasena NVARCHAR(50),
    Rango CHAR
);

/*Insertar*/
insert into Productos (nombre,ancho,largo,precio,imagen, cantidad) values ('Oshawott',2.5,4,150.00, 'Oshawott.jpg', 2);
insert into Usuarios (Nombre, ApellidoP, ApellidoM, Genero, FechaN, Correo, Contrasena, Rango) values ('Juan', 'Perez', 'Díaz', 'Hombre', "01/01/2000", '1@gmail.com', '12345678', 'e' );

/*Mostrar*/
SELECT * FROM productos;
SELECT * FROM Usuarios;
SELECT productos.id,productos.nombre,productos.ancho,productos.largo,productos.precio,productos.imagen, productos.cantidad FROM productos;
SELECT usuarios.IDU, usuarios.Nombre, usuarios.ApellidoP, usuarios.ApellidoM, usuarios.Genero, usuarios.FechaN, usuarios.Correo, usuarios.Contrasena, usuarios.Rango FROM usuarios;
SELECT * FROM usuarios WHERE correo = ? AND contrasena = ?;

/*Actualizar*/
update Productos SET productos.nombre=?, productos.ancho=?, productos.largo=?, productos.precio=?, productos.imagen=?, productos.cantidad=? WHERE productos.id=?;
update Usuarios SET usuarios.Nombre=?, usuarios.ApellidoP=?, usuarios.ApellidoM=?, usuarios.Genero=?, usuarios.Correo=?, usuarios.Contrasena=?, usuarios.Rango=? WHERE usuarios.IDU=?;

/*Eliminar*/
DELETE FROM Productos WHERE productos.id = 8;
DELETE FROM Usuarios WHERE usuarios.IDU = 3;

ALTER TABLE productos AUTO_INCREMENT = 1;

SHOW STATUS LIKE 'threads_connected';