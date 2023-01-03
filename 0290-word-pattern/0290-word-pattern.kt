class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(" ").toTypedArray()
        if (words.size != pattern.length) return false
        val hm = HashMap<Char, String>()
        val hs = HashSet<String>()
        for (i in pattern.indices) {
                if (hm.containsKey(pattern[i])) {
                    if (!hm[pattern[i]].equals(words[i]))
                        return false
                } else {
                    hm[pattern[i]] = words[i]
                    if (!hs.add(words[i])) return false
                }
        }
        return true
    }
}