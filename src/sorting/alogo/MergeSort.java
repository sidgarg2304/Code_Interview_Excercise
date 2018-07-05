/**
 * 
 */
package sorting.alogo;

import java.util.Arrays;

/**
 * @author siddgarg
 *
 */

//  static function can only call static varaibles and other static fucntions 
// otherwise declare the class object to access the non static fucntions and variables 

public class MergeSort {
	
	static int [] unSortedArray= {2,0,1,5,4};
	
	public static int[] divideArray(int [] input) {
		
		int arrayLenght=input.length;
		
		// condition to exit recurssive function
		if(arrayLenght<=1) {
			System.out.println("All divide done"+Arrays.toString(input));
			return input;
		}
		System.out.println("Length of unsorted array"+arrayLenght);
		
		int [] d= new int[arrayLenght];
		int [] a= new int[arrayLenght/2]; // declare new array with integer as values
		int [] b= new int[arrayLenght-arrayLenght/2];
		System.out.println("Lenght of array a"+ a.length+ "and"+ b.length);
		for (int i=0;i<a.length;i++) {
			a[i]=input[i];
		}
		for (int i=0;i<b.length;i++) {
			b[i]=input[i+arrayLenght/2];
		}
		System.out.println("Divided list value  a "+ Arrays.toString(a)+" divided value b"+ Arrays.toString(b));
		// it will keep reiterating till the function returns single value and then will call the final function
		
		d=mergeArray(divideArray(a),divideArray(b));
		System.out.println("Sorted return value list value  d "+ Arrays.toString(d));
		return d;
		
	}
	
	// normal process to merge two sorted arrays 
	// in merge sort case , the first process divide the whole array in sorted list and then merge them 
	
	// run time is O(n) as loop only runs for k=a.lenght+b.lenght so just n 
	public static int[] mergeArray(int [] a, int[] b) {
		int [] c= new int[a.length+b.length];
		int i=0, j=0;
		for(int k=0;k<c.length;k++) {
			System.out.println("Value of i--"+i+"Values of k--"+k+"Values of j--"+j);
			if(i>=a.length)        c[k]=b[j++];
			else if (j>=b.length) c[k]=a[i++];
			else if (a[i]<=b[j])  c[k]=a[i++];
			else                  c[k]=b[j++];
		System.out.println("Inside Merge Array Fucntion array c"+Arrays.toString(c));
		System.out.println("Inside Merge Array Fucntion array a"+Arrays.toString(a));
		System.out.println("Inside Merge Array Fucntion array b"+Arrays.toString(b));
		}
		return c;
		
	}
	
	public static void main(String [] args) {
		
		int[] finalArray;
		finalArray=divideArray(unSortedArray);
		System.out.println("Final sorted array"+ Arrays.toString(finalArray));
		//divideArray();
	}

}
