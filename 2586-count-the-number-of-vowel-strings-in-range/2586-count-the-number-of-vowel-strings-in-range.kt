class Solution {
    fun vowelStrings(words: Array<String>, left: Int, right: Int): Int {
        var count = 0
        for (i in left..right) {
            val word = words[i]
            if (isVowelString(word)) {
                count++
            }
        }
        return count
    }
    fun isVowelString(word: String): Boolean {
        val v = arrayOf('a', 'e', 'i', 'o','u')
        return (word.first() in v && word.last() in v)
    }
}