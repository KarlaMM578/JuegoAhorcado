package mx.uaemex.fi.juegos.ahorcado.modelo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import mx.uaemex.fi.juegos.ahorcado.modelo.control.Ahorcado;
import mx.uaemex.fi.juegos.ahorcado.modelo.control.Dificultad;
import mx.uaemex.fi.juegos.ahorcado.modelo.control.ICommand;
import mx.uaemex.fi.juegos.ahorcado.modelo.control.IControlDeJuego;
import mx.uaemex.fi.juegos.ahorcado.modelo.data.Diccionario;
import mx.uaemex.fi.juegos.ahorcado.modelo.data.Palabra;
import mx.uaemex.fi.juegos.ahorcado.modelo.sql.PalabrasDAOSqlImp;
import mx.uaemex.fi.juegos.ahorcado.modelo.dispatcher.DispatcherAhorcadoPage;
import mx.uaemex.fi.juegos.ahorcado.modelo.dispatcher.ErrorPageCommand;
import mx.uaemex.fi.juegos.ahorcado.modelo.dispatcher.HomePageCommand;
import mx.uaemex.fi.juegos.ahorcado.modelo.dispatcher.PerdistePageCommand;
import mx.uaemex.fi.juegos.ahorcado.modelo.error.GanasteException;
import mx.uaemex.fi.juegos.ahorcado.modelo.error.PerdisteException;
import mx.uaemex.fi.juegos.ahorcado.modelo.dispatcher.GanastePageCommand;



@WebServlet("/Ahorcado")
public class FrontController extends HttpServlet implements IControlDeJuego {
	private int maxErrors;
	private int numErrors;
	private String palabra;
	private char[] resultado;
	private static final long serialVersionUID = 1L;
	
	public FrontController() {
		super();
	}
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		DataSource ds;
        InitialContext cxt;
        
        try {
            cxt = new InitialContext();
            ds = (DataSource) cxt.lookup( "java:/comp/env/jdbc/ds" );
        } catch (NamingException e) {
            e.printStackTrace();
        }
        		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DispatcherAhorcadoPage dispatcher = new DispatcherAhorcadoPage();
		dispatcher.dispatcher(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


	@Override
	public ICommand muestraGanaste() {
		ICommand iCommand = null;
		iCommand = new GanastePageCommand();
		return iCommand;
	}

	@Override
	public void pideLetra() {
		Palabra palabra = null;
		PalabrasDAOSqlImp palabras = new PalabrasDAOSqlImp();
		palabras.modifica(palabra);
	}

	@Override
	public ICommand muestraPerdiste() {
		ICommand iCommand = null;
		iCommand = new PerdistePageCommand();
		return iCommand;
	}

	public void iniciaJuego(ServletConfig j) throws ServletException{
		super.init(j);		
	}

	@Override
	public void setDificultad(Dificultad d) {
		Ahorcado ahorcado = new Ahorcado();
		this.maxErrors = ahorcado.getMaxNumErrores(d);
		
	}

	@Override
	public void setDiccionario(Diccionario d) {
		Diccionario diccionario = new Diccionario();
		diccionario.setId(d.getId());
		
	}

	@Override
	public void registrarLetra(char c) {
		char[] letra=null;
		letra = this.resultado;
	}

	@Override
	public boolean buscarLetra(char c) {
		char[] letra;
		boolean encuentra=false;
		
		letra = this.palabra.toCharArray();
		for(int i = 0; i < letra.length;i++) {
			if(letra[i]==c) {
				this.resultado[i] = c;
				encuentra = true;
			}
		}
		if(!encuentra) {
			this.numErrors++;
			encuentra = false;
		}
		return encuentra;
	}

	@Override
	public void setVerificacionDeLetrasUsadas(boolean b) {
		if(this.numErrors>this.maxErrors) {
			throw new PerdisteException();
		}
		
	}
	
	public int getMaxNumErrores(Dificultad d) {
		int numErrores=0;
		switch(d) {
			case FACIL:
				numErrores= 8;
			case MEDIA:
				numErrores= 5;
			case DIFICIL:
				numErrores= 2;
			default:
				System.out.println();
		}
		return numErrores;
	}

	@Override
	public void iniciaJuego(Ahorcado j) {
		// TODO Auto-generated method stub
		
	}
}
