package mx.uaemex.fi.juegos.ahorcado.modelo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.uaemex.fi.juegos.ahorcado.modelo.control.Ahorcado;
import mx.uaemex.fi.juegos.ahorcado.modelo.control.Dificultad;
import mx.uaemex.fi.juegos.ahorcado.modelo.control.ICommand;
import mx.uaemex.fi.juegos.ahorcado.modelo.control.IControlDeJuego;
import mx.uaemex.fi.juegos.ahorcado.modelo.data.Diccionario;
import mx.uaemex.fi.juegos.ahorcado.modelo.data.Palabra;
import mx.uaemex.fi.juegos.ahorcado.modelo.sql.PalabrasDAOSqlImp;
import mx.uaemex.fi.juegos.ahorcado.modelo.dispatcher.ErrorPageCommand;
import mx.uaemex.fi.juegos.ahorcado.modelo.dispatcher.HomePageCommand;
import mx.uaemex.fi.juegos.ahorcado.modelo.dispatcher.PerdistePageCommand;

public class FrontController extends HttpServlet implements IControlDeJuego {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String forward = handleRequest(req, resp);
		req.getRequestDispatcher(forward + ".jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String redirect = handleRequest(req, resp);
		resp.sendRedirect(redirect);
		System.out.println("post request");
	}

	private String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		String command = req.getParameter("command");
		ICommand iCommand = null;
		String home = "HOME_PAGE";
		if (home.equals(command)) {
			iCommand = muestraPerdiste();
		} else {
			iCommand = new ErrorPageCommand();
		}
		return iCommand.execute(req, resp);
	}

	@Override
	public void muestraGanaste() {
		// TODO Auto-generated method stub
		
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

	@Override
	public void iniciaJuego(Ahorcado j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDificultad(Dificultad d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDiccionario(Diccionario d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarLetra(char c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean buscarLetra(char c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setVerificacionDeLetrasUsadas(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
