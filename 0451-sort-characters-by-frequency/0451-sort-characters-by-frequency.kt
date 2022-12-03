class Solution {
    fun frequencySort(s: String): String {
        val hm = HashMap<Char, Int>()
        var max = 0
        for (c in s) {
            val freq = hm.getOrDefault(c, 0) + 1
            hm[c] = freq
            max = Math.max(freq, max)
        }
        val arr = Array<String>(max+1) {""}
        hm.forEach { (k, v) ->
            arr[v] = "${arr[v]}${k}"
        }
        val sb = StringBuilder()
        for (i in arr.lastIndex downTo 1) {
            var count = if (arr[i] == null) 
            0 else arr[i]!!.length
            while (count > 0) {
                repeat(i) {
                    sb.append(arr[i][count-1])
                }
                count--
            }
        }
        return sb.toString()
    }
}