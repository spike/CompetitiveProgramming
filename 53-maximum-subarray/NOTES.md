## Brute force:
- add up all the contiguous permutations together
- keep only the maximum sum
- exponential time complexity (**TODO:** Is "exponential" the right word?)
​
​
## Special edge case:
- if all the numbers are negative, return the least negative one
​
## Better approach:
- start by adding up only the contiguous positive numbers together
- keep the maximum sum at each iteration
- if a negative number is found after positive numbers, see if the substraction
doesn't cancel out the current sum
- if it cancels it out, reset the sum to 0 *(but do not forget special edge case)*
​
**TODO:** Try to understand why the code in the discussion forum is simpler than mine
​