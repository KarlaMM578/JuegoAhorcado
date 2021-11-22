package mx.uaemex.fi.juegos.ahorcado.modelo.error;

public class ValorNoValidoException extends RuntimeException {

	public ValorNoValidoException() {
		super();
	}

	public ValorNoValidoException(String message) {
		super(message);
	}

	public ValorNoValidoException(Throwable cause) {
		super(cause);
	}

	public ValorNoValidoException(String message, Throwable cause) {
		super(message, cause);
	}

	public ValorNoValidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
