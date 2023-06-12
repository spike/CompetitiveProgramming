class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        lst = []
        if len(nums) == 0:
            return lst
        start = nums[0]
        for i in range(1, len(nums)):
            if nums[i] != nums[i-1]+1:
                if start == nums[i-1]:
                    lst.append(str(start))
                else:
                    lst.append(str(start)+"->"+str(nums[i-1]))
                start = nums[i]
        if start == nums[-1]:
            lst.append(str(start))
        else:
            lst.append(str(start)+"->"+str(nums[-1]))
        return lst
