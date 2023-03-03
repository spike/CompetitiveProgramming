class Solution {
    fun strStr(haystack: String, needle: String): Int {
        for (start in 0..haystack.lastIndex-needle.lastIndex) {
            for (i in 0..needle.lastIndex) {
                if (haystack[start+i] != needle[i]) {
                    break
                } else {
                    if (i == needle.lastIndex) return start
                }
            }
        }
        return -1
    }
}