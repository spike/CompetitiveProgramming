class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        val arr = IntArray(flowerbed.size+2) {0}
        for (i in flowerbed.indices) {
            if (flowerbed[i] == 1) {
                arr[i+1] = 1
            }
        }
        var count = 0
        for (i in 2..arr.lastIndex) {
            if (arr[i-2] == 0 && arr[i-1] == 0 && arr[i] == 0) {
                    arr[i-1] = 1
                    count++    
            }
        }
        return (count >= n)
    }
}