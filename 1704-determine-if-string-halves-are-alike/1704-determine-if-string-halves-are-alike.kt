class Solution {
    fun halvesAreAlike(s: String): Boolean {
        val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        var firstHalf = 0
        var secondHalf = 0
        for (i in 0..s.lastIndex/2) {
            if (s[i] in vowels) firstHalf++
            if (s[s.lastIndex-i] in vowels) secondHalf++
        }
        return (firstHalf == secondHalf)
    }
}