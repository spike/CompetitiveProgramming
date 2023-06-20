class Solution:
    def mySqrt(self, x: int) -> int:
        lo, hi = -1, 2**31
        while (hi-lo) > 1:
            m = (lo+hi)//2
            if m * m <= x:
                lo = m
            else:
                hi = m
        return lo
