package Graphs;

public class NumOfIslands {

    public int numIslands(char grid[][])
    {
        // Base Case
        if(grid == null || grid.length == 0)
        {
            return 0;
        }

        // Find row and cols
        int r = grid.length;
        int c= grid[0].length;

        int countIslands = 0;

        // Iterate to find position of 1's
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    countIslands++;
                    dfs(grid, i, j);
                }
            }
        }
        return countIslands;
    }

    public void dfs(char grid[][], int i, int j)
    {
        int r = grid.length;
        int c= grid[0].length;

        if(i<0 || j<0 || i >= r || j>= c || grid[i][j] == '0')
        {
            return;
        }
        // Mark position as visited by replacing 1 by 0
        grid[i][j] = '0';

        // Move in all directions from 1 to find land occupied by island
        dfs(grid, i-1, j); // left
        dfs(grid, i+1,j); // right
        dfs(grid, i, j-1); // top
        dfs(grid, i, j+1); // bottom

    }

    public static void main(String[] args) {
        NumOfIslands solution = new NumOfIslands();

        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(solution.numIslands(grid1)); // Output: 1

        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(solution.numIslands(grid2)); // Output: 3
    }
}

//    numIslands: This is the main function that initializes the island count and iterates through each cell in the grid.
//            If it finds a land cell ('1'), it increments the island count and calls the dfs helper function to mark all connected land cells.
//        dfs : This function performs a depth-first search to mark all cells in the current island.
//            It marks the current cell as visited by setting it to '0' and recursively calls itself for all four possible directions (up, down, left, right).
