class Solution {
    fun removeStars(s: String): String {
        val sb = StringBuilder()
        var starsFound = 0
        
        for (i in s.lastIndex downTo 0) {
            if (s[i] != '*') {
                if (starsFound == 0) { 
                    sb.append(s[i]) 
                } else {
                    starsFound--
                }
            } else {
                starsFound++
            }
        }   
        return sb.reverse().toString()
    }
}