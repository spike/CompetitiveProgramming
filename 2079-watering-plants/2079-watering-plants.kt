class Solution {
    fun wateringPlants(plants: IntArray, capacity: Int): Int {
        var rem = capacity; var steps = 0
        for (i in plants.indices) {
            if (plants[i] > rem) {
                steps += i * 2
                rem = capacity
            }    
            rem -= plants[i]
        }
        return steps + plants.size
    }
}