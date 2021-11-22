package mx.uaemex.fi.juegos.ahorcado.modelo.error;

public class GanasteException extends RuntimeException {

	public GanasteException() {
		super();
	}

	public GanasteException(String message) {
		super(message);
	}

	public GanasteException(Throwable cause) {
		super(cause);
	}

	public GanasteException(String message, Throwable cause) {
		super(message, cause);
	}

	public GanasteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
