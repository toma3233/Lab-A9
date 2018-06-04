/**
 * 
 * @author Tom Abraham
 * Period #1
 *
 */
/** This class contains a method than can recursively calculate the product of two numbers */
public class Multiplication {
	/**
	 * This method recursively calculates the product of two numbers, rather than using an "*"
	 * @param a first value that is passed into the method
	 * @param b second value that is passed into the method
	 * @return  a + mult(a, b-1) this returns the final product of the two values if they pass the base cases
	 */
	public static int mult(int a, int b)
	{
		if (a == 0 || b == 0){
		   return 0;
		   }
		   else if (a == 1){
		      return b;
		      }
		   else if (b == 1){
		      return a;
		      }
        
         else if(b < 0){
            return -a + mult(a, b+1);
         }
         else if(a < 0){
            return -b + mult(a+1, b);
         }
       
      
		   else{
		      return a + mult(a, b-1);
		      }//Your code goes here
		

	}
}

