class Solution { 
    fun makeStringsEqual(s: String, target: String): Boolean {
        var tHasOne = false; var sHasOne = false
        var tFullOfZero = true; var sFullOfZero = true
        for (i in target.indices) {
            if (s[i] == '1') {
                sHasOne = true
                sFullOfZero = false
            }
            if (target[i] == '1') {
                tHasOne = true
                tFullOfZero = false
            }
        }
        if (tFullOfZero && sHasOne) return false
        if (sFullOfZero && tHasOne) return false
        return true
    }
    
}