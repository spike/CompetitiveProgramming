class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        count = 0
        for i in range(2, len(s)):
            if s[i-2] != s[i-1] and s[i-1] != s[i] and s[i-2] != s[i]:
                count += 1
        return count
        