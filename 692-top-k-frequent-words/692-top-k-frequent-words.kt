class Solution {
    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val hm = HashMap<String, Int>()
        for (w in words) {
            hm[w] = (hm[w] ?: 0) + 1
        }
        val sortedMap = hm.toSortedMap(Comparator { a, b ->
            if (hm[a] == hm[b]) { // if freq is equal
                a.compareTo(b)
            } else { // otherwise, compare by freq, highest first!
                hm[b]!!.compareTo(hm[a]!!)
            }
        })
        
        return sortedMap
                    .asIterable()
                    .take(k)
                    .map{ (key, _) -> key }
                    .toList()
    }
}