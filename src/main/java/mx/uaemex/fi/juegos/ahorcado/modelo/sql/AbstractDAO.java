package mx.uaemex.fi.juegos.ahorcado.modelo.sql;

import java.sql.Connection;

public abstract class AbstractDAO {

	protected Connection conexion;
	
	public AbstractDAO() {
		super();
	}
	
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

}
