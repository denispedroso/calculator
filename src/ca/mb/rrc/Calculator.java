package ca.mb.rrc;

import java.util.Scanner;

public class Calculator {
	
	Scanner sc;
	String input;
	boolean error = true; 
	int firstValue = 0;
	int secondValue = 0;
	String opValue;
	int result = 0;

	public Calculator() {
		sc = new Scanner(System.in);
	}

	public void printHeader() {
		// Print Header
		System.out.println("---------------------");
		System.out.println("- Red River College -");
		System.out.println("- Custom Calculator -");
		System.out.println("---------------------\n");
	}

	public void getFirtValue() {
		do {
			try {
				System.out.print("Enter first value: ");
				input = sc.next();
				if (isInteger(input)) {
					firstValue = Integer.parseInt(input);
					if (firstValue <= 0) {
						error = true;
						throw new CustomValidationException("Integers must be greater than zero!");
					}
					error = false;
				} else {
					error = true;
					throw new CustomValidationException("Must be an integer!");
				}
			} catch (CustomValidationException e) {
				System.out.println(e.getMessage());
			}//end try-catch
		} while (error);
	}//End of getFirtValue

	public void getSecondValue() {
		do {
			try {
				System.out.print("Enter second value: ");
				input = sc.next();
				if (isInteger(input)) {
					secondValue = Integer.parseInt(input);
					if (secondValue <= 0) {
						error = true;
						throw new CustomValidationException("Integers must be greater than zero!");
					}
					error = false;
				} else {
					error = true;
					throw new CustomValidationException("Must be an integer!");
				}
			} catch (CustomValidationException e) {
				System.out.println(e.getMessage());
			}//end try-catch
		} while (error);
	}// End of getSecondValue

	public void getOperation() {
		do {
			try {
				System.out.print("Enter operation(a=Add, s=Subtract, m=Multiply): ");
				opValue = sc.next();
				switch (opValue) {
					case "a":
						result = addition(firstValue, secondValue);
						error = false;
						break;
					
					case "s":
						result = subtract(firstValue, secondValue);
						error = false;
						break;

					case "m":
						result = multiply(firstValue, secondValue);
						error = false;
						break;
				
					default:
						error = true;
						throw new InvalidOperationException();
				}
			} catch (InvalidOperationException e) {
				System.out.println(e.getMessage());
			}//end try-catch

		} while (error);
	}// End of getOperation

	public void printResult() {
		// Print a blank line
		System.out.println("");

		// Print valid date response.
		System.out.println("The total is "+ String.valueOf(result) + "\n");
		sc.close();
	}// End of printResult

	public int addition(int first, int second) {
		int result = first + second;
		return result;
	}// End of addition

	public int subtract(int first, int second) {
		int result = first - second;
		return result;
	}// End of subtract

	public int multiply(int first, int second) {
		int result = first * second;
		return result;
	}// End of multiply

	public boolean isInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    } catch(NullPointerException e) {
        return false;
    }//end try-catch
    return true;
	}// End of isInteger
}
