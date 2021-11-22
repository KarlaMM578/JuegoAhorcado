package mx.uaemex.fi.juegos.ahorcado.modelo.error;

public class PerdisteException extends RuntimeException {

	public PerdisteException() {
		super();
	}

	public PerdisteException(String message) {
		super(message);
	}

	public PerdisteException(Throwable cause) {
		super(cause);
	}

	public PerdisteException(String message, Throwable cause) {
		super(message, cause);
	}

	public PerdisteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
