## loop 32 times
- shift result right by 1 digit (initial result is 0, so nothing happens the first loop)
- cut off the rightmost binary digit by modding by 2
- shift right by 1 digit
​
## Complexities
- Time: O(1)
- Space: O(1) (since 32 is a constant)
​
## Possible improvements
- if this function is called too many times
- then cache results into a hashmap
- to save on space, cache only 16 bit integers and recombine the two at the end