class Solution {
    fun isPalindrome(n: Int): Boolean {
        val sb = StringBuilder(n.toString())
        return sb.toString().equals(sb.reverse().toString())
    }
}