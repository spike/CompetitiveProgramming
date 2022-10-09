class Solution {
    fun reverseVowels(s: String): String {
        val arr = Array<Char>(s.length) { '-' }
        for (i in s.indices) {
            arr[i] = s[i]
        }
        var left = 0; var right = arr.lastIndex
        while (left < right) {
            while (left < right && !isVowel(arr[left])) {
                left++
            }
            while (left < right && !isVowel(arr[right])) {
                right--
            }
            if (left < right) {
                arr[left] = arr[right].also {
                    arr[right] = arr[left]
                }
                left++
                right--
            }
        }
        val sb = StringBuilder()
        for (c in arr) {
            sb.append(c)
        }
        return sb.toString()
    }
    fun isVowel(c: Char): Boolean {
        when (c) {
            'a', 'e', 'i', 'o', 'u' -> return true
            'A', 'E', 'I', 'O', 'U' -> return true
            else -> return false
        }
    }
}