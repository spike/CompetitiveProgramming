class Solution {
    fun destCity(paths: List<List<String>>): String {
        val hs = HashSet<String>()
        for (p in paths) {
            hs.add(p[0])
        }
        for (p in paths) {
            if (!hs.contains(p[1])) return p[1]
        }
        return ""
    }
}