class Solution { 
    fun minimizedStringLength(s: String): Int {
        val hs = HashSet<Char>()
        for (c in s.toCharArray()) {
            hs.add(c)
        }
        return hs.size
    }
}