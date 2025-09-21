class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        sorted_numbers = sorted(nums)
        map = {}
        for index, number in enumerate(sorted_numbers):
            if number not in map:
                map[number] = index

        result = []
        for number in nums:
            result.append(map[number])


        return result

def hamada():
    for i in range(1,100):
        yield i * 2

        