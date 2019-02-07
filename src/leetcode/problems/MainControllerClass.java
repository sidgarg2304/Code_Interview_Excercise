/**
 * 
 */
package leetcode.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cracking.code.interview.Linkedlist.LinkNode;
import cracking.code.interview.Linkedlist.ListListnode;

/**
 * @author siddgarg
 *
 */
public class MainControllerClass {
	
	
	static int sid;
	
	
	public static void main(String [] args) {
		
		
		
		MainControllerClass.sid=10;
		
		int indexes=0;
		
		int [] finalresult = new int[2];
		
		
		//Set<ArrayList<Integer>> finalResult = new HashSet<>();
		
		List<List<Integer>> finalResult = new ArrayList<>();
		LinkNode l1 ;
		LinkNode l2 ;
		
		Boolean tryNull;
		
		
		Solution_48 sp48 = new Solution_48();
		
		Solution_53 sp53 = new Solution_53();
		
		// initantiate a matrix 
		
		/*
		 * 11110
11010
11000
00000
		 */
		
		
		int [][] inputMatrix= {
				{0,1,0},
				{0,0,1},
				{1,1,1},
				{0,0,0}
		};
		
	//	[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
		
		int [] [] inoutMateix2= {
		    {0,1,2,0},
			{3,4,5,2},
			{1,3,1,5}
		};
		
		Solution_289 sp289 = new Solution_289();
		
	//	sp289.gameOfLife(inputMatrix);
		
		Solution_73 sp73 = new Solution_73();
		
	//	sp73.modifyMatrix(inoutMateix2);
		
		
		int [] input = {10,15,25};
		
		
		Solution_749 sp749 = new Solution_749();
		int cost =sp749.findMinCost(input);
		
		System.out.println(" the cost of doing business "+ cost);
		
		
	   int[][] emptyIsland= {};
	   
	 //  String input="  a   b ";
		
	   Solution_200 sp_200 = new Solution_200();
	   
	   Solution_695 sp695 = new Solution_695();
	   
	   Solution_151 sp151= new Solution_151();
	   
	  // String output=sp151.reverseWord(input);
	   
	//   System.out.println(output);
	   
	  //int finalArea= sp695.maxAreaOfIsland(island);
	  
	 // int finalArea2= sp695.findMaxIslandArea(island);
	  
	 // System.out.println(" the max area is" +finalArea);
	  
	//  System.out.println(" the max area from my method" + finalArea2);
	  
		
		
		//sp_200.findIsland(emptyIsland);
		
		
		Solution_34 sp34= new Solution_34();
		
		
		Solution_35 sp35= new Solution_35();
		
//		Soution_33 sp33 = new Soution_33();
		
		
//		Solution_27 sp27 = new Solution_27();
//		
//		
//		
//		Solution_Problem_26 sp26 = new Solution_Problem_26();
		
		
		
		Solution_39 sp39 = new Solution_39();
		
		Solution_40 sp40 = new Solution_40();
		
		Solution_15 sp15= new Solution_15();
		
		Solution_121 sp121= new Solution_121();
		
		Solution_658 sp658 = new Solution_658();
		
		
//		int [] nums= {12, 16, 22, 30, 35, 39, 42, 
//	               45, 48, 50, 53, 55, 56};
//		
//		sp658.findNearestKUsingBinary(nums, 4, 35);
		
		//sp53.findMaxSubArray(nums);
		
		//int [] nums= {100, 180, 260, 310, 40, 535, 695};
		
		//sp121.findMAxprofitMultipleTrans(nums);
		
		//int finalSum=sp121.findMaxProfit(nums);
		
		//System.out.println("Max sum in subarry" + finalSum);
			
			//{0,1,2,2,2,3,4};
		
		// [5,7,7,8,8,10]
		
		//System.out.println(" before the fucntion call");
		
		//finalResult=sp40.findUniCombination(nums, 8);
		
		//finalResult = sp15.findTriplets(nums);
		
		//finalResult= sp39.findSumCombination(nums, 8);
		
//		System.out.println(" after the fucntion call");
//		
//		if(finalResult.isEmpty()) {
//			
//			System.out.println(" return value is empty");
//		}
//		
//		System.out.println(" return array size--" + finalResult.size());
//		
//		for( List<Integer> temp: finalResult) {
//			
//			for( Integer tempnum :temp) {
//				
//				System.out.print(" "+ tempnum);
//				
//			}
//			
//			System.out.println("\n");
//			
//		}
//		
		
//		indexes= sp35.findIndex(nums, 7);
//		
//		System.out.println(" search resut index--" + (indexes));
		
		//finalresult= sp34.findIndex(nums, 6);
		
		//int result =sp33.binarySearch(nums, 0, 7, 4);
		
//		int result=sp27.removeDuplicate(nums, 2);
//		
//	System.out.println("final result[0]--->" + finalresult[0]);
//	
//	System.out.println("  final result[1]--->" + finalresult[1]);
		
//		Solution_problem4 sp4 = new Solution_problem4();
//		
//		tryNull= sp4.getIsAvpEntitlement();
//		
//		Solution_problem_3 sp3= new Solution_problem_3();
//		
//		int finalLenght= sp3.findLenghtOfLongestSubstring("abcabcbb");
//		
//		System.out.println("maxLength" +finalLenght );
		
//		Solution_Two_Sum sts= new Solution_Two_Sum();
//		ListListnode lln1= new ListListnode();
//		
//		ListListnode lln2= new ListListnode();
//		
//		lln1.createListappend(5);
//		lln1.createListappend(5);
//		lln1.createListappend(5);
//		
//		l1=lln1.getHead();
//		
//		System.out.println("first list");
//		lln1.printList();
//		
//
//		lln2.createListappend(5);
//		lln2.createListappend(5);
//		lln2.createListappend(5);
//		
//		l2=lln2.getHead();
//		
//		System.out.println("second list");
//		lln2.printList();
//		
//		sts.calculateSum(l1, l2);
		
	}

}
