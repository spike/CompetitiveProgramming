class Solution:
    def maximumJumps(self, nums: List[int], target: int) -> int:
        return self.dfs(tuple(nums), 0, target)
    
    @cache
    def dfs(self, nums: Tuple[int], curr: int, target: int) -> int:
        N = len(nums)
        if curr == N-1:
            return 0
        m = -1
        maxi = nums[curr] + target
        mini = nums[curr] - target
        for i in range(curr+1, N):
            if mini <= nums[i] <= maxi:
                m = max(m, self.dfs(nums,i, target) + 1)
                
        return m if m != 0 else -1
    
        