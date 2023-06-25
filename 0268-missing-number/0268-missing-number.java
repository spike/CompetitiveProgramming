class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int lo = -1; 
        int hi = nums.length;
        while (hi-lo > 1) {
            int m = lo + (hi-lo)/2;
            if (nums[m] == m) {
                lo = m;
            } else {
                hi = m;
            }
        }
        return hi;
    }
}

/*
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet();
        for (int num : nums) {
            hs.add(num);
        }
        for (int i = 0; i < nums.length + 1; i++) {
            if (!hs.contains(i)) {
                return i;
            }
        }
        return -1;
    }
} */
// Time: O(n), Space: O(n)