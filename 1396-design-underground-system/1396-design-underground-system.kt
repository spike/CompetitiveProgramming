class UndergroundSystem() {
    val hm = HashMap<Int, Pair<String, Int>>() 
    var totalDuration = HashMap<String, Long>()
    var countPassengers = HashMap<String, Int>()

    fun checkIn(id: Int, stationName: String, t: Int) {
        hm[id] = Pair(stationName, t)
        return
    }

    fun checkOut(id: Int, stationName: String, t: Int) {
        val direction = "${hm[id]!!.first}-$stationName"
        val duration = t-hm[id]!!.second
        val d = totalDuration.getOrDefault(direction, 0L) + duration
        totalDuration[direction] = d
        val c = countPassengers.getOrDefault(direction, 0) + 1
        countPassengers[direction] = c
        hm.remove(id)
        return
    }

    fun getAverageTime(startStation: String, endStation: String): Double {
        val direction = "$startStation-$endStation"
        return totalDuration[direction]!!.toDouble() / countPassengers[direction]!!
    }

}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * var obj = UndergroundSystem()
 * obj.checkIn(id,stationName,t)
 * obj.checkOut(id,stationName,t)
 * var param_3 = obj.getAverageTime(startStation,endStation)
 */