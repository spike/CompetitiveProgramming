class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        lo, hi = -1, len(letters)
        while hi-lo > 1:
            m = (lo+hi)//2
            if target >= letters[m]:
                lo = m
            else:
                hi = m
        print(lo, hi)
        return letters[hi] if hi != len(letters) else letters[0]