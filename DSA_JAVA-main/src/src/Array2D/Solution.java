package Array2D;

import java.util.*;

class Solution {
        public int solution(String[] plan) {
//            if (plan == null || plan.length == 0 || plan[0].length() == 0) {
//                return 0;
//            }
//
//            int rows = plan.length;
//            int cols = plan[0].length();
//            boolean[][] visited = new boolean[rows][cols];
//            int runs = 0;
//
//            for (int i = 0; i < rows; i++) {
//                for (int j = 0; j < cols; j++) {
//                    if (plan[i].charAt(j) == '*' && !visited[i][j]) {
//                        dfs(plan, i, j, visited);
//                        runs++;
//                    }
//                }
//            }
//
//            return runs;
//        }
//
//    private void dfs(String[] plan, int row, int col, boolean[][] visited) {
//        int[] dr = {-1, 1, 0, 0}; // Possible moves: up, down, left, right
//        int[] dc = {0, 0, -1, 1};
//        int rows = plan.length;
//        int cols = plan[0].length();
//
//        visited[row][col] = true;
//
//        for (int i = 0; i < 4; i++) {
//            int newRow = row + dr[i];
//            int newCol = col + dc[i];
//
//            if (isValidCell(newRow, newCol, rows, cols) && plan[newRow].charAt(newCol) == '*' && !visited[newRow][newCol]) {
//                dfs(plan, newRow, newCol, visited);
//            }
//        }
//    }
//
//    private boolean isValidCell(int row, int col, int rows, int cols) {
//        return row >= 0 && row < rows && col >= 0 && col < cols;
//    }
//
//    public static void main(String[] args) {
//            String[] plan = {
//                    ".*#..*",
//                    ".*#*.#",
//                    "######",
//                    ".*..#.",
//                    "...###"
//            };
//
//            Solution solution = new Solution();
//            int minimumRuns = solution.solution(plan);
//
//            System.out.println("Minimum number of robot runs needed: " + minimumRuns);
//        }
//    }

            int row = plan.length;
            int col = plan[0].length();

            boolean[][] visited = new boolean[row][col];

            int minRuns = 0;

            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    if (plan[i].charAt(j) == '*' && !visited[i][j]) {

                        minRuns++;

                        dfs(plan, visited, i, j, row, col);
                    }
                }
            }

            return minRuns;
        }

    private void dfs(String[] plan, boolean[][] visited, int r, int c, int R, int C) {

        visited[r][c] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int k = 0; k < 4; k++) {
            int nr = r + dr[k];
            int nc = c + dc[k];

            if (nr >= 0 && nr < R && nc >= 0 && nc < C &&
                    plan[nr].charAt(nc) != '#' && !visited[nr][nc])
            {
                dfs(plan, visited, nr, nc, R, C);
            }
        }
    }

    public static void main(String[] args) {
        String[] plan1 = {
                ".*#..*",
                ".*#*.#",
                "######",
                ".*..#.",
                "...###"
        };

        String[] plan2 = {
                "*#..",
                "#..#",
                ".##.",
                "...*"
        };

        String[] plan3 = {
                "**###**",
                "*#*#*#*",
                "##*#*##",
                "*#***#*",
                ".#####.",
                "..*#*.."
        };

        Solution solution = new Solution();
        int minimumRuns1 = solution.solution(plan1);
        int minimumRuns2 = solution.solution(plan2);
        int minimumRuns3 = solution.solution(plan3);

        System.out.println("Minimum number of robot runs needed for plan1: " + minimumRuns1);
        System.out.println("Minimum number of robot runs needed for plan2: " + minimumRuns2);
        System.out.println("Minimum number of robot runs needed for plan3: " + minimumRuns3);
    }
}

