/**
 * 
 */
package BigO;

import java.util.List;
import java.util.ArrayList;

/**
 * @author siddgarg
 *
 */

// Main class
public class MainControlClass {

	// Main function for java 
	public static void main(String[] arg) {
		
		/*
		 * List is an interface and Arraylist is implementation of the List interface 
		 * 
		 * We can initialise the class object by interface name also
		 * 
		 * Allows to use the same class object to access   other functions ( On other class implementation) later in the code 
		 * 
		 */
		
		// Lamda expression
		
		//int b=5;
		
		Excerice1Inter lambdaexp = (b) -> 10;
		
		System.out.println("output---"+lambdaexp.sum(5));
		
		//List<Integer> arrayList= new ArrayList<Integer>();
		
		// Excercise1 a= new Excercise() --- Declaring calss object by class name 
		
		// Below defining class object by using interface/ 
		//Excerice1Inter a= new Excercise1();// declaring the object and then referring it to actual class 
		try {
		
		//int n=a.sum(4);
			//int n=a.sumArray(5);
			
		//	int arralist[]= {1,-2,-5,4,5};
			
			//int n=a.subArrayZero(arralist);
			
		//System.out.println("output"+n);
		
	}catch(Exception e){
		System.out.println("inside error block");
	}
		
	}

}
