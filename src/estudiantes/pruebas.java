/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiantes;
import estudiantes.DB2;
import java.sql.Connection;
/**
 *
 * @author fabri
 */
public class pruebas {
    public static void main(String[] args) {
        testearConexion();
    }

    public static void testearConexion() {
        Connection conexion = DB2.obtenerConexion(); // Aquí usamos el método de tu clase DB2 para obtener la conexión

        if (conexion != null) {
            System.out.println("La conexión a la base de datos fue exitosa.");
            // Aquí puedes realizar otras pruebas o consultas si lo deseas
        } else {
            System.out.println("Error al conectar a la base de datos.");
        }

        DB2.cerrarConexion(conexion); // Cerramos la conexión después de realizar las pruebas
    }
}