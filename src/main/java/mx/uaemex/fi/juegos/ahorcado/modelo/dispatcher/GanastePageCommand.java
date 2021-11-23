package mx.uaemex.fi.juegos.ahorcado.modelo.dispatcher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.uaemex.fi.juegos.ahorcado.modelo.control.ICommand;

public class GanastePageCommand implements ICommand{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		return "GanastePage";
	}
	
}