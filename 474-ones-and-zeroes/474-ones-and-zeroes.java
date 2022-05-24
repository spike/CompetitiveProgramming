class Solution {
    int[][][] dp;
    public int findMaxForm(String[] strs, int z, int o) {
        dp = new int[z+1][o+1][strs.length];
        return helper(strs, z, o, 0);
    }
    private int helper(String[] strs, int z, int o, int index) {
        if (index == strs.length || (z + o == 0)) {
            return 0;
        }
        if (dp[z][o][index] > 0) {
            return dp[z][o][index];
        }
        
        int[] count = count(strs[index]);
        int accept = 0;
        // accept
        if (count[0] <= z && count[1] <= o) {
        accept = 1 + helper(strs, z-count[0], o-count[1], index + 1);
        }
        // skip
        int skip = helper(strs, z, o, index + 1);
        dp[z][o][index] = Math.max(accept, skip);
        return dp[z][o][index];
    }
    private int[] count(String str) {
        int[] count = new int[2];
        for (char d : str.toCharArray()) {
            count[d-'0']++;
        }
        return count;
    }
}