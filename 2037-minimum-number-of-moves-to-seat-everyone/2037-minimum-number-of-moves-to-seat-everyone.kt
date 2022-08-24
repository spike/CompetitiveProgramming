class Solution {
    fun minMovesToSeat(seats: IntArray, students: IntArray): Int {
        seats.sort()
        students.sort()
        var total = 0
        for (i in students.indices) {
            val diff = Math.abs(students[i]-seats[i])
            total += diff
        }
        return total
    }
}