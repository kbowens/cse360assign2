/**
 * Kevin Owens
 * Class ID: 520
 * CSE360 Assignment 2
 * Performs basic calculator functions, such as add, subtract, multiply, and
 *  divide operations
 */
package cse360assign2;

public class Calculator {

	private int total;
	
	/**
	 * This is the Constructor for the Calculator class.
	 * It creates a new calculator object with the variable total initialized to 
	 * 0. It has no parameters.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * the getTotal method returns the calculator's current total.
	 * 
	 * @return total the value of the total.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * The add method adds a specified value to the calculator's total.
	 * 
	 * @param value the number that is to be added to the calculator's total.
	 */
	public void add (int value) 
	{	
		total = total + value;
	}
	
	/**
	 * The subtract method subtracts a specified value from the calculator's
	 * total.
	 * 
	 * @param value the number that is to be subtracted from the total.
	 */
	public void subtract (int value) 
	{
		total = total - value;
	}
	
	/**
	 * The multiply method multiplies the current total by a specified value.
	 * 
	 * @param value the number that will be multiplied by the total.
	 */
	public void multiply (int value) 
	{
		total = total * value;
	}
	
	/**
	 * The divide method uses integer division to divide the total by a specified
	 * value. If the parameter is 0, total is set to 0.
	 * 
	 * @param value the number that will divide the total.
	 */
	public void divide (int value) 
	{
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}
	}
	
	/**
	 * The getHistory method returns a history of all calculator actions as a 
	 * String.
	 * 
	 * @return the string that contains the history of all calculator actions.
	 */
	public String getHistory () {
		return "";
	}
}
