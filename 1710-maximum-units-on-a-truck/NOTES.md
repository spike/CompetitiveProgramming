## Brute force
- Time: O(number of trucks * size) both 1000 or less, so time complexity is constant
- Space: O()
​
## Better approach
-  sort descending by the capacity of each box
-  start subtracting boxes type by type starting from the biggest until remaining space is 0 or until you've ran out of available boxes
-  Time: O(n log(n)) (again, n is 1000 or less, so time is constant)
-  Space: O(1)