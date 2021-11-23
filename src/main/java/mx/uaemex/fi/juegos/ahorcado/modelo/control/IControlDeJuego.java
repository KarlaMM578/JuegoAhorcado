package mx.uaemex.fi.juegos.ahorcado.modelo.control;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import mx.uaemex.fi.juegos.ahorcado.modelo.data.Diccionario;

public interface IControlDeJuego {
	
	public void pideLetra();
	
	public ICommand muestraGanaste();
	
	public ICommand muestraPerdiste();
	
	public void iniciaJuego(Ahorcado j);
	
	public void setDificultad(Dificultad d);
	
	public void setDiccionario(Diccionario d);
	
	public void registrarLetra(char c);
	
	public boolean buscarLetra(char c);
	
	public void setVerificacionDeLetrasUsadas(boolean b);

	public void iniciaJuego(ServletConfig j) throws ServletException;
}
