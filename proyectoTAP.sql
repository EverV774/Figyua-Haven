create database bdproyecto;
use bdproyecto;
create table Productos(
	id int not null auto_increment primary key,
    nombre nvarchar(50),
    ancho double,
    largo double,
    precio double
);

/*Insertar*/
insert into Productos (nombre,ancho,largo,precio) values ('Oshawott',2.5,4,150.00);

/*Mostrar*/
select * from Productos;
select productos.id, productos.nombre, productos.ancho, productos.largo, productos.precio from productos;

/*Actualizar*/
update Productos SET productos.nombre=?, productos.ancho=?, productos.largo=?, productos.precio=? WHERE productos.id=?;

/*Eliminar*/
DELETE FROM Productos WHERE productos.id=?;

SHOW STATUS LIKE 'threads_connected';