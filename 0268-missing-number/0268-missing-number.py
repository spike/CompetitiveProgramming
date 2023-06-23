class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        num_set = {n for n in nums}
        for i in range(len(num_set)):
            if i not in num_set:
                return i
        return len(nums)
            
        