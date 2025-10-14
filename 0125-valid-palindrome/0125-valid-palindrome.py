class Solution:
    def isPalindrome(self, s: str) -> bool:
        expected = ""
        for char in s.lower():
            if(char.isalnum()):
                expected += char
        print(expected)
        left, right = 0, len(expected) - 1
        while(left < right):
            if(expected[left] != expected[right]):
                return False
            left +=1
            right -=1
        return True