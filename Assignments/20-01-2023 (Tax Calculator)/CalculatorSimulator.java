package tax_Calculator;

public class CalculatorSimulator {

	public static void main(String[] args) {
		try {
			TaxCalculator.employee();
			
			try {
				TaxCalculator.country();
				
				try {
					TaxCalculator.calculateTax();
				}
				catch(TaxNotElligibleException tx) {
					System.out.println(tx.getMessage());
				}
			}
			catch(CountryNotValidException ce) {
				System.out.println(ce.getMessage());
			}
		}
		catch(EmployeeNameInvalidException en) {
			System.out.println(en.getMessage());
		}
	}

}
