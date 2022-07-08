class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(" ")
        if (words.size != pattern.length) return false
        val hm = HashMap<Char, String>()
        val hs = HashSet<String>()
        val alpha = Array(26) {0}
        for (i in pattern.indices) {
            val c = pattern[i]
            if (alpha[c-'a'] == 0) {
                hm.put(c, words[i])
                if (!hs.add(words[i])) return false
            } else {
                if (!hm.get(c).equals(words[i])) return false
            }
            alpha[c-'a']++
        }
        return true
    }
}