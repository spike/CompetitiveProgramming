class Solution {
    fun bulbSwitch(n: Int): Int {
        return Math.sqrt(n.toDouble()).toInt()
    }
}

/*
 1 -> 1
 2 -> 1
 3 -> 1 ___ 3
 4 -> 2
 5 -> 2
 6 -> 2
 7 -> 2
 8 -> 2 ___ 5
 9 -> 3
10 -> 3
11 -> 3
12 -> 3
13 -> 3
14 -> 3
15 -> 3 ___  7
16 -> 4
17 -> 4
    */