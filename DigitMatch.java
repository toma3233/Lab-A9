/**
 * 
 * @author Tom Abraham
 * period #1
 */
public class DigitMatch {
	/**
	 * Counts the number of matching digits in the two given integers
	 * @param x - first integer
	 * @param y - second integer
	 * @return number of matching digits
	 */
	public int countMatch(int x, int y) {
if(x < 0 || y < 0)
        return 0;
        
    if(x < 10 || y < 10)
        return x % 10 == y % 10 ? 1 : 0;
        
    if(x % 10 == y % 10)
        return 1 + countMatch(x/10, y/10);
        
    return countMatch(x/10, y/10);
}
}

