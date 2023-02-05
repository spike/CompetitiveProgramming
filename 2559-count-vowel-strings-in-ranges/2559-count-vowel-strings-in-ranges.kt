class Solution {
    fun vowelStrings(words: Array<String>, queries: Array<IntArray>): IntArray {
        // convert to valid words in IntArray
        val arr = IntArray(words.size) { i ->
            words[i].convert()
        }
        val prefix = arr.clone()
        val postfix = arr.clone()
        var total = arr[0]
        for (i in 1..arr.lastIndex) {
            prefix[i] += prefix[i-1]
            total += arr[i]
        }
        for (i in arr.lastIndex-1 downTo 0) {
            postfix[i] += postfix[i+1]
        }
        
        val res = IntArray(queries.size)
        
        for (i in queries.indices) {
            val start = queries[i][0]
            val end = queries[i][1]
            if (start == 0) {
                res[i] = prefix[end]
                continue
            }
            if (end == arr.lastIndex) {
                res[i] = postfix[start]
                continue
            }
            res[i] = total - prefix[start-1] - postfix[end+1]
        }
        // I'll try brute force first?
        // prefix sum and postfix sum - may not be necessary???
        return res
    }
    fun String.convert(): Int {
        if (this[0].isVowel() && this.last().isVowel()) return 1
        else return 0
    }
    fun Char.isVowel(): Boolean {
        return  when (this) {
                    'a','i','o','u','e' -> true
                    else -> false
                }
    }
}