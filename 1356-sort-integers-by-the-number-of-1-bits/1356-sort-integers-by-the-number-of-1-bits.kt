class Solution {
    fun sortByBits(arr: IntArray): IntArray {
        return arr.toList().sortedWith(Comparator { a, b ->
            val ac = a.bitCount()
            val bc = b.bitCount()
            if (ac == bc) {
                a.compareTo(b)
            } else {
                ac.compareTo(bc)
            }
        }).toIntArray()
    }
    fun Int.bitCount(): Int {
        var n = this
        var count = 0
        while (n != 0) {
            n = n and (n-1)
            count++
        }
        return count
    }
}