class Solution {
    fun repeatedCharacter(s: String): Char {
        val arr = Array(26) {0}
        for (i in s.indices) {
            val c = s[i]
            if (arr[c-'a'] == 1) return s[i]
            arr[c-'a']++
        }
        return '0'
    }
}