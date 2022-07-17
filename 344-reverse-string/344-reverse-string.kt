class Solution {
    fun reverseString(s: CharArray): Unit {
        var left = 0
        var right = s.lastIndex
        while(left < right) {
            s[left] = s[right].also{ s[right] = s[left] }
            left++
            right--
        }
    }
}