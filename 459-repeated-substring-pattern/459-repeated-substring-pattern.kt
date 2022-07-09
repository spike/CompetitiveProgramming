class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        var ss = "$s$s".drop(1).dropLast(1)
        return (ss.contains(s))
    }
} 


/*class Solution {
    // Time:  O(n)  Space: O(n)
    fun repeatedSubstringPattern(s: String): Boolean {
        val alpha = Array(26) {0}
        for (c in s) {
            alpha[c-'a']++
        }
        var substringFreq = Integer.MAX_VALUE
        for (n in alpha) {
            if (n > 0) {
                substringFreq = Math.min(n, substringFreq)
            }
        }      
        if (substringFreq == 1) return false
        if (s.length % substringFreq != 0) return false
        val windowSize = s.length / substringFreq
        
        val sb = StringBuilder()
        repeat(substringFreq) {
            sb.append(s.slice(0..windowSize-1))
        }
        return (s.equals(sb.toString()))
    }
} */