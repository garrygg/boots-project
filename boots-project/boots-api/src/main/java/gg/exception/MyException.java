package gg.exception;

public class MyException extends Exception {

	private Integer errorCode;
	public  MyException(){}

	public MyException(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public MyException(String message) {
		super(message);
	}

	public MyException(String message, Integer errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public MyException(String message, Throwable cause, Integer errorCode) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public MyException(Throwable cause, Integer errorCode) {
		super(cause);
		this.errorCode = errorCode;
	}
}
