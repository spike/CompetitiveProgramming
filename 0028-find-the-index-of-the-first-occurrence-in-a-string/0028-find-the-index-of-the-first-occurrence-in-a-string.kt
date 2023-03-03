class Solution {
    fun strStr(haystack: String, needle: String): Int {
        for (start in 0..haystack.lastIndex-needle.lastIndex) {
            if (haystack.slice(start..start+needle.lastIndex).equals(needle)) {
                return start
            }
        }
        return -1
    }
}