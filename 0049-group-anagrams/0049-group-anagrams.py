from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        buckets = defaultdict(list)
        for string in strs:
            characters = [0] * 26
            for char in string:
                characters[ord('z') - ord(char)] += 1
            buckets[tuple(characters)].append(string)
        return list(buckets.values())



