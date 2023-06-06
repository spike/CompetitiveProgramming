class Solution {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        arr.sort()
        var diff = Math.abs(arr[1] - arr[0])
        for (i in 1..arr.lastIndex) {
            if (diff != Math.abs(arr[i] - arr[i-1])) {
                return false
            }
        }
        return true
    }
}