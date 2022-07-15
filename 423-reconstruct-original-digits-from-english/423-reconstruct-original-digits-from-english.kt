class Solution {
    fun originalDigits(s: String): String {
        val pq = PriorityQueue<Int>()
        val t = arrayOf("zero", "one", "two", "three", "four",
                       "five", "six", "seven", "eight", "nine")
        val arr = Array(26) {0}
        for (c in s) {
            arr[c-'a']++
        }
        helper('z', 0, arr, pq, t)
        helper('w', 2, arr, pq, t)
        helper('u', 4, arr, pq, t)
        helper('f', 5, arr, pq, t)
        helper('x', 6, arr, pq, t)
        helper('g', 8, arr, pq, t)
        helper('o', 1, arr, pq, t)
        helper('i', 9, arr, pq, t)
        helper('h', 3, arr, pq, t)
        helper('v', 7, arr, pq, t)
        val sb = StringBuilder()
        while (!pq.isEmpty()) {
            sb.append(pq.remove())
        }
        return sb.toString()
    }
    fun helper(c: Char, n: Int, arr: Array<Int>, 
                pq: PriorityQueue<Int>, t: Array<String>) {
        val freq = arr[c-'a']
        if (freq > 0) {
            for (i in 1..freq) {
                pq.add(n)
            }
            for (ch in t[n]) {
                arr[ch-'a'] -= freq
            } 
        }
    }
}
    /* 
        0 to "zero" z
        2 to "two" w
        4 to "four" u
        6 to "six"  x
        8 to "eight" g
        1 to "one" o
        5 to "five" f
        9 to "nine" i
        3 to "three" h
        7 to "seven" v
    */