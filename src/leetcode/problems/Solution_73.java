/**
 * 
 */
package leetcode.problems;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author siddgarg
 * 
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
 * 
 * Use the first column and the first row as marker:

first scan through the whole matrix, and if one row i has zero, label matrix[i][0] = 0, if column j has zero, then label matrix[0][j] = 0.
if we find the first row has zero, then mark a boolean row = true, if the first column has zeros, mark a boolean col = true;

By the markers on the first row and first col, set the other columns and rows to zeros. (first row and first column already contain zeros)

According to booleans row and col, decide whether to set first row and column to zeros.
 *
 */

public class Solution_73 {
	
	Boolean rowI=false;
	boolean colJ=false;
	
	public void modifyMatrix(int [][] input) {
		
		// checking the null condition before making any calculations 
		
		if(input==null || input.length==0 || input[0].length==0) return;
		
		
	 int row= input.length;
	 int col = input[0].length;
		
		
for(int m=0;m<input.length;m++) {
			
			for(int n=0;n<input[m].length;n++) {
				
				System.out.print("-" + input[m][n]);
			}
			
			System.out.println("\n");
		}

// if we are using the first row  and column to store the data and we have to use the other variables to make 
//sure we take care of any zero's in the first row and first column 
		
		for(int i=0;i<input.length;i++) {
		
				for(int j=0;j<input[i].length;j++) {
					
					
					if(input[i][j]==0) {
						input[0][j]=0;
						input[i][0]=0;
						if(i==0) rowI=true;
						if(j==0) colJ=true;
						
					}
					
//						
//						if(input[i][j]==0 && (!valueofI.contains(i)) && (!valueofJ.contains(j))) {
//							
//							valueofI.add(i);
//							valueofJ.add(j);
//							
//							for(int k=0;k<input.length;k++) {
//								input[k][j]=0;
//							}
//							for(int l=0;l<input[i].length;l++) {
//								input[i][l]=0;
//							}
//							
//						}	
						
					
				}
			
		}
		
		// once we go though all the matrix , we will set the zero's now 
		
		
		
		
		// starting from the second row and first row is taken care by the boolean
		
		for(int i=1;i<input.length;i++) {
			if(input[i][0]==0) {
				for(int j=1;j<input[i].length;j++) {
					input[i][j]=0;
				}
			}
			
		}
		
		
		for(int j=1;j<col;j++) {
			if(input[0][j]==0) {
				for(int i=1;i<row;i++) {
					input[i][j]=0;
				}
			}
		}
		
		if(rowI)
			for(int j=0;j<col;j++)
				input[0][j]=0;
		
		
		if(colJ)
			for(int i=0;i<row;i++)
				input[i][0]=0;
		
		
		
		
		
		
		
		
		// the check output loop
		for(int m=0;m<input.length;m++) {
			
			for(int n=0;n<input[m].length;n++) {
				
				System.out.print("-" + input[m][n]);
			}
			
			System.out.println("\n");
		}
		
	}
	

}
