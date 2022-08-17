class Solution {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val arr = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
        var count = 0
        val sb = StringBuilder()
        val hs = HashSet<String>()
        for (w in words) {
            sb.clear()
            for (c in w) {
                sb.append(arr[c-'a'])
            }
            if (hs.add(sb.toString())) count++
        }
        return count
    }
}