class Solution {
    // sliding window based on size of target
    // countmaps
    fun findAnagrams(s: String, p: String): List<Int> {
        val res = mutableListOf<Int>()
        if (s.length < p.length) return res
        val alpha = Array(26) {0}
        // establishing countMap for 
        // the initial window of size p
        for (i in 0..p.lastIndex) {
            alpha[p[i]-'a']--
            alpha[s[i]-'a']++
        }
        if (alpha.matches()) res.add(0)
        var left = 0; var right = p.lastIndex + 1
        while (right <= s.lastIndex) {
            alpha[s[right]-'a']++
            alpha[s[left]-'a']--
            if (alpha.matches()) {
                res.add(left+1)
            }
            right++; left++
        }
        return res
    }
    fun Array<Int>.matches(): Boolean {
        for (n in this) {
            if (n != 0) return false
        }
        return true
    }
}