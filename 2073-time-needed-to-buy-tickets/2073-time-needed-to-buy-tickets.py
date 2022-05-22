class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        t = 0
        for i in range(len(tickets)):
            if i <= k:
                t = t + min(tickets[i], tickets[k])
            else:
                t = t + min(tickets[i], tickets[k]-1)

        return t