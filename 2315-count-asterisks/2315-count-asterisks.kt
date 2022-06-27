class Solution {
    // "yo|uar|e**|b|e***au|tifu|l"
    fun countAsterisks(s: String): Int {
        val arr = s.split("|")
        var total = 0
        for (i in arr.indices) {
            if (i%2 == 0) {
                total += arr[i].filter{ it == '*'}.count()
            }
        }
        return total
    }
}