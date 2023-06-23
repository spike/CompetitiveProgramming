class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        return self.missingNumberHole1(nums)
        # return self.missingNumberSet(nums)
        
    def missingNumberHole1(self, nums: List[int]) -> int:
        nums.sort()
        N = len(nums)
        for i in range(N):
            if i != nums[i]:
                return i
        return N
    # T: O(n log(n)) S: O(1)
    # Using pigeonhole principle
    
    def missingNumberSet(self, nums: List[int]) -> int:
        num_set = {n for n in nums}
        for i in range(len(num_set)):
            if i not in num_set:
                return i
        return len(nums)
    
    # T: O(n) S: O(n) for using set for storage
    # O(1) space is also possible using pigeon hole principle
            
        