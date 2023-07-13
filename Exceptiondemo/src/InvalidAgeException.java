
public class InvalidAgeException extends RuntimeException{
	String message;
	public InvalidAgeException() {}
	public InvalidAgeException(String message) {
		
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
