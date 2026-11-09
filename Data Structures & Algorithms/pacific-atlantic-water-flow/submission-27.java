class Solution {
    int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    public void dfs(int r, int c, boolean[][] visited, int[][] grid) {
        int rows = visited.length, cols = visited[0].length;
        visited[r][c] = true;


        for (int[] dir : directions) {
            int nr = r + dir[0], nc = c + dir[1];

            if (nr >= 0 && nr < rows && nc >= 0 && nc < cols
            && grid[nr][nc] >= grid[r][c] && !visited[nr][nc]) {
                dfs(nr,nc, visited, grid);
            }
        }

    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length, cols = heights[0].length;
        boolean[][] pac = new boolean[rows][cols];
        boolean[][] atl = new boolean[rows][cols];


        for (int r = 0; r < rows; r++) {
            dfs(r, 0, pac, heights);
            dfs(r, cols-1, atl, heights);
        }

        for (int c = 0; c < cols; c++) {
            dfs(0, c, pac, heights);
            dfs(rows-1, c, atl, heights);
        }
        List<List<Integer>> visited = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (pac[r][c] && atl[r][c]) {
                    visited.add(Arrays.asList(r,c));
                }
            }
        }
    return visited;
    }
}
