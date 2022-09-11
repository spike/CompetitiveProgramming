class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        val sb = StringBuilder()
        sb.append(x.toString())
        return (sb.toString().equals(sb.reverse().toString()))
    }
}