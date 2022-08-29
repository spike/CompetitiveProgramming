class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int { 
        if (arr.size < 3) return -1
        var left = 0; var right = arr.lastIndex
        while (left <= right) {
            val mid = left + (right-left)/2
            if (mid-1 >= 0 && mid+1 <= arr.lastIndex &&
                arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]) {
                return mid 
            } else if (mid-1 >= 0 && arr[mid-1] >= arr[mid]) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return -1
    }
}