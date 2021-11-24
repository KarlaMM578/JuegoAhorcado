package mx.uaemex.fi.juegos.ahorcado.modelo.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import mx.uaemex.fi.juegos.ahorcado.modelo.DiccionariosDAO;
import mx.uaemex.fi.juegos.ahorcado.modelo.data.Diccionario;
import mx.uaemex.fi.juegos.ahorcado.modelo.sql.DiccionarioDAOSqlImp;
import mx.uaemex.fi.juegos.ahorcado.modelo.sql.DiccionarioDAOSqlImp2;

public class DispatcherAhorcadoPage {
	public void dispatcher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String command = request.getParameter("command");
		//List lista;
		
		//String nombre = "";
		
			//String nombre = request.getParameter("name");
		
		
		//Diccionario diccionarios = new Diccionario();
			/*DiccionarioDAOSqlImp2 dao = new DiccionarioDAOSqlImp2();
			lista = dao.find();
			for (int i = 0; i < lista.size(); i++) {
				Object o = lista.get(i);			
			}*/
		/*for (Diccionario d : dao.find()) {
			//nombre = d.getTema();

		}*/
		
		//request.setAttribute("saludo", lista.get(1));
		String command = request.getParameter("name");
			request.setAttribute("nombre", command);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("/AhorcadoPage.jsp");
		rd.forward(request, response);
	}
}
