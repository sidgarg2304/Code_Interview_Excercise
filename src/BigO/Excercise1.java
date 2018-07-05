/**
 * 
 */
package BigO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author siddgarg
 *
 */

// Class implementing interface and function inside it 
public class Excercise1 implements Excerice1Inter {
	
	int i=0;
	
	
	// return function with try catch 
	
	public int sum(int n ) {

		try {
		if(n<0) {
			return 0;
		}
		System.out.println("inside sum"+i++);
		return n+sum(n-1);
		
		
	}catch(Exception e) {
		System.out.println("inside exceptiom");
	}
		return i;

}


//	@Override
//	public int sumArray(int n) {
//		
//		try {
//			//int i=0;
//		
//		List<Integer> gourpList = new ArrayList<Integer>();
//		List<Integer> sumtotal= new ArrayList<Integer>();
//		gourpList.add(1);
//		gourpList.add(2);
//		gourpList.add(3);
//		gourpList.add(5);
//		
//		// always try to SORT the ARRAY before any operation. Makes life easier 
//		
//		for (int i=0; i<gourpList.size();i++) {
//			
//			System.out.println("Current number"+gourpList);
//			for (int j=0; j<gourpList.size();j++) {
//				
//			
//			sumtotal.add(gourpList.get(i)+gourpList.get(j));
//			
//			System.out.println("Inside sum"+sumtotal+i+"---"+j);
//			}
//			
//			
//		}
//		
//		
//		if(sumtotal.contains(n)) {
//			System.out.println("Sum found"+n);
//			return n;
//		}else {
//			System.out.println("no match found");
//		}
//		}catch(Exception e) {
//			System.out.println("inside exception"+e);
//		}
//		
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//
//	@Override
//	public int subArrayZero(int[] arra) {
//		
//		//sub-array is continuous and maintains the order of the original array
//		//http://www.techiedelight.com/difference-between-subarray-subsequence-subset/#subarray
//		
//		
//		// TODO Auto-generated method stub
//		System.out.println("Array Size --"+arra.length);
//		Map<Integer,List<Integer>> allvalues= new HashMap<Integer,List<Integer>>();
//		List<Integer> arratotal1= new ArrayList<Integer>();
//		for (int i=0;i<arra.length;i++) {
//			List<Integer> arratotal= new ArrayList<Integer>();
//			
//			for (int j=i;j<arra.length;j++) {
//				
//				
//				
//				arratotal.add(arra[j]);
//				
//				System.out.println("index i--"+i+"index j--"+j);
//				
//				
//				
//			}
//			
//			allvalues.put(i, arratotal);
//			
//			System.out.println("All Vlaues--"+allvalues);
//		}
//		return 0;
//	}
}
