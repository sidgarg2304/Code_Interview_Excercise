/**
 * 
 */
package leetcode.problems;

/**
 * @author siddgarg
 * 
 * 
 * Given a 2d grid map of '1's (land) and '0's (water), 
 * count the number of islands. 
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
 * You may assume all four edges of the grid are all surrounded by water.
 * 
 * 


 *
 */
public class Solution_200 {
	
	int count=0;
	
	public void findIsland(int [][] input) {
		
		
		// check boundary conditions
		
		
		if(input.length==0) {
			System.out.println(" Nothing to process");
		}
		
		
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input[i].length;j++) {
				System.out.print("-" + input[i][j]);
			}
			System.out.println("\n");
		}
		
		
		// iterate through the matrix to find island
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input[i].length;j++) {
				
				if(input[i][j]==1) {
					dfsFind(input,i,j);
					count++;
					
				}
				
				
			}
			
		}
		
		
		System.out.println("the island count is "+ count);
		
		
	}

	private void dfsFind(int[][] input, int i, int j) {
		// TODO Auto-generated method stub
		
		// condition checking matters and it checks from left to right . so i>=0 will be tested first and then j>=0 in that order
		
		if(i>=0 && j>=0 && i<input.length && j<input[i].length && input[i][j]==1) {
			input[i][j]=0;
			dfsFind(input,i+1,j);
			dfsFind(input,i-1,j);
			dfsFind(input,i,j+1);
			dfsFind(input,i,j-1);
		}
		
	}
	
	
	
	
	 public int numIslands(char[][] grid) {
		 
		 for(int i=0;i<grid.length;i++) {
			 for(int j=0;j<grid[i].length;j++) {
				 
				 if(grid[i][j]=='1') {
					 dfsFind(grid,i,j);
					 count++;
				 }
			 }
		 }
		return count;
	        
	    }

	private void dfsFind(char[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		if(i>=0 && j>=0 && i<grid.length && j<grid[i].length && grid[i][j]=='1') {
			grid[i][j]='0';
			dfsFind(grid,i+1,j);
			dfsFind(grid,i-1,j);
			dfsFind(grid,i,j-1);
			dfsFind(grid,i,j+1);
			
		}
		
	}

}
