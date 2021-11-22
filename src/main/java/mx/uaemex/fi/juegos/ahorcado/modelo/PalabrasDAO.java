package mx.uaemex.fi.juegos.ahorcado.modelo;

import mx.uaemex.fi.juegos.ahorcado.modelo.data.Palabra;

public interface PalabrasDAO extends DAO<Palabra> {
	public Palabra find(Palabra p);
	public Palabra insert(Palabra p);
	/*
	 * Pone el contenido de la palabra en el almacen persistente
	 * identificando el elemento por medio del id del parámetro
	 * @param p Palabra actualizada 
	 * */
	public void modifica(Palabra p);
	/*
	 * Método que elimina una palabra del almacén persistente. Si se 
	 * borra una palabra se debe eliminar en cascada de todos los
	 * diccionarios en donde está contenida 
	 * @param p Palabra a eliminar
	 * */
	public void elimina(Palabra p);
		
}
