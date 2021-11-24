package mx.uaemex.fi.juegos.ahorcado.modelo.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;

public class Conexion {
	
	private final String JDBC_URL = "jdbc:derby://localhost:1527/ahorcado";
	
	protected Connection conexion;
	
	public void conectar() throws Exception{
		try {
			conexion = DriverManager.getConnection(JDBC_URL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void cerrar() throws SQLException {
		if (conexion != null) {
			if (!conexion.isClosed()) {
				conexion.close();
			}
		}
	}
}
