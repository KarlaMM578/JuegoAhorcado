/**
 * 
 */
package mx.uaemex.fi.juegos.ahorcado.modelo.error;

/*
 * @author Jonathan Omar Esquivel Cruz 
 * @version 1.0
 * */
public class ElementoRepetidoException extends RuntimeException {

	/**
	 * 
	 */
	public ElementoRepetidoException() {
		super();
	}

	/**
	 * @param message
	 */
	public ElementoRepetidoException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ElementoRepetidoException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ElementoRepetidoException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ElementoRepetidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
