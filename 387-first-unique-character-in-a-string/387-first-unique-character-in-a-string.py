class Solution:
    def firstUniqChar(self, s: str) -> int:
        countMap = Counter(s)
        # gives me a dictionary object { "l":1, "e":2, "t":1 }
        for i in range(len(s)):
            if countMap[s[i]] == 1:
                return i
        
        return -1
        