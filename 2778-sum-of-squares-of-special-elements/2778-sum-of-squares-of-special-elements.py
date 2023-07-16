class Solution:
    def sumOfSquares(self, nums: List[int]) -> int:
        N = len(nums)
        total = 0
        for i, num in enumerate(nums):
            if N % (i+1) == 0:
                total += num * num
        return total