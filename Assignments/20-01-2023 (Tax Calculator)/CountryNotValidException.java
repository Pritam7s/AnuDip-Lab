package tax_Calculator;

public class CountryNotValidException extends RuntimeException{
	public CountryNotValidException(String message) {
		super(message);
	}
}
