/**
 * 
 * @author Tom Abraham
 * period #1
 */
public class WriteSequence {
	/**
	 * Writes the sequence of numbers in the descending and then ascending order
	 * @param n - numbers in the sequence
	 */
	public void write(int n)
	{
		if (n == 1){
		   System.out.print("1");
		}
		else if (n == 2){
		   System.out.print("1 1");
		}
	   else if (n % 2 == 0){
		     System.out.print(n / 2 + " ");
		     write(n - 2);
		     System.out.print(" " + n / 2);
		  }
		else if (n % 2 != 0) {
		     System.out.print((n / 2 + 1) + " ");
		     write(n - 2);
		     System.out.print(" " + (n / 2 + 1));

		  }
		}
	   
	}
