class Solution:
    def minPartitions(self, n: str) -> int:
        m = -1
        for c in n:
            m = max(int(c), m)
            if m == 9:
                return 9
        return m