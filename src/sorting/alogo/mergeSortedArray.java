/**
 * 
 */
package sorting.alogo;

import java.util.Arrays;

/**
 * @author siddgarg
 *
 */
public class mergeSortedArray {
	
	static int [] a= {1,2,3,4,5};
	static int [] b= {6,7,8,9,10};
	
	public static void mergeSortedArray() {
		int [] c= new int[a.length+b.length];
		int i=0,j=0;
		for (int k=0;k<c.length;k++) {
			if(i>=a.length)        c[k]=b[j++];
			else if (j>=b.length) c[k]=a[i++];
			else if (a[i]<b[j]) {
				c[k]=a[i++];
			}else {
				c[k]=b[j++];
			}
			
		}
		
		System.out.println("Final merged sorted array"+ Arrays.toString(c));
	}
	
	public static void main(String [] args) {
		
		mergeSortedArray();
		
	}

}
