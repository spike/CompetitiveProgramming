1. Looping over Alien alphabet to create an index array
2. Looping over the array of words **two words** at a time
3. Using a helper function, I'm comparing both those words
4. Inside the helper function, I'm comparing both words character by character using the earlier index I created.
5. If the order doesn't match the Alien alphabet, I break out of the loop by returning **false** early.
​
Time: O(n).   Space: O(1)
​
**Point of confusion:** Do not confuse with Java. In Kotlin, the `String.` before the function declaration allows me to place a parameter before the function when calling it.
​
`fun String.isBefore(other: String, t: Array<Int>): Boolean {`
​
In other words, I can call this function by saying: `"Stephan".isBefore("Albert")` and that function should return either true/false.
​