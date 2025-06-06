# Sistema de Punto de Venta - Figuras Coleccionables

Este proyecto es una aplicación de **Punto de Venta** desarrollado en Java utilizando **NetBeans**, ademas fue conectada a una base de datos SQL para poder gestionar mejor los datos. 
Está diseñada específicamente para gestionar la venta de **figuras coleccionables**, este es un sistema de gestión de usuarios, productos y caja.


Esta aplicación incluye el envío de correos electrónicos (por ejemplo, para confirmar ventas o enviar avisos de registros).

## Características Principales

- Gestión de productos (agregar, editar, eliminar, buscar).
- Registro de ventas.
- Gestión de usuarios con roles que los diferencian de otros.
- Envío automático de correos electrónicos.
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
- **Gmail SMTP (para correos)**

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
   String usuario = "Tu_Usuario";
   String contrasena = "Tu_Contraseña";
   String bd = "Nombre_de_tu_Base_de_Datos";
   String ip = "Tu_ip (normalmente es 'locahost')";
   String puerto = "El_puerto (normalmente es '3306')";
   
   String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd; // Esta linea se queda así.

### Configurar el envio de correos automáticos 

1. Abrir el proyecto en NetBeans.
2. Buscar la clase de correos (`Correos.java`).
3. Edita las siguientes líneas para que el correo **remitente** sea el tuyo:
   ```java
   private static final String remitente = "Tu_Correo_Electronico (@gmail.com de preferencia)"; // Correo electronico
   private static final String clave = "tu_contraseña_de_aplicacion (del correo remitente)"; // Contraseña de aplicación

### ¿Cómo generar una contraseña de aplicación en Gmail?

⚠️ Requiere que tengas activada la **verificación en dos pasos** en tu cuenta de Google.

1. Ve a tu perfil de google.
2. En el menú de la izquierda, selecciona **Seguridad**.
3. En la sección **"Acceso a Google"**, haz clic en **Contraseñas de aplicaciones**.
4. Inicia sesión si te lo pide.
5. En el menú desplegable, selecciona **"Otro (nombre personalizado)"**.
6. Escribe un nombre como `PuntoVenta` y haz clic en **Generar**.
7. Google generará una contraseña única de **16 caracteres**.
8. Copia esa contraseña y pégala en la clase `Correos.java`, en la línea donde se define `clave`:
   ```java
   private static final String clave = "tu_contraseña_de_aplicacion (del correo remitente)"; // Contraseña de aplicación

## Capturas de Pantalla


## Enlace al video en YouTube

[![FigyuaHaven (Punto de Venta de Productos) en GitHub](https://img.youtube.com/vi/y6vOShTEtsw/0.jpg)](https://www.youtube.com/watch?v=y6vOShTEtsw)

👉 [click aquí para ver el video](https://youtu.be/y6vOShTEtsw)

## Colaboradores

[Álvarez Martínez Alessandro Santiago] (https://github.com/AleSantiagoAM)

[Velasco Velasco Heber] (https://github.com/EverV774
