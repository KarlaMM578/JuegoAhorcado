package mx.uaemex.fi.juegos.ahorcado.modelo.data;

/*
 * Clase abstracta para definor el id de los datos 
 * @author Jonathan Omar Esquivel Cruz 
 * @version 1.0
 * */
public abstract class ElementoConId implements Data{
	protected int id;

	/*Constructora*/
	public ElementoConId() {
		super();
	}
	
	/*
	 * Consulta el id 
	 * @return clave de identificación del objeto
	 * */
	public int getId() {
		return id;
	}

	/*
	 * Set id for object
	 * @param id Number identification
	 * */
	public void setId(int id) {
		this.id = id;
	}
	
}
