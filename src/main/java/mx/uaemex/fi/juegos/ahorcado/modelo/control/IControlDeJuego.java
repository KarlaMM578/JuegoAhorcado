package mx.uaemex.fi.juegos.ahorcado.modelo.control;

import mx.uaemex.fi.juegos.ahorcado.modelo.data.Diccionario;

public interface IControlDeJuego {
	
	public void pideLetra();
	
	public void muestraGanaste();
	
	public ICommand muestraPerdiste();
	
	public void iniciaJuego(Ahorcado j);
	
	public void setDificultad(Dificultad d);
	
	public void setDiccionario(Diccionario d);
	
	public void registrarLetra(char c);
	
	public boolean buscarLetra(char c);
	
	public void setVerificacionDeLetrasUsadas(boolean b);
}
