class Solution:
    def splitWordsBySeparator(self, words: List[str], separator: str) -> List[str]:
        lst = []
        for w in words:
            l = w.split(separator)
            for s in l:
                if len(s):
                    lst.append(s)
        return lst
        