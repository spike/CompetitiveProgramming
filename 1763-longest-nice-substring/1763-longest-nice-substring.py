class Solution:
    def longestNiceSubstring(self, s: str) -> str:
        N = len(s)
        maxLen = 0
        maxStr = ''
        for start in range(N-1):
            for end in range(start+1, N+1):
                if self.isNice(s[start:end]):
                    if end - start > maxLen:
                        maxLen = end - start
                        maxStr = s[start:end]
                else:
                    continue
        return maxStr
    
    def isNice(self, s: str) -> bool:
        u = [False]*26
        l = [False]*26
        for c in s:
            if c.isupper():
                u[ord(c)%32-1] = True
                # ascii table is 1-indexed every 32 bits
                # https://www.asciitable.com/
            else:
                l[ord(c)%32-1] = True 
        for i in range(26):
            if u[i] != l[i]:
                 return False
        return True