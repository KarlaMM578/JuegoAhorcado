package mx.uaemex.fi.juegos.ahorcado.modelo.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mx.uaemex.fi.juegos.ahorcado.modelo.DiccionariosDAO;
import mx.uaemex.fi.juegos.ahorcado.modelo.data.Diccionario;
import mx.uaemex.fi.juegos.ahorcado.modelo.data.Palabra;
import mx.uaemex.fi.juegos.ahorcado.modelo.error.PersistenciaException;

public class DiccionarioDAOSqlImp2 extends Conexion implements DiccionariosDAO {

	@Override
	public List<Diccionario> find() {
		List<Diccionario> lista = new ArrayList<Diccionario>();
		String sql = "select id, tema from diccionarios";
		try {
			this.conectar();
			PreparedStatement st = this.conexion.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				Diccionario diccionario = new Diccionario();
				diccionario.setId(rs.getInt("ID"));
				diccionario.setTema(rs.getString("TEMA"));
				lista.add(diccionario);
			}
			
			rs.close();
			st.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public Diccionario find(Diccionario d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Diccionario insert(Diccionario d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void nodifica(Diccionario d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elimina(Diccionario d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Palabra find(Palabra p, Diccionario d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Palabra p, Diccionario d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Palabra> getPalabra(Diccionario d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumeroPalabras(Diccionario d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void elimina(Palabra p, Diccionario d) {
		// TODO Auto-generated method stub
		
	}

	

}
