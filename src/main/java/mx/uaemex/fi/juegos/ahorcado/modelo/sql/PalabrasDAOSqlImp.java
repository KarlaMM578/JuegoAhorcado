package mx.uaemex.fi.juegos.ahorcado.modelo.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mx.uaemex.fi.juegos.ahorcado.modelo.PalabrasDAO;
import mx.uaemex.fi.juegos.ahorcado.modelo.data.Palabra;
import mx.uaemex.fi.juegos.ahorcado.modelo.error.PersistenciaException;

public class PalabrasDAOSqlImp extends AbstractDAO implements PalabrasDAO {

	/*
	 * Metodo que devuelve todas las palabras del almacen de datos (sin filtro)
	 * @return Lista de todas las palabras o una lista vacia en caso
	 * de que no se tengan aun palabras
	 * */
	@Override
	public List<Palabra> find() {
		String sql = "select id, palabra from palabras";
		List<Palabra> lista = new ArrayList<Palabra>();
		try {
			// A partir de la conexion obtenida 
			Statement smt = this.conexion.createStatement();
			//A partir del Statement ejecutar una query
			ResultSet rs = smt.executeQuery(sql);
			//A partir del resultado del quiery armar la respuesta
			while (rs.next()) {
				Palabra p = new Palabra();
				p.setId(rs.getInt(1));
				p.setPalabra(rs.getString("palabra"));
				lista.add(p);
			}
		} catch (SQLException e) {
			// Reportar el problema de conexcion 
			throw new PersistenciaException(e.getMessage(), e.getCause());
		}
		return lista;
	}

	@Override
	public Palabra find(Palabra p) {
		String sql = "select id, palabra from palabras where palabra == " + p.getPalabra();
		Palabra p1 = new Palabra();
		
		try {
			Statement stm = this.conexion.createStatement();
			
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {				
				p1.setId(rs.getInt("id"));
				p1.setPalabra(rs.getString("palbra"));				
			}
			rs.close();
		} catch (SQLException e) {
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
		
		return p1;
	}

	@Override
	public Palabra insert(Palabra p) {
		String sql = "insert into palabras values " + p;
		
		try {
			Statement stm = this.conexion.createStatement();
			
			stm.executeQuery(sql);
			
		} catch (SQLException e) {
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
			
		return null;
	}

	@Override
	public void modifica(Palabra p) {
		String sql = "update palabras set id = " + p.getId() +", palabra = " + p.getPalabra();
		
		try {
			Statement stm = this.conexion.createStatement();
			
			stm.executeQuery(sql);
			
		} catch (SQLException e) {
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
	}

	@Override
	public void elimina(Palabra p) {
		String sql = "delete from palabras where palabra = " + p.getPalabra();
		
		try {
			Statement stm = this.conexion.createStatement();
			
			stm.executeQuery(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
	}

}
