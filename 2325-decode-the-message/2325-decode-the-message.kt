class Solution {
    fun decodeMessage(key: String, message: String): String {
        val arr = Array(26) {-1}
        val hm = HashMap<Char, Char>()
        var i = 0
        hm.put(' ', ' ')
        for (c in key) {
            if (!hm.containsKey(c)) {
                hm.put(c, (i+97).toChar())
                i++
            }
        }
        val sb = StringBuilder()
        for (c in message) {
            sb.append(hm.get(c))
        }
        return sb.toString() 
    }
}