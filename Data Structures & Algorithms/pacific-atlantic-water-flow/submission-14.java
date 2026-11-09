class Solution {
    private static final int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
    int rows = heights.length, columns = heights[0].length;

       //need to instantiate boolean 2d grid to confirm if visited
       boolean[][] pac = new boolean[rows][columns];
       boolean[][] atl = new boolean[rows][columns];

        //traverse columns
       for (int c = 0; c < columns; c++) {
        dfs(0, c, pac, heights);
        dfs(rows-1, c, atl, heights);
       }
        //traverse rows
       for (int r = 0; r < rows; r++) {
        dfs(r, 0, pac, heights);
        dfs(r, columns-1, atl, heights);
       }

       
    List<List<Integer>> res = new ArrayList<>();
       for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (pac[r][c] && atl[r][c]) {
                    res.add(Arrays.asList(r,c));
                }
            }
       }
        return res;
    }
        // ocean for checking to see if visited
        //heights for checking to see if possible to traverse here
     public void dfs(int r, int c, boolean ocean[][], int[][] heights) {
        // set as visited; do NOT use ==. you arent seeing if its true, you are setting it as true
    
        ocean[r][c] = true;
        
        //loop for possible nearby positions
        for (int[] dir: directions) {
            int nr = r + dir[0], nc = c + dir[1]; 
            if (nr >= 0 && nr < heights.length && nc >= 0 && nc < heights[0].length && 
            !ocean[nr][nc] && heights[nr][nc] >= heights[r][c]) {
                dfs(nr, nc, ocean, heights);
            }
        }







    }
}
