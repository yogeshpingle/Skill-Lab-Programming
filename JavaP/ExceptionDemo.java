/**
 * @(#)ExceptionDemo.java
 *
 *
 * @author 
 * @version 1.00 2009/1/26
 */


public class ExceptionDemo 
{
	public static void main(String args[])
	{
		int a = 10, b = 0, c = 0;
		try
		{
			c = a / b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("The Exception is: "+e);
		}
		catch(NullPointerException e)
		{
			System.out.println("The Null Excepetiob is: "+e);
		}
		finally
		{
			System.out.println("In Finally");
			System.out.println("The Result is: "+c);
		}		
	}
}