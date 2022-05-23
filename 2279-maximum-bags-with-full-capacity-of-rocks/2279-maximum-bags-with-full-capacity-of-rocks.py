class Solution:
    def maximumBags(self, caps: List[int], rocks: List[int], r: int) -> int:
        remList = []
        for i in range(len(caps)):
            if caps[i] >= rocks[i]:
                remList.append(caps[i]-rocks[i])
        remList.sort()
        i = 0
        count = 0
        while i < len(remList) and r > 0:
            if remList[i] <= r:
                count += 1
                r -= remList[i]
            i += 1
            
        return count