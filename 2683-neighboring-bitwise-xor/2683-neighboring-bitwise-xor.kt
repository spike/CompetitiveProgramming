class Solution { 
    fun doesValidArrayExist(derived: IntArray): Boolean {
        for (f in arrayOf(0, 1)) {
            var original = f
            for (i in 0..derived.lastIndex-1) {
                original = derived[i] xor original
            }
            if (original xor f == derived[derived.lastIndex]) return true
        }
        return false
    }
}
