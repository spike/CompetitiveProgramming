class Solution { 
    fun maxNumberOfFamilies(n: Int, reservedSeats: Array<IntArray>): Int {
        val rows = HashMap<Int, Int>()
        for (seat in reservedSeats) {
            val y = seat[0]-1
            val x = seat[1]-2
            if (x < 0 || x > 7) continue
            insertSeat(x, y, rows)
        }
        var sum = 0
        rows.forEach { k, v ->
            if (v == 0) {
                sum += 2
            } else {
                if (v and 0b11110000 == 0 || 
                    v and 0b00111100 == 0 ||
                    v and 0b00001111 == 0) sum++
            }
        }
        sum += (n - rows.size) * 2
        return sum
    }
    fun insertSeat(x: Int, y: Int, rows: HashMap<Int,Int>) {
        rows[y] = rows.getOrDefault(y, 0) or (1 shl x)
    }   
}