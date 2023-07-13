
public class InsufficientBalanceException extends RuntimeException{
	String message;
	public InsufficientBalanceException() {}
	public InsufficientBalanceException(String message) {
		
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String toString() {
		return "com.diksha.InsufficientBalanceException: "+message;
	}
	
}
