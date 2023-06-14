class Solution:
        
    
    def countNegatives(self, grid: List[List[int]]) -> int:
        count = 0
        def bisectnegative(lst: List[int]) -> int:
            lo, hi = 0, len(lst)
            while lo < hi:
                mid = (lo + hi)//2
                if lst[mid] >= 0:
                    lo = mid + 1
                else:
                    hi = mid
            return lo
        c = 0
        for y in range(len(grid)):
            print(grid[y])
            index = bisectnegative(grid[y])
            count += len(grid[y]) - (index)
        return count
            
