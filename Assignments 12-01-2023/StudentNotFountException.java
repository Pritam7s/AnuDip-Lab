package batch_application;

public class StudentNotFountException extends RuntimeException{
	public StudentNotFountException(String message) {
		super(message);
	}
}
