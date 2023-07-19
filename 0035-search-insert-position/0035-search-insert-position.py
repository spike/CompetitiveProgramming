class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        lo, hi = -1, len(nums)
        while hi-lo > 1:
            mid = (lo + hi) // 2
            if nums[mid] < target:
                lo = mid
            else:
                hi = mid
        return hi