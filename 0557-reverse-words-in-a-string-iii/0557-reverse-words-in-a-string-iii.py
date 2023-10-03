class Solution:
    def reverseWords(self, s: str) -> str:
        lst = s.split()
        N = len(lst)
        for i in range(N):
            lst[i] = lst[i][::-1]

        return ' '.join(lst)