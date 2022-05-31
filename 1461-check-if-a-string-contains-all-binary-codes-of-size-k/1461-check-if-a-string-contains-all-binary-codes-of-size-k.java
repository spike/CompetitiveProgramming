class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> hs = new HashSet();
        for (int i = 0; i <= s.length()-k; i++) {
            hs.add(s.substring(i, i+k));
        }
        int n = (int)Math.pow(2.0, k);
        return (hs.size() == n);
    }
}