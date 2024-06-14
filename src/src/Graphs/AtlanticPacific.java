package Graphs;


import java.util.ArrayList;
import java.util.List;

public class AtlanticPacific {

    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private int m, n;

    public List<List<Integer>> pacificAtlantic(int[][] heights)
    {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0) {
            return result;
        }

        m = heights.length;
        n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            dfs(heights, pacific, i, 0);
            dfs(heights, atlantic, i, n - 1);
        }

        for (int j = 0; j < n; j++) {
            dfs(heights, pacific, 0, j);
            dfs(heights, atlantic, m - 1, j);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> cell = new ArrayList<>();
                    cell.add(i);
                    cell.add(j);
                    result.add(cell);
                }
            }
        }

        return result;
    }

    private void dfs(int[][] heights, boolean[][] visited, int r, int c) {
        visited[r][c] = true;
        for (int[] direction : DIRECTIONS) {
            int newRow = r + direction[0];
            int newCol = c + direction[1];
            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !visited[newRow][newCol] && heights[newRow][newCol] >= heights[r][c]) {
                dfs(heights, visited, newRow, newCol);
            }
        }
    }

    public static void main(String[] args) {
        AtlanticPacific solver = new AtlanticPacific();
        int[][] heights1 = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        System.out.println(solver.pacificAtlantic(heights1));  // Expected output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]

        int[][] heights2 = {
                {1}
        };
        System.out.println(solver.pacificAtlantic(heights2));  // Expected output: [[0,0]]
    }
}
