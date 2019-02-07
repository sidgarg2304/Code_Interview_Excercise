/**
 * 
 */
package leetcode.problems;

/**
 * @author siddgarg
 * 
 * 
 Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) 
 
 You may assume all four edges of the grid are surrounded by water.

 Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)
 *
 */
public class Solution_695 {
	
	int maxIslandArea=0;
	int islandArea=0;
	int islandArea2=0;
	
	public int findMaxIslandArea(int [][] input) {
		
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input[i].length;j++) {
				
				if(input[i][j]==1) {
					System.out.println("islandArea" +islandArea);
					islandArea=AreaOfIsland(input,i,j);
					System.out.println("islandArea" +islandArea);
					
				}
				
				
			}
			
		}
		
		System.out.println("the land area found" +islandArea2);
		

		
		return maxIslandArea;
		
	}

	private int dfsSearchIsland(int[][] island, int i, int j, int islandArea) {
		
		// TODO Auto-generated method stub
		if(i>=0  && i < island.length && j>=0 && j < island[i].length && island[i][j]==1) {
			
			// need to mark the node as already been counted so changing it value so not to find it again. 
			
			island[i][j]=0;
			return 1 + dfsSearchIsland(island,i+1,j,islandArea) + dfsSearchIsland(island,i-1,j,islandArea) + dfsSearchIsland(island,i,j+1,islandArea)+
			dfsSearchIsland(island,i,j-1,islandArea);
			
			
			
			
		}
		
		return 0;
	
	}
	
		
	
	 public int maxAreaOfIsland(int[][] grid) {
	        int max_area = 0;
	        for(int i = 0; i < grid.length; i++)
	            for(int j = 0; j < grid[0].length; j++)
	                if(grid[i][j] == 1)max_area = Math.max(max_area, AreaOfIsland(grid, i, j));
	        return max_area;
	    }
	    
	    public int AreaOfIsland(int[][] grid, int i, int j){
	        if( i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1){
	            grid[i][j] = 0;
	            return 1 + AreaOfIsland(grid, i+1, j) + AreaOfIsland(grid, i-1, j) + AreaOfIsland(grid, i, j-1) + AreaOfIsland(grid, i, j+1);
	        }
	        return 0;
	    }
	

}
