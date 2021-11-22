package mx.uaemex.fi.juegos.ahorcado.modelo.error;

public class JuegoInconsistenteException extends RuntimeException {

	public JuegoInconsistenteException() {
		super();
	}

	public JuegoInconsistenteException(String message) {
		super(message);
	}

	public JuegoInconsistenteException(Throwable cause) {
		super(cause);
	}

	public JuegoInconsistenteException(String message, Throwable cause) {
		super(message, cause);

	}

	public JuegoInconsistenteException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
