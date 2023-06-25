class Solution:
    def gcd(self, p: int, q: int) -> int:
        if q == 0:
            return p
        return gcd(q, p%q)
    
    def countBeautifulPairs(self, nums: List[int]) -> int:
        N = len(nums)
        count = 0
        for i in range(N):
            first_digit_i = int(str(nums[i])[0])
            last_digit_i = int(str(nums[i])[-1])
            for j in range(i+1, N):
                first_digit_j = int(str(nums[j])[0])
                last_digit_j = int(str(nums[j])[-1])
                maxd = max(first_digit_i, last_digit_j)
                mind = min(first_digit_i, last_digit_j)
                if self.gcd(maxd, mind) <= 1:
                    count += 1
        return count
                
        