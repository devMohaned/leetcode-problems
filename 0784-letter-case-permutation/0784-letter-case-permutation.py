class Solution:
    def letterCasePermutation(self, s: str) -> List[str]:
        result = []
        def backtrack(string: str, index: int):
            if(len(string) == len(s)):
                result.append(string)
            else:
                if(s[index].isalpha()):
                    backtrack(string + s[index].swapcase(), index + 1)
                backtrack(string + s[index], index + 1)

            
        backtrack("", 0)
        return result