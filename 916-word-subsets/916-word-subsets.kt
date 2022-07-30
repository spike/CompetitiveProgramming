class Solution {
    fun wordSubsets(words1: Array<String>, words2: Array<String>): List<String> {
        val lst = mutableListOf<String>()
        val maxCountMap = Array(26) { 0 }
        for (i in words2.indices) {
            val countMap = Array(26) { 0 }
            for (c in words2[i]) {
                countMap[c-'a']++
                if (countMap[c-'a'] > maxCountMap[c-'a']) {
                    maxCountMap[c-'a']++
                }
            }
        }
        for (i in words1.indices) {
            val nameCountMap = maxCountMap.clone()
            var isMatch = true
            for (c in words1[i]) {
                nameCountMap[c-'a']--
            }
            for (n in nameCountMap) {
                if (n > 0) isMatch = false 
            }
            if (isMatch) lst.add(words1[i])
        }
        return lst.toList()
    }
}