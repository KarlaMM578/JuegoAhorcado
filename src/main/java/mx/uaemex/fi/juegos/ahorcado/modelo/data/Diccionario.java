/**
 * 
 */
package mx.uaemex.fi.juegos.ahorcado.modelo.data;

/*
 * @author Jonathan Omar Esquivel Cruz 
 * @version 1.0
 * */
public class Diccionario extends ElementoConId {
	private String tema;
	
	/*
	 * Construye un diccionario son tema 
	 * */
	public Diccionario() {
		super();
	}

	/*
	 * Consulta el tema del diccionario
	 */
	public String getTema() {
		return tema;
	}

	/*
	 * Establece el tema del diccionario
	 * */
	public void setTema(String tema) {
		this.tema = tema;
	}
		
}
