## Brute force
- Time: O(number of trucks * size)
- Space: O()
​
## Better approach
-  sort descending by the capacity of each box
-  start subtracting boxes type by type starting from the biggest until remaining space is 0 or until you've ran out of available boxes
-  Time: O(n log(n))
-  Space: O(1)