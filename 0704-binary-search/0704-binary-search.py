class Solution:
    #  [-1,0,3,5,9,12]        lo = -1 
    #.   0,1,2,3,4,5          hi = 6,
    # [_,T,T,T,T,T,F,_]     
    #            l
    #              h
    def search(self, nums: List[int], target: int) -> int:
        lo = -1
        hi =  len(nums)  
        while hi-lo > 1:   # 6+1 = 7 > 1 True
            mid = (hi+lo)//2 
            if nums[mid] <= target:
                lo = mid
            else:
                hi = mid
        return lo if (nums[lo] == target) else -1
        
        
        