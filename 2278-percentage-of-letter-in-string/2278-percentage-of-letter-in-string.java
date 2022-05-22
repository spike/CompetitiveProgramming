class Solution {
    public int percentageLetter(String s, char letter) {
        int[] countMap = new int[26];
        for (var c : s.toCharArray()) {
            countMap[c-'a']++;
        }
        int freq = countMap[letter-'a'];
        if (freq == 0) return 0;
        return ((freq * 100) / s.length());
        
    }
}