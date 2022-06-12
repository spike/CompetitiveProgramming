class Solution {
    fun calculateTax(brackets: Array<IntArray>, income: Int): Double { // 2
        if ((income == 0) || (brackets.size == 0)) return 0.0
        var wage: Double = income.toDouble()
        var tax: Double = 0.0
        var start = 0
        for (i in 0..brackets.lastIndex) { // [[1,0],[4,25],[5,50]]
            var end = brackets[i][0] // 4
            var diff: Double = (end - start).toDouble() // 4-1 = 3
            if ((wage - start) - diff >= 0) { // 2-1-3            =
                tax += (Math.min((wage-start), diff) * brackets[i][1])/100 // 1 * 0 / 100 = 0.0
            } else {
                tax += (Math.max((wage-start),0.0) * brackets[i][1])/100
            }
            start = brackets[i][0] // 1
        }
        return tax
    }
}