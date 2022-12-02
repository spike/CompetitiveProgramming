class Solution {
    // matching frequencies, letters don't matter
    
    fun closeStrings(word1: String, word2: String): Boolean {
        if (word1.length != word2.length) return false
        val arr1 = Array(26) {0}
        val arr2 = Array(26) {0}
        for (i in word1.indices) {
            arr1[word1[i]-'a']++
            arr2[word2[i]-'a']++
        }
        for (i in 0..25) {
            if (arr1[i] != 0) {
                if (arr2[i] == 0) return false
            }
            if (arr2[i] != 0) {
                if (arr1[i] == 0) return false
            }
        }
        val a = arr1.sorted()// try to do inplace later
        val b = arr2.sorted()
        for (i in 0..25) {
            if (a[i] != b[i]) return false
        }
        return true
    }
}