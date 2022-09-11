class Solution {
    fun partitionString(s: String): Int {
        val arr = Array(26) {0}
        var j = 0
        var count = 1
        while (j < s.length) {
            if (arr[s[j]-'a'] > 0) {
                count++
                for (i in arr.indices) {
                    arr[i] = 0
                }
            } 
            arr[s[j]-'a'] = 1
            j++
        }
        return count
    }
}