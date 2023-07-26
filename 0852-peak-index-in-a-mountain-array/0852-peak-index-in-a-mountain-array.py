class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        lo, hi = -1, len(arr)
        
        while hi-lo > 1:
            mid = (hi + lo) // 2
            if arr[mid] <= arr[mid+1]:
                lo = mid
            else:
                hi = mid
        return hi
        