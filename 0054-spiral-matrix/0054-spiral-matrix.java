class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList();
         if (matrix.length == 0) 
            return result;
        
        
        
        int startRow =0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;
        
        while(startRow <= endRow && startCol <= endCol)
        {
            // Left to Right
            for(int col = startCol; col <= endCol;col++)
            {
                int number = matrix[startRow][col];
                result.add(number);
            }
                     startRow++;
   
            // From Top to bottom
            for(int row = startRow; row <= endRow; row++)
            {
                int number = matrix[row][endCol];
                result.add(number);
            }
              endCol--;

            if (startRow <= endRow) {
                                     // From Right to Left
  for(int col = endCol ; col >= startCol;col--)
            {
                int number = matrix[endRow][col];
                 result.add(number);
            }
        }
                        endRow--;

                       if (startCol <= endCol) {
  // From Bottom to Top
            for(int row = endRow ; row >= startRow; row--)
            {
                int number = matrix[row][startCol];
                result.add(number);
            }
                       }
                                  startCol++;

            
        }
        
        return result;
    }
}