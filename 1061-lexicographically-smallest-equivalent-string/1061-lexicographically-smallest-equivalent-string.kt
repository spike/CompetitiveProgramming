class Solution {
    fun smallestEquivalentString(s1: String, s2: String, baseStr: String): String {
        val charArr = IntArray(26) { -1 }
        val groupMap = HashMap<Int, TreeSet<Char>>()
        for (i in s1.indices) {
            if (charArr[s1[i] - 'a'] == -1 && charArr[s2[i] - 'a'] == -1) {
                val s = groupMap.size
                charArr[s1[i] - 'a'] = s
                charArr[s2[i] - 'a'] = s
                groupMap[s] = groupMap.getOrDefault(s, TreeSet())
                groupMap[s]!!.add(s1[i])
                groupMap[s]!!.add(s2[i])
            } else if (charArr[s1[i] - 'a'] > -1 && charArr[s2[i] - 'a'] > -1) {
                if (charArr[s1[i] - 'a'] != charArr[s2[i] - 'a']) {
                    groupMap[charArr[s1[i] - 'a']]!!.addAll(groupMap[charArr[s2[i] - 'a']]!!)
                    groupMap.remove(charArr[s2[i] - 'a'])
                    val oldParent = charArr[s2[i] - 'a']
                    for (j in 0..25) {
                        if (oldParent == charArr[j]) {
                            charArr[j] = charArr[s1[i] - 'a']
                        }
                    }
                }
            } else if (charArr[s1[i] - 'a'] == -1) {
                charArr[s1[i] - 'a'] = charArr[s2[i] - 'a']
                groupMap[charArr[s2[i] - 'a']]!!.add(s1[i])
            } else {
                charArr[s2[i] - 'a'] = charArr[s1[i] - 'a']
                groupMap[charArr[s1[i] - 'a']]!!.add(s2[i])
            }
        } 

        val sb = StringBuilder()
        for (c in baseStr) {
            if (!groupMap.containsKey(charArr[c - 'a'])) {
                sb.append(c)
            } else {
                sb.append(groupMap[charArr[c - 'a']]!!.iterator().next()) 
            }
        }
        return sb.toString()
    }
}