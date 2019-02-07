/**
 * 
 */
package visa.code.problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author siddgarg
 * 
 * Given an array of integers, 
 * 
 * return an array where each respective location contains the product of the 
 * numbers except the one that occupied this same location in the input array. 
 * Thus, given in={1,2,3}, out={6,3,2}.
 *
 */
public class ProductOfNumber {
	
	
	public static int[] productOfNumbers(int input[]) {
		
		
		
		LinkedHashMap<String,String> timeZoneRuleSql = new LinkedHashMap<>();
		timeZoneRuleSql.put("Country-Timezone-Rule", "1");
		timeZoneRuleSql.put("Country-State-Timezone-Rule", "2");
		timeZoneRuleSql.put("Country-State-Default Timezone-Rule", "3");
		timeZoneRuleSql.put("Country-Default Timezone-Rule", "4");
		
		
		for (Map.Entry<String, String> sql : timeZoneRuleSql.entrySet()) {
			
			System.out.println("Value +" + sql.getKey() + "Value " + sql.getValue());
		}
		
		
		
		int finalProduct[] = new int[input.length];
		
		for(int i=0;i<input.length;i++) {
			
			int productValue=1;
			for(int j=0;j<input.length;j++) {
				
				if(i!=j) {
					
					productValue=productValue*input[j];
					
					System.out.println("Product Value"+productValue);
				}
				
				finalProduct[i]=productValue;
				
			}
		}
		
		return finalProduct;
		
	}
	
	
	public static void main(String args[]) {
		
		int inputValue[]= {1,2,3};
		
		int finalOutput[]= {};
		
		finalOutput=productOfNumbers(inputValue);
		
		for(int k=0;k<finalOutput.length;k++) {
			System.out.println("Output Value"+finalOutput[k]);
		}
	}

}
