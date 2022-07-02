class Solution {
    // Time: O(n log(n))
    // Space: O(n) because a new list needs to be made so it can be sorted
    
    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
        // sort the boxes and place the bigger boxes first
        val biggerFirst = Comparator<IntArray>() { a, b ->
                b[1] - a[1]
        }
        val boxes = boxTypes.toList().sortedWith(biggerFirst)
        var remaining = truckSize
        var total = 0
        var i = 0
        // loop through the box until the space on the truck is empty
        // or unless the boxes are too big
        while (remaining > 0 && i < boxes.size) {
            val cap = Math.min(remaining, boxes[i][0])
            total += cap * boxes[i][1]
            remaining -= boxes[i][0]
            i++
        }
        return total
    }
}