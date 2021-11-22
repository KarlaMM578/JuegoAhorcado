package mx.uaemex.fi.juegos.ahorcado.modelo.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mx.uaemex.fi.juegos.ahorcado.modelo.DiccionariosDAO;
import mx.uaemex.fi.juegos.ahorcado.modelo.data.Diccionario;
import mx.uaemex.fi.juegos.ahorcado.modelo.data.Palabra;
import mx.uaemex.fi.juegos.ahorcado.modelo.error.PersistenciaException;

public class DiccionarioDAOSqlImp extends AbstractDAO implements DiccionariosDAO {

	@Override
	public List<Diccionario> find() {
		String sql = "select id, tema from diccionario";
		List<Diccionario> lista = new ArrayList<Diccionario>();
		
		try {
			Statement stm = this.conexion.createStatement();
			
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				Diccionario d = new Diccionario();
				d.setId(rs.getInt("id"));
				d.setTema(rs.getString("tema"));
				lista.add(d);
			}
			rs.close();
		} catch (SQLException e) {
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
		
		return lista;
	}

	@Override
	public Diccionario find(Diccionario d) {
		String sql = "select id, tema from diccionario where tema == " + d.getTema();
		Diccionario d1 = new Diccionario();
		
		try {
			Statement stm = this.conexion.createStatement();
			
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {				
				d1.setId(rs.getInt("id"));
				d1.setTema(rs.getString("tema"));				
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
		
		return d1;
	}

	@Override
	public Diccionario insert(Diccionario d) {
		String sql = "insert into diccionario values " + d;
		
		try {
			Statement stm = this.conexion.createStatement();
			
			stm.executeQuery(sql);
			
		} catch (SQLException e) {
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
			
		return null;
	}

	@Override
	public void nodifica(Diccionario d) {
		String sql = "update diccionario set id = " + d.getId() +", tema = " + d.getTema();
		
		try {
			Statement stm = this.conexion.createStatement();
			
			stm.executeQuery(sql);
			
		} catch (SQLException e) {
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
	}

	@Override
	public void elimina(Diccionario d) {
		String sql = "delete from diccionario where tema = " + d.getTema();
		
		try {
			Statement stm = this.conexion.createStatement();
			
			stm.executeQuery(sql);
			
		} catch (SQLException e) {
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
	}

	@Override
	public Palabra find(Palabra p, Diccionario d) {
		String sql = "select palabras.id, palabras.palabra from palabras inner join "
				+ "contenido_diccionarios on palabras.id = contenido_diccionarios.palabra_id "
				+ "inner join diccionario on diccionario.id = contenido_diccionarios.diccionario_id "
				+ "where palabras.id == " + p.getId();
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
			// TODO Auto-generated catch block
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
		
		return p1;
	}

	@Override
	public void insert(Palabra p, Diccionario d) {
		String sql = "insert into palabras values " + p;				
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
		
		
		sql = "insert into contenido_diccionarios values " + p1.getId() + " " + d.getId();				

		try {
			Statement stm = this.conexion.createStatement();
			
			ResultSet rs = stm.executeQuery(sql);
			
			rs.close();
		} catch (SQLException e) {
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
		
		sql = "select palabras.id, palabras.palabra from palabras inner join "
				+ "contenido_diccionarios on palabras.id = contenido_diccionarios.palabra_id "
				+ "inner join diccionario on diccionario.id = contenido_diccionarios.diccionario_id "
				+ "where palabras.id == " + p.getId() + " AND diccionario.id == " + d.getId();
		Palabra px = new Palabra();
		
		try {
			Statement stm = this.conexion.createStatement();
			
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {				
				px.setId(rs.getInt("id"));
				px.setPalabra(rs.getString("palbra"));				
			}
			rs.close();
		} catch (SQLException e) {
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
		
		//return px;
	}

	@Override
	public List<Palabra> getPalabra(Diccionario d) {
		String sql = "select palabras.id, palabras.palabra from palabras inner join "
				+ "contenido_diccionarios on palabras.id = contenido_diccionarios.palabra_id "
				+ "inner join diccionario on diccionario.id = contenido_diccionarios.diccionario_id "
				+ "where diccionario.id == " + d.getId();
		List<Palabra> lista = new ArrayList<Palabra>();
		
		try {
			Statement stm = this.conexion.createStatement();
			
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				Palabra p = new Palabra();
				p.setId(rs.getInt("id"));
				p.setPalabra(rs.getString("palabra"));
				lista.add(p);
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
		
		return lista;
	}

	@Override
	public int getNumeroPalabras(Diccionario d) {
		String sql = "select count palabras.id as \"total\"	from palabras inner join "
				+ "contenido_diccionarios on palabras.id = contenido_diccionarios.palabra_id "
				+ "inner join diccionario on diccionario.id = contenido_diccionarios.diccionario_id "
				+ "where diccionario.id == " + d.getId();
		int resultado;
		
		try {
			Statement stm = this.conexion.createStatement();
			
			ResultSet rs = stm.executeQuery(sql);
					
			resultado = Integer.parseInt(rs.getString("total"));
			
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
		return resultado;
		
	}

	@Override
	public void elimina(Palabra p, Diccionario d) {
		String sql = "delete from palabras inner join "
				+ "contenido_diccionarios on palabras.id = contenido_diccionarios.palabra_id "
				+ "inner join diccionario on diccionario.id = contenido_diccionarios.diccionario_id "
				+ "where diccionario.id == " + d.getId() + " AND palabras.id == " + p.getId();
		//List<Palabra> lista = new ArrayList<Palabra>();
		
		try {
			Statement stm = this.conexion.createStatement();
			
			/*ResultSet rs = */stm.executeQuery(sql);
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new PersistenciaException(e.getMessage(),e.getCause());
		}
	}

}
