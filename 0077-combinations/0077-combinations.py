class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        result = []
        def backtrack(arr: List[int], start: int):
            if(len(arr) == k):
                result.append(arr[:])
                return

            for i in range(start, n + 1):
                arr.append(i)
                backtrack(arr, i + 1)
                arr.pop()

        backtrack([],1)
        return result