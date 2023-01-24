package tax_Calculator;

public class TaxNotElligibleException extends RuntimeException {
	public TaxNotElligibleException(String message) {
		super(message);
	}
}
