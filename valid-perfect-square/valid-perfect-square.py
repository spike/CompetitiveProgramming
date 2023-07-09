class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        if num == 1:
            return True
        lo, hi = 0, num//2
        while hi-lo > 1:
            m = (lo+hi)//2
            if m * m >= num:
                hi = m
            else:
                lo = m
        return hi * hi == num
        