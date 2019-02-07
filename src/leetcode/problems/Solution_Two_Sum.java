/**
 * 
 */
package leetcode.problems;

import cracking.code.interview.Linkedlist.LinkNode;
import cracking.code.interview.Linkedlist.ListListnode;

/**
 * @author siddgarg
 * 
 * Add two numbers
 * 
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 *
 */
public class Solution_Two_Sum {

	LinkNode l3 ;
	
	int carryOver=0;
	
	ListListnode lln= new ListListnode();
			
	
	public void calculateSum(LinkNode l1, LinkNode l2) {
		int sum=0;
		
		if(l1!=null && l2!=null && l1.getNext()!=null && l2.getNext()!=null) {
			
			System.out.println("CarryOver" + carryOver);
			
			sum=l1.getData()+l2.getData()+carryOver;
			
			System.out.println("Initial sum"+ sum);
			if(sum<=9) {
				
				lln.createListappend(sum);
				carryOver=0;
				
			}else {
				
				carryOver=1;
				sum=sum-10;
				lln.createListappend(sum);
				
				
			}
			
			
			calculateSum(l1.getNext(),l2.getNext());
			
			
		}
		
		else {
			
			sum=l1.getData()+l2.getData()+carryOver;
			lln.createListappend(sum);
			
		}
		
		System.out.println("Inside solution 02");
		lln.printList();
		
		
	}
}
