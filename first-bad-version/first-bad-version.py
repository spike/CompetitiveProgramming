# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        lo, hi = 1, n
        
        while lo < hi:
            mid = (lo + hi)//2
            if not isBadVersion(mid):
                lo = mid + 1
            else:
                hi = mid
        return lo
        