class Solution {
    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
        val boxes = boxTypes.sortedWith(Comparator<IntArray> { a, b ->
            b[1].compareTo(a[1])  // sorting backwards
        })
        var remainingSpace = truckSize
        var shipped = 0
        for (box in boxes) {   
            if (remainingSpace - (box[0] * box[1]) >= 0) { 
                remainingSpace -= box[0] 
                shipped += (box[0] * box[1])  
            } else {
                var currentNum = box[0]   
                while (currentNum > 0 && remainingSpace > 0) { 
                    remainingSpace -= 1
                    shipped += box[1]
                    currentNum -= 1
                }
            }
            if (remainingSpace == 0) break
        }
        return shipped
    }
}