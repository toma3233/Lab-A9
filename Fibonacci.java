/**
 *   
 * @author Tom Abraham
 * Period # 1
 */
/** This class, Fibonacci, uses recursion to return the appropriate number within the series
 */
public class Fibonacci {
	/**
	 * This method accepts a value "n" and outputs the Fibonacci version of that number
	 * @param n is passed to the method so that the method can output the accurate Fibonacci number
	 * @return fib(n-1) + fib(n-2) if the input is greater than one, the program outputs the Fibonacci number
	 */

	public int fib(int n)
	{
	   if (n > 1){
	      return fib(n-1) + fib(n-2);
	   }else{
	      return n;
	   }

	}//end method

}//end class
