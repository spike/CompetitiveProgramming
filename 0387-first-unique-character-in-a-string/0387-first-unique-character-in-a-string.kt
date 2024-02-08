class Solution {
    fun firstUniqChar(s: String): Int {
        val arr = Array(26) {0}
        for (c in s) {
            arr[c-'a']++
        }
        for (i in s.indices) {
            val c = s[i]
            if (arr[c-'a'] == 1) {
                return i
            } 
        }
        return -1
    }
}