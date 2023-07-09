class Solution:
    def search(self, nums: List[int], target: int) -> int:
        lo, hi = -1, len(nums)
        while hi-lo > 1:
            m = (lo + hi)//2
            if nums[m] <= target:
                lo = m
            else:
                hi = m
        return lo if nums[lo] == target else -1
        