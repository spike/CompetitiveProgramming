class Solution {
    fun longestCommonPrefix(arr: Array<String>): String {
        if (arr.size == 1) return arr[0]
        arr.sort()
        val sb = StringBuilder()
        val word = arr[0]
        for (i in 0..word.lastIndex) {
            for (j in 1..arr.lastIndex) {
                if (word[i] != arr[j][i]) return sb.toString()
            }
            sb.append(word[i])
        }
        return sb.toString()
    }
}