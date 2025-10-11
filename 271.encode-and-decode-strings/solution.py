class Solution:

    def encode(self, strs: List[str]) -> str:
        if(not strs):
            return ""

        output = ""
        for string in strs:
            stringLength = str(len(string))
            output += stringLength
            output += '%'
            output += string
        
        return output

    def decode(self, s: str) -> List[str]:
        if(not s):
            return []

        output = []
        i = 0
        while(i < len(s)):
            hashedIndex = i
            while(s[hashedIndex] != '%'):
                hashedIndex += 1
            wordSize = int(s[i:hashedIndex])
            word = s[hashedIndex + 1:hashedIndex + wordSize + 1]
            output.append(word)
            i = hashedIndex + wordSize + 1
                
        return output