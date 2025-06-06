# Sistema de Punto de Venta - Figuras Coleccionables

Este proyecto es una aplicación de **Punto de Venta** desarrollado en Java utilizando **NetBeans**, ademas fue conectada a una base de datos SQL para poder gestionar mejor los datos. 
Está diseñada específicamente para gestionar la venta de **figuras coleccionables**, este es un sistema de gestión de usuarios, productos y caja.

## Características Principales

- Gestión de productos (agregar, editar, eliminar, buscar).
- Registro de ventas.
- Gestión de usuarios con roles que los diferencian de otros.
- Conexión a base de datos SQL para la persistencia de datos.
- Interfaz gráfica desarrollada con Swing.

## Tipos de Usuario

El sistema cuenta con tres roles definidos:

### Administrador
- Acceso total al sistema.
- Puede **gestionar productos** y **usuarios** (añadir, editar, eliminar).

### Supervisor
- Puede **gestionar productos** (añadir, editar, eliminar).
- No tiene acceso a la gestión de usuarios ni a la caja.

### Cajero
- Tiene acceso únicamente al **módulo de ventas**.
- Puede registrar ventas.

## Tecnologías Utilizadas

- **Java**
- **NetBeans IDE**
- **MySQL**
- **JDBC (Java Database Connectivity)**
- **Swing (Interfaz gráfica)**

## Instalación y Ejecución

### Requisitos Previos

- Java JDK 8 o superior
- NetBeans IDE
- MySQL
- Conector JDBC para MySQL (`mysql-connector-java-x.x.xx.jar`)

### Pasos para Importar el proyecto y la Base de Datos

1. Clonar o descargar este repositorio.
2. Importar el proyecto en NetBeans.
3. Abrir cualquier cliente MySQL que se utilice.
4. Crear una base de datos vacía con el nombre deseado, por ejemplo: `punto_venta`.
5. Importar el archivo `.sql` incluido en el repositorio:
   - En tu usuario de BD, selecciona la base de datos creada.
   - Haz clic en la pestaña **server** seguido de la opcion **Data Import**.
   - Selecciona la carpeta `Dump20250604 (2)`.
   - Ejecuta la importación.
6. Verifica que se hayan creado las siguientes tablas:
   - `usuarios`
   - `rango`
   - `productos`

### Configurar la Conexión de BD en el Proyecto

1. Abrir el proyecto en NetBeans.
2. Buscar la clase de conexión (`CConexion.java`).
3. Editar los siguientes datos según tu entorno:
   ```java
   String usuario="Tu_Usuario";
   String contrasena="Tu_COntraseña";
   String bd="Nombre_de_tu_Base_de_Datos";
   String ip="Tu_ip (normalmente es 'locahost')";
   String puerto="El_puerto (normalmente es '3306')";
   
   String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd; // Esta linea se queda así.
