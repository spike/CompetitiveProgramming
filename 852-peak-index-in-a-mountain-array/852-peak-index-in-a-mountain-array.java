class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, r = arr.length-1;
        while(l < r) {   // The equal interfered this time
            int m = l + (r-l)/2;
            if (arr[m] < arr[m+1]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}