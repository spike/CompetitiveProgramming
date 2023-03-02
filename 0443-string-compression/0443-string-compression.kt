class Solution {
      fun compress(ar: CharArray): Int {
        val list = mutableListOf<Char>()
        var c = 1
        for (i in ar.indices) {
            if (i == ar.lastIndex || ar[i] != ar[i + 1]) {
                list.add(ar[i])
                if (c > 1) c.toString().forEach { list.add(it) }
                c = 1
            } else c++
        }
        list.forEachIndexed { i, ch -> ar[i] = ch }

        return list.size
    }
}
