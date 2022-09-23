class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var rem = 1 // because we're adding 1
        for (i in digits.lastIndex downTo 0) {
            digits[i] = (digits[i] + rem) % 10.also {
                rem = (digits[i] + rem) / 10
            }
        }
        if (rem == 0) return digits  // return original array
        val arr = IntArray(digits.size+1)
        for (i in digits.lastIndex downTo 0) {
            arr[i+1] = digits[i]
        }
        arr[0] = rem
        return arr
    }
}