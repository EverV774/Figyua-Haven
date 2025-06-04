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
    fkRango INT,
    FOREIGN KEY (fkRango) REFERENCES Rango(idd) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE Rango (
	idd INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    rango NVARCHAR(50)
);
INSERT INTO Rango (rango) values ("Administrador");
INSERT INTO Rango (rango) values ("Supervisor");
INSERT INTO Rango (rango) values ("Caja");

/*Insertar*/
insert into Productos (nombre,ancho,largo,precio,imagen, cantidad) values (?,?,?,?,?,?);
insert into Usuarios (Nombre, ApellidoP, ApellidoM, Genero, FechaN, Correo, Contrasena, fkRango) values (?,?,?,?,?,?,?,?);

/*Mostrar*/
SELECT * FROM productos;
SELECT * FROM Usuarios;
SELECT * FROM Rango;
SELECT productos.id,productos.nombre,productos.ancho,productos.largo,productos.precio,productos.imagen, productos.cantidad FROM productos;
SELECT usuarios.IDU, usuarios.Nombre, usuarios.ApellidoP, usuarios.ApellidoM, usuarios.Genero, usuarios.FechaN, usuarios.Correo, usuarios.Contrasena, usuarios.fkRango FROM usuarios;
SELECT * FROM usuarios WHERE correo = ? AND contrasena = ?;

/*Actualizar*/
update Productos SET productos.nombre=?, productos.ancho=?, productos.largo=?, productos.precio=?, productos.imagen=?, productos.cantidad=? WHERE productos.id=?;
update Usuarios SET usuarios.Nombre=?, usuarios.ApellidoP=?, usuarios.ApellidoM=?, usuarios.Genero=?, usuarios.Correo=?, usuarios.Contrasena=?, usuarios.Rango=? WHERE usuarios.IDU=?;

/*Eliminar*/
DELETE FROM Productos WHERE productos.id = 8;
DELETE FROM Usuarios WHERE usuarios.IDU = 2;

/*Reiniciar ID*/
ALTER TABLE productos AUTO_INCREMENT = 101;
ALTER TABLE Usuarios AUTO_INCREMENT = 3;

/*Ver cuantas conexiones activas hay*/
SHOW STATUS LIKE 'threads_connected';

/*Eliminar una tabla*/
DROP TABLE IF EXISTS Usuarios;
