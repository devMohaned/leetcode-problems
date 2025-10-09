class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        countArr = [[] for _ in range(len(nums) + 1)]
        frequency = {}
        for value in nums:
            frequency[value] = frequency.get(value, 0) + 1

        for num, frequency in frequency.items():
            countArr[frequency].append(num)

        result = []

        for bucket in reversed(countArr):
            for num in bucket:
                result.append(num)
                k -=1
                if(k == 0):
                    return result

        return result
        