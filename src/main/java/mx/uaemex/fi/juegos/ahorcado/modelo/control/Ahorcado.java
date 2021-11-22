package mx.uaemex.fi.juegos.ahorcado.modelo.control;


public class Ahorcado {
	private String palabra;
	private char[] salida;
	private int numErrores;
	private int maxErrores;
	
	public Ahorcado() {
		super();
	}

	public Ahorcado(Dificultad d) {

	}
	
	public Ahorcado(Dificultad d, String p) {

	}
	
	public String getResultado() {
		return palabra;
	}
	
	public String getPalabra() {
		return palabra;
	}

	public void recibeLetra(char l) {
		
	}
	
	public int getMaxNumErrores(Dificultad d) {
		return maxErrores;
	}
	
	public void setDificultad(Dificultad d) {
		
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}



	public char[] getSalida() {
		return salida;
	}



	public void setSalida(char[] salida) {
		this.salida = salida;
	}



	public int getNumErrores() {
		return numErrores;
	}



	public void setNumErrores(int numErrores) {
		this.numErrores = numErrores;
	}



	public int getMaxErrores() {
		return maxErrores;
	}



	public void setMaxErrores(int maxErrores) {
		this.maxErrores = maxErrores;
	}



	
	


	
}
