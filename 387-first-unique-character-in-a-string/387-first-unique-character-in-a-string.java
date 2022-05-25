class Solution {
    public int firstUniqChar(String s) {
        int[] countMap = new int[26];
        int index = -1;
        for (var c : s.toCharArray()) {
            countMap[c-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (countMap[s.charAt(i)-'a'] == 1) return i;
        }
        return index;
    }
}