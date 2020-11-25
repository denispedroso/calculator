package ca.mb.rrc;

/**
 * Custom Class Validation Exception
 * 
 * @author Denis Buhrer Pedroso
 *
 */
public class CustomValidationException extends Exception
{
	private static final long serialVersionUID = 1L;

//constructor
  public CustomValidationException(String msg)
  {
    //calling constructor of parent class
    super(msg + "\n");
  }
}//end of class
