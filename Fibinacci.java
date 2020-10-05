import java.util.Scanner;
import acm.program.*;

/*Fibinacci program by Robert Johns 10/4/2020
 * This program goes through the Fibinacci sequence until it gets to a value over 10000.
 */
public class Fibinacci{
	public static void main(String args[]) {
		
		//variables for each fibinacci sequence
		//these show the first two numbers of f(0), f(1), and f(2)
		int x=1;
		int y=1;
		System.out.println("0");
		System.out.println(x);
		System.out.println(y);
		
		/*this does the math and output the next value in the sequence and 
		 *stops when the next value is 10000 or more
		 */
		while((x<MAX_VAL)&&(y<MAX_VAL)) {
			x=x+y;
			y=y+x;
			if (x>=MAX_VAL) {
				break;
			}else {
				System.out.println(x);
				System.out.println(y);
			}
		}
	}
	
	//the max integer to not pass
	private static final int MAX_VAL = 10000;
}
