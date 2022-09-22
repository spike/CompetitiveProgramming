class Solution {
    fun isPalindrome(s: String): Boolean {
        val sb = StringBuilder()
        for (i in s.indices) {
            if (s[i].isLetterOrDigit()) {
                sb.append(s[i].toLowerCase())
            }
        }
        return (sb.toString().equals(sb.reverse().toString()))
    }
}