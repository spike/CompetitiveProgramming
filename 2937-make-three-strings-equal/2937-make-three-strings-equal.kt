class Solution {
    fun findMinimumOperations(s1: String, s2: String, s3: String): Int {
        val l1 = s1.length
        val l2 = s2.length
        val l3 = s3.length
        val l = minOf(l1, l2, l3)
        
        var positiveCount = 0
        if (s1[0] != s2[0] || s1[0] != s3[0]) return -1
        
        for (i in 0..l-1) {
            if (s1[i] == s2[i] && s1[i] == s3[i]) positiveCount += 3
            else break
        }
        return l1+l2+l3 - positiveCount
    }
}