/**
 * 
 */
package leetcode.problems;

/**
 * @author siddgarg
 * 
 * 
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Note:

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 *
 *
 *
 * for (int x = 0; x < N / 2; x++) 
        { 
            // Consider elements in group of 4 in  
            // current square 
            for (int y = x; y < N-x-1; y++) 
            
            
 */
public class Solution_48 {

	
	public void rotateMatrix(int a [] []) {
		
		
//		// find iterate over the matrix length  that is how many rows are there in the matrix
//		
//		
//		// copying the matrix to another one to use it for clockwise operation 
//		
		int [][] matrix1=a;
		
		System.out.println(" matrix 1");
		
		for(int k=0;k<matrix1.length;k++) {
			for(int l=0;l<matrix1[k].length;l++) {
				
				System.out.print(matrix1[k][l]+ " ");
			}
			
			System.out.print("\n");
		}

		
		// 
		int N = a.length;
		
		for(int i=0;i<N/2;i++) {
			
			for(int j=i;j<N-i-1;j++) {
				
				// store the value in temp variable
				int temp = a[i][j]; 
	            a[i][j] = a[N - 1 - j][i]; 
	            a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j]; 
	            a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i]; 
	            a[j][N - 1 - i] = temp; 
	            
			}
		}
				

		
		
	}
}
