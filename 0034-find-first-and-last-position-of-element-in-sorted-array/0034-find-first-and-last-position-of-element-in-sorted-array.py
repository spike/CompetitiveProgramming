class Solution:
    def bisect_l(self, nums: List[int], target) -> int:
        lo, hi = -1, len(nums)
        while (hi-lo) > 1:
            m = (hi+lo)//2
            if nums[m] < target:
                lo = m
            else: 
                hi = m
        return hi if hi != len(nums) and nums[hi] == target else -1
    
    def bisect_r(self, nums: List[int], target) -> int:
        lo, hi = -1, len(nums)
        while (hi-lo) > 1:
            m = (hi+lo)//2
            if  nums[m] > target:
                hi = m
            else: 
                lo = m
        return lo if nums[lo] == target else -1

    
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        if not len(nums):
            return [-1,-1]
        return [self.bisect_l(nums, target), self.bisect_r(nums, target)]

        