class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        return self.missingNumberBisect(nums)
        # return self.missingNumberHole(nums)
        # return self.missingNumberSet(nums)
        
    def missingNumberBisect(self, nums: List[int]) -> int:
        nums.sort()
        N = len(nums)
        lo, hi = -1, N
        while hi-lo > 1:
            m = (hi+lo)//2
            if nums[m] == m:
                lo = m
            else:
                hi = m
        return hi
    # T: O(n log(n)) because of the sorting. S: O(1)
    
    def missingNumberHole(self, nums: List[int]) -> int:
        nums.sort()
        N = len(nums)
        for i in range(N):
            if i != nums[i]:
                return i
        return N
    # T: O(n log(n)) S: O(1)
    
    def missingNumberSet(self, nums: List[int]) -> int:
        num_set = {n for n in nums}
        for i in range(len(num_set)):
            if i not in num_set:
                return i
        return len(nums)
    # T: O(n) S: O(n) for using set for storage
            
        