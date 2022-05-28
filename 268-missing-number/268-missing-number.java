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
}
// Time: O(n), Space: O(n)