class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] countMap = new int[256];
        int maxLength = 0;
        for (int left = 0, right = 0; right < s.length(); right++) {
            char c = s.charAt(right); 
            countMap[c]++; 
            while (countMap[c] > 1) {
                char leftChar = s.charAt(left);
                countMap[leftChar]--;
                left++;
            }
            maxLength = Math.max(right-left+1, maxLength); //2
        }
        return maxLength;
    }
}