package ca.mb.rrc;

/**
 * Custom Invalid Operation Exception
 * 
 * @author Denis Buhrer Pedroso
 *
 */
public class InvalidOperationException extends Exception {
	private static final long serialVersionUID = 1L;

	//constructor
  public InvalidOperationException()
  {
    //calling constructor of parent class
    super("Invalid operation must be one of these (a=Add, s=Subtract, m=Multiply)\n");
  }
}//end of class
