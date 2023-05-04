class Solution { 
    fun predictPartyVictory(senate: String): String {
        val rad: Queue<Int> = LinkedList<Int>()
        val dir: Queue<Int> = LinkedList<Int>()
        for (i in senate.indices) {
            if (senate[i] == 'R') {
                rad.add(i)
            } else {
                dir.add(i)
            }
        }
        val len = senate.length
        while (rad.isNotEmpty() && dir.isNotEmpty()) {
            val r = rad.remove()
            val d = dir.remove()
            if (r < d) {
                rad.add(r + len)
            } else {
                dir.add(d + len)
            }
        }
        return if (rad.isNotEmpty()) "Radiant" else "Dire"
    }
}