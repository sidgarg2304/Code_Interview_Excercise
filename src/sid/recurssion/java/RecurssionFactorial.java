/**
 * 
 */
package sid.recurssion.java;

/**
 * @author siddgarg
 *
 */
public class RecurssionFactorial {
	
	public static int recusrssionFunction(int n) {
		if(n==1) return 1;
		System.out.println("Inside recursion---"+n);
		return n*recusrssionFunction(n-1);
		
	}
	
	public static void main(String [] args) {
		int n= recusrssionFunction(5);
		System.out.println("Factorial---"+ n );
	}

}
