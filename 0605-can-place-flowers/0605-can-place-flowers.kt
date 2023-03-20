class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count = 0
        val arr = IntArray(flowerbed.size+2) {0}
        for (i in flowerbed.indices) {
            arr[i+1] = flowerbed[i]
        }
        for (i in 2..arr.lastIndex) {
            if (arr[i-2] == 0 && arr[i-1] == 0 && arr[i] == 0) {
                count++
                arr[i-1] = 1
            }
        }
        return (count >= n)
    }
}