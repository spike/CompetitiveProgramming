class Solution {
    fun vowelStrings(words: Array<String>, queries: Array<IntArray>): IntArray {
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
        return res
    }
    fun String.convert(): Int {
        return if (this.first() in "aioue" && 
                   this.last() in "aioue") 1 else 0
    }
}