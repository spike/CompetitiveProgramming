public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int m = 0;
        for (int i = 0; i < 32; i++) {
            m = m << 1;
            m += n % 2;
            n = n >>> 1;    
        }
        return m;
    }
}