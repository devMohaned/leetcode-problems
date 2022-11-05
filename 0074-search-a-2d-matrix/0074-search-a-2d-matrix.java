class Solution {
    // Time Complexity: O(Rows + Columns)
    // Space Complexity: O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null) return false;
        
        int row = 0;
        int column = matrix[0].length - 1;
        int rowLength = matrix.length;
        while(row <  rowLength && column >= 0)
        {
            if(matrix[row][column] == target)return true;
            else if(matrix[row][column] > target)    column--;
            else row++;
        }
        
        return false;
    }
}