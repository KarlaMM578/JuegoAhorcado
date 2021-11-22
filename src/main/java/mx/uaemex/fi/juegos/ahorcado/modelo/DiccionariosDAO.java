package mx.uaemex.fi.juegos.ahorcado.modelo;

import java.util.List;

import mx.uaemex.fi.juegos.ahorcado.modelo.data.Diccionario;
import mx.uaemex.fi.juegos.ahorcado.modelo.data.Palabra;

public interface DiccionariosDAO extends DAO<Diccionario> {
	/*
	 * @param d Diccionario
	 * */
	public Diccionario find(Diccionario d);
	/*
	 * @param d Diccionario
	 * */
	public Diccionario insert(Diccionario d);
	/*
	 * Modifica los datos del diccionario (basicamente su nombre) 
	 * pero no su contenido 
	 * @param d
	 * @return 
	 * */
	public void nodifica(Diccionario d);
	/*
	 * @param d Diccionario
	 * */
	public void elimina(Diccionario d);
	/*
	 * Busca una palabra dentro del diccionario
	 * @param p Palabra a buscar. Para la búsqueda se debe utilizar su
	 * contenido, no su id
	 * @param d Diccionario donde se búsca la palabra 
	 * @return Palabra encontrada en el diccionario
	 * */
	public Palabra find(Palabra p, Diccionario d);
	/*
	 * Agrega una palabra al diccionario
	 * @param p Palabra a agregar 
	 * @param d Diccionario donde se incluira la palabra S
	 * */
	public void insert(Palabra p, Diccionario d);
	/*
	 * param d Diccionario
	 * */
	public List<Palabra> getPalabra(Diccionario d);
	/*
	 * @param d Diccionario
	 * */
	public int getNumeroPalabras(Diccionario d);
	/*
	 * @param p Palabra
	 * @param d Diccionario
	 * */
	public void elimina(Palabra p, Diccionario d);
}















