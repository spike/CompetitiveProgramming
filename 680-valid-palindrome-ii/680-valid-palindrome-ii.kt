class Solution {
    fun validPalindrome(s: String): Boolean {
        var left = 0
        var right = s.lastIndex 
        while (left < right) {
            if (s[left] != s[right]) {
                val s1 = s.slice(left+1..right)
                val s2 = s.slice(left until right)
                return (isPalindrome(s1) || isPalindrome(s2))
            } else {
                left++
                right--
            }
        }
        return true 
    }
    
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.lastIndex
        while (left < right) {
            if (s[left] != s[right]) return false
            left++
            right--
        }
        return true
    }
}