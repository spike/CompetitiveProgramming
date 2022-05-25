class Solution {
    fun firstUniqChar(s: String): Int {
        val countMap = IntArray(26)
        for (c in s) {
            countMap[c-'a']++
        }
        for (i in s.indices) {
            if (countMap[s[i]-'a'] == 1) {
                return i
            }
        }
        return -1
    }
}