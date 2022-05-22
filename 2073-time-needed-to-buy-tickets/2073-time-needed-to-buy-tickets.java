class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int timeTaken = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                timeTaken += Math.min(tickets[i], tickets[k]);
            } else {
                timeTaken += Math.min(tickets[i], tickets[k]-1);
            }
        }
        return timeTaken;
    }
    // Key insight: 
    // [5, 5, 5]   k=1  <== Easy case
    // [9, 5, 9]   k=1  <== Easy case
    // Think of the following illegal contrived example:
    // [4, 0, 5, 0]   k=2  <== time taken is 9
    // In other words, the minimum value of each cell is what's required
    // [2, 2] k=0 <== tricky edge case when i > k (one less turn)
   
}
// Time: O(n), Space: O(1)