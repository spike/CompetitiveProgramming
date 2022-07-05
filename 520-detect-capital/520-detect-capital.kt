class Solution {
    fun detectCapitalUse(word: String): Boolean {
        if (word.length == 1) return true
        if (noCapital(word.drop(1))) return true
        else {
            return allUpperCase(word)
        }
    }
    fun noCapital(word: String): Boolean {
        for (c in word) {
            if (c.isUpperCase()) return false
        }
        return true
    }
    fun allUpperCase(word: String): Boolean {
        for (c in word) {
            if (c.isLowerCase()) return false
        }
        return true
    }
}