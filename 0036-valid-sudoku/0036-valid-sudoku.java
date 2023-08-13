class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> visitedSet = new HashSet(); 
        
        
       for(int row = 0; row < 9; row++)
       {
           for(int col =0; col < 9; col++)
           {
               char number = board[row][col];
               if(number != '.') {
               
               
               boolean colDoesNotContainsRepetition = visitedSet.add("Columns Visited" + col + "Has Number: " + number);
               boolean subboxesDoesNotContainRepetition = visitedSet.add("Square (" + row/3 +", " + col/3 + ") Has Number:" + number);
               
               if(!visitedSet.add("Row Visited " + row + "Has Number: " + number) || !colDoesNotContainsRepetition || !subboxesDoesNotContainRepetition)
                   return false;
               }
           }
       }
        return true;
    }
}