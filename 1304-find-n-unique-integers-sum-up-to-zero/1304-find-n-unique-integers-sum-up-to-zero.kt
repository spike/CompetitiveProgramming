class Solution {
    fun sumZero(n: Int): IntArray {
        val arr = IntArray(n) {0}     
        var flip = false
        var x = n/2
        for (i in n-1 downTo 0) {
            arr[i] = if (flip) x-- * -1 else x  
            flip = !flip
        }
        if (n % 2 == 1) arr[0] = 0
        return arr
    }
}