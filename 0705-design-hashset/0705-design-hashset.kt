class MyHashSet() {
    val arr = Array<Boolean>(1_000_001) {false}
    fun add(key: Int) {
        arr[key] = true
    }

    fun remove(key: Int) {
        arr[key] = false
    }

    fun contains(key: Int): Boolean {
        return arr[key]
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */