class Solution {
    fun alternateDigitSum(n: Int): Int {
        var num = n
        var positive: Boolean = (n.toString().length % 2 == 1)
        var sum = 0
        while (num > 0) {
            if (positive) {
                sum += num % 10
            } else {
                sum -= num % 10
            }
            positive = !positive
            num /= 10
        }
        return sum
    }
}