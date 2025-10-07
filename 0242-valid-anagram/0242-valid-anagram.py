class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        left = [0] * 26

        for char in s:
            left[ord('z') - ord(char)] += 1
        
        for char in t:
            left[ord('z') - ord(char)] -= 1

        for value in left:
            if(value != 0):
                return False
        return True
        