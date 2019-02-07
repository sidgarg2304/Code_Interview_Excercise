/**
 * 
 */
package leetcode.problems;

/**
 * @author siddgarg
 * 
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.


// find the mid and check if that version is bad and then keep dividing 


 *
 */
public class Solution_278 {
	
	int badVersion;
	
	Boolean version;
	
	public int findFirstBadVersion(int [] input) {
		
		int high = input.length-1;
		
		int low =0;
		
		while(high>low) {
		
		int mid = low+((high-low)/2);
		
		if(!isBadVersion(input[mid])){
			low=mid+1;
		}else {
			high=mid;
		}
		
		
		}
		
		return low;
	}

	private boolean isBadVersion(int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
