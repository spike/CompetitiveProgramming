class SmallestInfiniteSet() {
    val burnedSet = HashSet<Int>()
    var i = 1
    fun popSmallest(): Int {
        val smallest = i
        burnedSet.add(i)
        i++
        while (burnedSet.contains(i)) {
            i++
        }
        return smallest
    }
    fun addBack(num: Int) {
        burnedSet.remove(num)
        if (num < i) i = num
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * var obj = SmallestInfiniteSet()
 * var param_1 = obj.popSmallest()
 * obj.addBack(num)
 */