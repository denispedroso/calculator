package ca.mb.rrc;

/**
 * Develop an application that add, subtract and multiply integers.
 * 
 * @author Denis Buhrer Pedroso
 *
 */
public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		calculator.printHeader();
		calculator.getFirtValue();
		calculator.getSecondValue();
		calculator.getOperation();
		calculator.printResult();
		
	}
}
