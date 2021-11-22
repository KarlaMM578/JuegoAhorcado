/**
 * 
 */
package mx.uaemex.fi.juegos.ahorcado.modelo.data;

/*
 * @author Jonathan Omar Esquivel Cruz 
 * @version 1.0
 * */
public class Palabra extends ElementoConId{
	private String palabra;

	/*
	 * Contructora 
	 * */
	public Palabra() {
		super();
	}
	
	/*
	 * Consulta la palabra del diccionario
	 * */
	public String getPalabra() {
		return palabra;
	}

	/*
	 * Establece la palabra del diccionario
	 * */
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	
}
