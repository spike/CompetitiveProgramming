class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        N = len(nums)
        total = 0
        for j in range(k):
            total += nums[j]
        res = total / k
        for i in range(k, N):
            total += nums[i] - nums[i-k]
            res = max(res, total/k)
        return res