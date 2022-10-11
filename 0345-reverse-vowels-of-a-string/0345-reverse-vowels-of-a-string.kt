class Solution {
    fun reverseVowels(s: String): String {  // "leetcode"
        val arr = CharArray(s.length) { '-' }
        for (i in s.indices) {
            arr[i] = s[i]
        }
        var left = 0; var right = arr.lastIndex 
        while (left < right) {  // 0 and 7
            while (left < right && !isVowel(arr[left])) {
                left++ // 1
            }
            while (left < right && !isVowel(arr[right])) {
                right--
            } // 7
            if (left < right) {
                arr[left] = arr[right].also {
                    arr[right] = arr[left]
                }
                left++
                right--
            }
        }
        return String(arr)
    }
    fun isVowel(c: Char): Boolean {
        when (c) {
            'a', 'e', 'i', 'o', 'u' -> return true
            'A', 'E', 'I', 'O', 'U' -> return true
            else -> return false
        }
    }
}