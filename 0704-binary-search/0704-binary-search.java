class Solution {
    public int search(int[] arr, int target) { 
        int lo = -1; 
        int hi = arr.length; 
        while (hi - lo > 1) { 
            int mid = lo + (hi-lo)/2; 
            if (arr[mid] <= target)  
                lo = mid; 
            else 
                hi = mid; 
        } 
        if (lo >= 0 && lo < arr.length && 
            arr[lo] == target) 
            return lo; 
        else 
            return -1; 
    }
}