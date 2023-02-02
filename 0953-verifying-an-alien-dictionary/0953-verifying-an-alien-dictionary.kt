class Solution {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        val charToIndexMap = mutableMapOf<Char,Int>()
        
        order.forEachIndexed { index, char ->
            charToIndexMap[char] = index
        }

        return isSorted(words, charToIndexMap)
    }
    
    private fun isSorted(words: Array<String>, order: Map<Char,Int>): Boolean {
        var i = 0
        
        while (i < words.size) {
            if (i + 1 < words.size) {
                val currentWord = words[i]
                val nextWord = words[i+1]
                
                if (currentWord == nextWord) {
                    i++
                    continue
                }
                
                var charIndex = 0
                while (charIndex < currentWord.length) {
                    if (charIndex == nextWord.length)
                        return false
                    
                    val currentWordCharOrder = order[currentWord[charIndex]] ?: -1
                    val nextWordCharOrder = order[nextWord[charIndex]] ?: -1
                    
                    if (currentWordCharOrder > nextWordCharOrder)
                        return false
                    else if (currentWordCharOrder < nextWordCharOrder)
                        break
                    
                    charIndex++
                }
            }
                
            i++
        }
        
        return true
    }
}
