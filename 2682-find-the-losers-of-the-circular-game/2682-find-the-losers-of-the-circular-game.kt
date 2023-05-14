class Solution { 
    fun circularGameLosers(n: Int, k: Int): IntArray {
        var turns = 1
        val arr = IntArray(n) {0}
        arr[0] = 1
        var i = 0
        while (true) {
            val index = ((turns * k) + i) % n
            i = index
            if (arr[index] == 1) break
            arr[index]++
            turns++
        }
        var count = 0
        for (i in arr.indices) {
            if (arr[i] == 0) count++   
        }
        val res = IntArray(count) {0}
        var c = 0
        for (i in arr.indices) {
            if (arr[i] == 0) {
                res[c] = i+1
                c++
            }  
        }
        return res
    }
}