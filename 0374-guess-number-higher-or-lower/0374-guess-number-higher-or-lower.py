# The guess API is already defined for you.
# @param num, your guess
# @return -1 if num is higher than the picked number
#          1 if num is lower than the picked number
#          otherwise return 0
# def guess(num: int) -> int:

class Solution:
    def guessNumber(self, n: int) -> int:
        lo, hi = 0, n+1
        while hi-lo > 1:
            mid = (lo + hi)//2
            match (guess(mid)):
                case 1: lo = mid
                case -1: hi = mid
                case _: return mid
        return -1
        