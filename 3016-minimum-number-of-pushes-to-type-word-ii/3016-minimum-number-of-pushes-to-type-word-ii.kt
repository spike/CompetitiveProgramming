class Solution {
    fun minimumPushes(word: String): Int {
        val arr = Array(26) {0}
        for (c in word) {
            arr[c-'a']++
        }
        arr.sortDescending()
        var count = 0
        var mul = 1
        for (i in 0..arr.lastIndex) {
            count += arr[i] * mul
            if (i == 7) mul = 2
            if (i == 15) mul = 3
            if (i == 23) mul = 4
        }
        return count
    }
}