/**
 * 
 */
package leetcode.problems;

/**
 * @author siddgarg
 * According to the Wikipedia's article: "The Game of Life, also known simply as Life, 
 * is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

Given a board with m by n cells, each cell has an initial state live (1) or dead (0). 
Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies, as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population..
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
Write a function to compute the next state (after one update) of the board given its current state. 
The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously.
 *
 */
public class Solution_289 {
	
	// we need to instantiate the matrix see below before using the matrix object
	int [][] modified;
	int row;
	int col;
	
	public void gameOfLife(int [][] board) {
		
		if(board==null || board.length==0 || board[0].length==0) {
			System.out.println("Nothing to process ");
		}else {
			
			 row=board.length;
			 col = board[0].length;
				modified = new int [row][col];
			 
			 for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						System.out.print("b"+ board[i][j]);
					}
					
					System.out.print("\n");
				}
			 
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					
					if(board[i][j]==0) {
						
						// to apply rules for Zero 
						int count1=findNumberofOnes(board,i+1,j+1) + findNumberofOnes(board,i-1,j-1) +findNumberofOnes(board,i+1,j-1)
						+findNumberofOnes(board,i-1,j+1)+findNumberofOnes(board,i-1,j)+findNumberofOnes(board,i+1,j)+findNumberofOnes(board,i,j-1)+findNumberofOnes(board,i,j+1);
						
						System.out.println(" value of count1--" + count1+ "value of i-j" + i +"-"+j);
						
						if(count1==3) {
							modified[i][j]=1;
						}
					}else if(board[i][j]==1) {
						// to apply rules for ones 
						int count=findNumberofOnes(board,i+1,j+1) + findNumberofOnes(board,i-1,j-1) +findNumberofOnes(board,i+1,j-1)
						+findNumberofOnes(board,i-1,j+1)+findNumberofOnes(board,i-1,j)+findNumberofOnes(board,i+1,j)+findNumberofOnes(board,i,j-1)+findNumberofOnes(board,i,j+1);
						
						System.out.println(" value of count--" + count+ "value of i-j" + i +"-"+j);
						
						if(count<2) {
							modified[i][j]=0;
						}else if( count>3) {
							modified[i][j]=0;
						}else if(2<=count && count<=3) {
							modified[i][j]=1;
						}
						
						
						
					}else {
						modified[i][j]=2;
					}
					
				}
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(modified[i][j]!=2) {
					 board[i][j]=modified[i][j];
					
				}
			}
		}
		
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(" a "+ board[i][j]);
			}
			
			System.out.print("\n");
		}
		
	}
	
	

	
	// function to count 1's  
	private int findNumberofOnes(int[][] board,int i,int j) {
		// TODO Auto-generated method stub
		if(i>=0 && i<row && j>=0 && j<col && board[i][j]==1) {
			return 1;
		}else {
		return 0;
	}
		}

}
