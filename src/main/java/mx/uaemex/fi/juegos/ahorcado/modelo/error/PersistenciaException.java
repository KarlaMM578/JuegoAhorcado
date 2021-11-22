package mx.uaemex.fi.juegos.ahorcado.modelo.error;
/*
 * @author Jonathan Omar Esquivel Cruz 
 * @version 1.0
 * */
public class PersistenciaException extends RuntimeException {

	public PersistenciaException() {
		super();
	}

	/**
	 * @param message
	 */
	public PersistenciaException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public PersistenciaException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public PersistenciaException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public PersistenciaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
