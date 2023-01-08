class Solution {
   fun maxPoints(pointsArray: Array<IntArray>): Int {
            var maxOverall = 0
            for (thisIndex in pointsArray.indices) {

                val hashMap = HashMap<String, Int>()
                val thisPoint = pointsArray[thisIndex]
                var duplicatesOfThisPoint = 0

                for (nextIndex in (thisIndex + 1..pointsArray.indices.last)) {
                    val nextPoint = pointsArray[nextIndex]

                    // Check for duplicates of THIS point
                    // Duplicates can apply to any of the lines to separate points
                    if (thisPoint[0] == nextPoint[0]
                        && thisPoint[1] == nextPoint[1]
                    ) {
                        duplicatesOfThisPoint += 1
                    } else {

                        // make normalized y=mx+b equation
                        val dx = thisPoint[0] - nextPoint[0]
                        val dy = thisPoint[1] - nextPoint[1]
                        val slope = if (dx != 0) {

                            //Represent slope as x/y
                            //Divide by GCD to keep similar slopes in the same hash entry
                            //e.g. 2/3 = 4/6
                            val gcd = getGreatestCommonDivisor(dx, dy)
                            var adjustedDx = dx / gcd
                            var adjustedDy = dy / gcd

                            //Move negatives to first number
                            if (adjustedDy < 0) {
                                adjustedDx = 0 - adjustedDx
                                adjustedDy = 0 - adjustedDy
                            }

                            "${adjustedDx}/${adjustedDy}"
                        } else {
                            ""
                        }

                        //Append to hashmap
                        // When checking next point, there are at least 2 matches (this and that). 1 default (this), +1 (that)
                        val intersectingCount = hashMap.getOrDefault(slope, 1) + 1
                        hashMap[slope] = intersectingCount
                    }
                }

                //The max intersecting for this point is the max of any that match the same equation
                val maxIntersectionsForThisPoint = (hashMap.values.max() ?: 1) + duplicatesOfThisPoint
                if (maxIntersectionsForThisPoint > maxOverall) {
                    maxOverall = maxIntersectionsForThisPoint
                }
            }
            return maxOverall
        }

        fun getGreatestCommonDivisor(a: Int, b: Int): Int {
            if (b == 0) return a
            return getGreatestCommonDivisor(b, a % b)
        }
}