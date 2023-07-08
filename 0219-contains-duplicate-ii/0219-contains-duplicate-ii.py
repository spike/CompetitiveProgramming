class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        N = len(nums)
        d = {}
        for i in range(N):
            key = nums[i]
            if key in d.keys():
                if i - d[key] <= k:
                    return True
            d[key] = i
        return False
    
        