/**
 * 
 */
package mx.uaemex.fi.juegos.ahorcado.modelo.error;

/*
 * @author Jonathan Omar Esquivel Cruz 
 * @version 1.0
 * */
public class ElementoNoEncontradoException extends RuntimeException {

	/**
	 * 
	 */
	public ElementoNoEncontradoException() {
		super();
	}

	/**
	 * @param message
	 */
	public ElementoNoEncontradoException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ElementoNoEncontradoException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ElementoNoEncontradoException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ElementoNoEncontradoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
