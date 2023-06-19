class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        nums = [-2**31, *nums, -2**31]
        N = len(nums)
        lo, hi = 1, N-2
        while lo < hi:
            mid = (lo + hi)//2
            if nums[mid-1] < nums[mid] > nums[mid+1]:
                return mid - 1 # since added element at start
            elif nums[mid-1] > nums[mid]:
                hi = mid - 1
            else: 
                lo = mid + 1
        return lo - 1 # since I added an element at start     

        