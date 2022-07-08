class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        var total = 0
        for (word in words) {
            if (word.length > chars.length) continue
            val arr = Array(26) {0}
            for (c in chars) {
                arr[c-'a']++
            }
            total += word.length
            for (c in word) {
                if (arr[c-'a'] > 0) arr[c-'a']--
                else {
                    total -= word.length
                    break
                }
            }
        }
        return total
    }
}