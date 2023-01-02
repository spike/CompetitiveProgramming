class Solution {
    fun detectCapitalUse(word: String): Boolean {
        var lowerCase = 0
        var upperCase = 0
        for (c in word) {
            if (c.toInt() < 97) upperCase++
            else lowerCase++
        }
        if (upperCase == word.length || 
            lowerCase == word.length) return true
        
        if (lowerCase == word.length-1 &&
            word[0].toInt() < 97) return true
        else return false
    }
}