class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int m;
        int max = 0;
        while (left <= right) {
            m = left + (right-left)/2;
            if (m > 0 &&
                arr[m-1] < arr[m] && 
                m < arr.length &&
                arr[m] > arr[m+1]) {
                return m;
            } else if (m > 0 && 
                       arr[m-1] > arr[m]) {
                right = m - 1;
            } else {
                left = m + 1;
            }
        }
        return -1;
    }
}