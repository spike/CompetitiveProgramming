class Solution:
    # 
    
    def arrangeCoins(self, n: int) -> int:
        lo, hi = -1, n+1
        while hi - lo > 1:
            m = (lo+hi)//2
            if n >= (m * (m+1)// 2):
                lo = m
            else:
                hi = m
        return lo