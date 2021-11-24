package mx.uaemex.fi.juegos.ahorcado.modelo.dispatcher;

import mx.uaemex.fi.juegos.ahorcado.modelo.data.Diccionario;
import mx.uaemex.fi.juegos.ahorcado.modelo.sql.DiccionarioDAOSqlImp2;

public class prueba {

	public static void main(String[] args) {
		System.out.print("ndnd");
		Diccionario diccionarios = new Diccionario();
		DiccionarioDAOSqlImp2 dao = new DiccionarioDAOSqlImp2();
		for (Diccionario d : dao.find()) {
			System.out.print(d.getTema());

		}
	}

}
