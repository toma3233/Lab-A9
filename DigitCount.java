/**
 * 
 * @author Tom Abraham
 * period #1
 */
import java.util.Random;

public class DigitCount {
   Random rand;
	public DigitCount(int seed)
	{
		rand  = new Random(seed);  //Your code goes here
	}
	/**
	 * Method to generate a new number between 0 and max-1
	 * @param max generates a number smaller than max
	 * @return a random number between 0 and max-1
	 */
	public int generateNewNumber(int max){
	   return rand.nextInt(max);
	}
	/**
	 * Recursively counts the number of digits in the given number
	 * @param num - the given number
	 * @return number of digits in num
	 */
	public int countDigits(int num)
	{
		if (num < 1){
		   return 0;
		}
		else{
		   int amtOfDigits = 0;
		   amtOfDigits++;
		   return 1 + countDigits(num / 10);
		   
		}
	}
}
