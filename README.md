# esturegistro-app
Aplicación de escritorio creada para mejorar la manipulación de información de alumnos de un colegio. Hecha con Apache Netbeans 13, JDK, MySQL Workbench y Xampp.

## Stack tecnológico necesario: 
Apache Netbeans 13

JDK 1.8.0_202

Xampp

mysql-connector-java-5.1.46

MySQL Workbench 8.0.35.0

## Atajo para clonar repositorio 

    git clone https://github.com/kirii626/esturegistro-app

## Instrucciones para un correcto uso: 
Luego de clonar el repositorio, tendrás que acceder al [link de Drive](https://drive.google.com/drive/folders/1X37tS_nGi6QEuhfl2K5fPCBdzHlW7ODl?usp=drive_link) que tendrá los instaladores de los distintos programas que debes tener y sus versiones y deberás instalarlos; primero el MySQL Workbench, el JDK, luego el Apache Netbeans 13 y el Xampp. 
Abre el Apache Netbeans y ve al botón de Files en la esquina superior izquierda, ve a Open Project y navega hasta la ruta donde está clonado el repositorio, si el Apache está bien instalado lo reconocerá de esta forma. 

![image](https://github.com/user-attachments/assets/7ac9aebf-5b3a-4b15-a725-8ec24ca4f4e9)


Selecciona Open Project y podrás visualizar el paquete con las diferentes ventanas del programa.
Comprueba que en libraries esté incluido el conector de MySQL, en caso de no estarlo agrega el archivo que incluí en el link del Drive.
Se tiene que ver así: 


![image](https://github.com/user-attachments/assets/7bec9f6e-f830-41de-bba1-ca52f1ae0b29)

En el archivo llamado "DB2" dentro del paquete estudiantes en Source Packages debes cambiar estas líneas:

    private static final String URL = "jdbc:mysql://localhost:3307/programa";

    private static final String USUARIO = "root";
    
    private static final String CONTRASENA = "1234";
    
Cambia los datos de  el puerto de la URL (el 3307), el usuario y la contraseña por los datos que estén en tu Xampp y MySQL configurados.
Exporta el archivo llamado app_acosta.sql y ejecutalo en tu MySQL Workbench.
Activa el servidor de Xampp y verifica la conexión entre la DB y el Xampp verificando que se estén escuchando en el mismo puerto.
Debes ejecutar el programa desde el archivo llamado "principal.java"





Hecho por Alejandra Kiara Justiniano Olmos y Mateo Santiago Márquez


