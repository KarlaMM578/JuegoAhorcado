package mx.uaemex.fi.juegos.ahorcado.modelo.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherHomePage {
	public void dispatcher(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//String command = request.getParameter("command");
		
		request.setAttribute("saludo", "-----");
		request.setAttribute("letra", request.getParameter("letra"));
		
		RequestDispatcher rd=request.getRequestDispatcher("/HomePage.jsp");
		rd.forward(request, response);
	}
}
