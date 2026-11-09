class Solution {
    //need a bfs algorithm
    //start at the top left corner
    //Utilize a queue and check nearby elements first

    // 1 1 0
    // 0 0 0
    // 0 0 1

    private static final int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public void bfs(char[][] grid, int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = '0';
        q.add(new int[]{r, c});

        while (!q.isEmpty()) {
            int[] node = q.poll(); //0(1)
            int row = node[0], column = node[1];
            System.out.println(row + " " + column);

            for (int[] dir: directions) {
                int nr = row + dir[0], nc = column + dir[1];
                if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length
                && grid[nr][nc] == '1') {
                    q.add(new int[]{nr,nc});
                    grid[nr][nc] = '0';
                }
            }
        }
    } 

    public int numIslands(char[][] grid) {
        int rows = grid.length, columns = grid[0].length;
        int islands = 0;

        for (int r = 0; r < rows; r++) { //
            for (int c = 0; c < columns; c++) {
                if (grid[r][c] == '1') {
                    bfs(grid, r, c);
                    islands++;
                }
            }
        }
        return islands;
    }
}
