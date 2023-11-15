class Solution {
    fun maximumElementAfterDecrementingAndRearranging(arr: IntArray): Int {
        arr.sort()
        var m = 1
        arr[0] = 1
        for (i in 1..arr.lastIndex) {
            if (arr[i] - arr[i-1] <= 1) {
                m = maxOf(arr[i], m)
            } else {
                m = maxOf(arr[i-1] + 1, m)
            }
            arr[i] = m
        }
        return m
    }
}