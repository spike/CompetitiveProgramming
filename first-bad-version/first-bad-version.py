# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:
# [TTTTTTTTTFFFFFFFFFF]

class Solution:
    def firstBadVersion(self, n: int) -> int:
        lo, hi = -1, 2**31
        while hi - lo > 1:
            mid = (lo + hi)//2
            if not isBadVersion(mid):
                lo = mid
            else:
                hi = mid
        return hi
        



# class Solution:
#     def firstBadVersion(self, n: int) -> int:
#         lo, hi = 1, n
        
#         while lo < hi:
#             mid = (lo + hi)//2
#             if not isBadVersion(mid):
#                 lo = mid + 1
#             else:
#                 hi = mid
#         return lo
        