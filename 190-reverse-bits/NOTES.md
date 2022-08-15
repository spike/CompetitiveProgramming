## loop 32 times
- shift result right by 1 digit (initial result is 0, so nothing happens the first loop)
- cut off the right part by modding
- shift right by 1 digit
​
## Complexities
- Time: O(1)
- Space: O(1) (since 32 is a constant)
​
## Possible improvements
- if this function is called too many times
- cache results into a hashset
​