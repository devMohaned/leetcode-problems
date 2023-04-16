class Solution {
    public int uniquePaths(int rowCount, int columnCount) {
        int[][] paths = new int[rowCount][columnCount];
        
        for(int i = 0; i < rowCount; i++)
        {
            for(int j = 0; j < columnCount; j++)
            {
                if(i == 0 || j == 0) paths[i][j] = 1;
                else 
                    paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
            }
        }
        return paths[rowCount - 1][columnCount - 1];
    }
}