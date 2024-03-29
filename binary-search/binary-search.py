class Solution:
    def search(self, nums: List[int], target: int) -> int:
        lo, hi = 0, len(nums)-1
        while lo < hi:
            mid = (lo + hi)//2
            if nums[mid] < target:
                lo = mid + 1
            else:
                hi = mid
        return lo if nums[lo] == target else -1
        