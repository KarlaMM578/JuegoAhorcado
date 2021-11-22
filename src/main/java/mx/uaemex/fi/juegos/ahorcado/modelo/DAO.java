package mx.uaemex.fi.juegos.ahorcado.modelo;

import java.util.List;

import mx.uaemex.fi.juegos.ahorcado.modelo.data.Data;

public interface DAO<T extends Data> {
	public List<T> find();
}
//Prueba