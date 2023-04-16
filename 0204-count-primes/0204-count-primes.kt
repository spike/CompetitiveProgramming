class Solution {
    fun countPrimes(n: Int): Int {
        val arr = Array(n+1) { true }
        for (i in 2..n) {
            if (arr[i]) {
                for (j in i+i..n step i) {
                    arr[j] = false
                }
            }
        }
        var count = 0
        for (i in 2 until n) {
            if (arr[i]) count++
        }
        return count
    }
}