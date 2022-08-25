class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val arr = Array(26) {0}
        for (c in magazine) {
            arr[c-'a']++
        }
        for (c in ransomNote) {
            arr[c-'a']--
            if (arr[c-'a'] < 0) return false
        }
        return true
    }
}