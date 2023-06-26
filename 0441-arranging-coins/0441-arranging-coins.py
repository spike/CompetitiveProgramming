class Solution:
    def arrangeCoins(self, n: int) -> int:
        inc = 1
        while n > 0:
            inc += 1
            n -= inc
        return inc-1

        