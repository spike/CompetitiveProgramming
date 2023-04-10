class Solution {
    fun numberOfBeams(bank: Array<String>): Int {
        var prev = 0
        var total = 0
        for (row in bank) {
            var count = 0
            for (c in row) {
                if (c == '1') count++
            }
            if (count > 0) {
                total += prev * count
                prev = count
            }
        }
        return total
    }
}