package fin.coop1504.tallerjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AplicacionConexionJava {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conexion = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection("jdbc:oracle:thin:@200.100.1.10:1989:desanodo", "as_prg", "asi_e");
			System.out.println("La conexion fue exitosa");
			conexion.setAutoCommit(false);
			ResultSet cursor = null;
			Statement sentenciaDML = conexion.createStatement();
			cursor = sentenciaDML.executeQuery("SELECT NOMBRES, APELLIDO, VALOR FROM AS_PRG.TEST_ANGIE");
			while (cursor.next()) {
				System.out.println("nombre:" + cursor.getString(1));
				System.out.println("apellido:" + cursor.getString(2));
				System.out.println("valor:" + cursor.getString(3));
			}
			// INSERT
			/*
			 * PreparedStatement ps = null; String sql =
			 * "INSERT INTO test_angie (NOMBRES, APELLIDO, VALOR) VALUES (?,?,?)"; ps =
			 * conexion.prepareStatement(sql); ps.setString(1, "DAMIAN"); ps.setString(2,
			 * "CEVALLOS"); ps.setString(3, "5"); ps.executeUpdate();
			 * System.out.println("Registro insertado");
			 */
			PreparedStatement sentenciaParametrizable = conexion
					.prepareStatement("INSERT INTO AS_PRG.TEST_ANGIE (NOMBRES, APELLIDO, VALOR) VALUES(?, ?, ?)");
			
			sentenciaParametrizable.setString(1, "Gabriela");
			sentenciaParametrizable.setString(2, "cevallos");
			sentenciaParametrizable.setString(3, "6");
			Integer resultado = sentenciaParametrizable.executeUpdate();
			System.out.println("Registros modificados" + resultado);
			conexion.rollback();	
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (conexion != null)
				conexion.close();
		}
	}
}
