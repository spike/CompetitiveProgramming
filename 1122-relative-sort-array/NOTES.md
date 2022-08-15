## Brute force:
- O(n^2)
​
## Better approach:
- HashMap for array 2
- Use a custom comparator based on the hashmap to sort array 1
- Time O(n log(n))  Space: O(n) -- **TODO:** try to do in-place
​
​
## Possible cases
1.  a and b are not in the map, sort normally
2.  a is not in the map, return -1
3.  b is not in the map, return 1
4.  a and b are equal, return 0