package fin.coop1504.tallerjava.configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//MANEJAR LA CONEXION A LA BASE DE DATOS
public final class SingletonConexion {
	private static Connection conexion = null;	
	public static Connection getConnection() throws SQLException {
		System.out.println("Solicitud de conexion");
		if (conexion == null || conexion.isClosed()) {
			crearConexion();
			System.out.println("Creacion de conexion nueva");
		}		
		return conexion;
	}              
	private static void crearConexion() throws SQLException{   
		conexion = DriverManager.getConnection(
				"jdbc:oracle:thin:@200.100.1.10:1989:desanodo","as_prg","asi_e");		
	}	
	public static void commit() throws SQLException {
		System.out.println("Confirmando transaccion");
		conexion.commit();
	}
	public static void rollback() throws SQLException {
		System.out.println("Cancelando transaccion");
		conexion.rollback();
	}
	public static void cerrarConexion() throws SQLException {
		System.out.println("Cerrando la conexion");
		conexion.close();
	}//ESTOS METODOS TRANVERSALES SOLO DEBEN PROPAGAR LAS EXCECIONES
}
