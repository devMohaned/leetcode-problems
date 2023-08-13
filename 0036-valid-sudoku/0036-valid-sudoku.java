class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> visitedSet = new HashSet(); 
        
        
       for(int row = 0; row < 9; row++)
       {
           for(int col =0; col < 9; col++)
           {
               char number = board[row][col];
               if(number == '.') continue;
               
               boolean rowDoesNotContainsRepetition = visitedSet.add("R"+row + number);
               boolean colDoesNotContainsRepetition = visitedSet.add("C"+col + number);
               boolean subboxesDoesNotContainRepetition = visitedSet.add("S" + row/3 + col/3 + number);
               
               if(!rowDoesNotContainsRepetition || !colDoesNotContainsRepetition || !subboxesDoesNotContainRepetition)
                   return false;
           }
       }
        return true;
    }
}