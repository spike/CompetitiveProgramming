class Solution {
    fun breakPalindrome(palindrome: String): String {
        val sa = palindrome.toCharArray()
        var left = 0; var right = sa.lastIndex     
        if (sa.size == 1) return ""
        while (left < right) {
            if (sa[left] != 'a') {
                sa[left] = 'a'
                return String(sa)
            }     
            left++; right--
        }
        sa[sa.lastIndex] = 'b'
        return String(sa)
    }
}