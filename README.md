# esturegistro-app
Aplicación de escritorio creada para mejorar la manipulación de información de alumnos de un colegio. Hecha con Apache Netbeans 13, JDK, MySQL Workbench y Xampp.

Stack tecnológico necesario: 
Apache Netbeans 13
JDK 1.8.0_202
Xampp
mysql-connector-java-5.1.46


Instrucciones para un correcto uso: 
Luego de clonar el repositorio, tendrás que acceder al link de Drive que tendrá los instaladores de los distintos programas que debes tener y sus versiones y deberás instalarlos; primero el MySQL Workbench, el JDK, luego el Apache Netbeans 13 y el Xampp. 
Abre el Apache Netbeans e importa el zip incluido en el repositorio mediante el botón de Files.
Comprueba que en libraries esté incluido el conector de MySQL, en caso de no estarlo agrega el archivo que incluí en el link del Drive.
En el archivo llamado "DB2" dentro del paquete estudiantes en Source Packages debes cambiar estas líneas:
private static final String URL = "jdbc:mysql://localhost:3307/programa";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "1234";
Cambia los datos de  el puerto de la URL, el usuario y la contraseña por los datos que estén en tu Xampp y MySQL configurados.
Exporta el archivo llamado 
Activa el servidor de Xampp y verifica la conexión entre la DB y el programa. 
Debes ejecutar el programa desde el archivo
