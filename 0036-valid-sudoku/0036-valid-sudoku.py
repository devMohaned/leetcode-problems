class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = collections.defaultdict(set)
        cols = collections.defaultdict(set)
        square = collections.defaultdict(set)    

        for c in range(0,9):
            for r in range(0,9):
                currentVal = board[r][c]
                isDuplicateRow = currentVal in rows[r]
                isDuplicateCol = currentVal in cols[c]
                isDuplicateSquare = currentVal in square[r//3, c//3]
                if(isDuplicateRow or isDuplicateCol or isDuplicateSquare):
                    return False
                if(currentVal == "."):
                    continue
                
                rows[r].add(currentVal)
                cols[c].add(currentVal)
                square[(r//3,c//3)].add(currentVal)

        return True