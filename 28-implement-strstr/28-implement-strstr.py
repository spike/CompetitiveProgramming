class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if needle == "":
            return 0
        N = len(needle)
        for i in range(len(haystack)-len(needle)+1):
            if haystack[i:i+N] == needle:
                return i
        return -1