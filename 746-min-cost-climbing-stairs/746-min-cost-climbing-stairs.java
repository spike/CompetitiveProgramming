class Solution {
   // T(i) = Min(T(i-1),T(i-2)) + C(i)
    /*
    [10,40,20,30,5]0
     10,40,30,40,35]0 ===>> 35
     [10,15,20]0
      10,15,30]15+0  ===> 15
      
      [1,100,1,1,1,100,1,1,100,1]0
       1,100,2,3,3,103,4,5,104,6]6 
    */
    public int minCostClimbingStairs(int[] cost) { // [10,15,20]
        int[] dp = new int[cost.length+1]; 
        dp[0] = cost[0]; // 10
        dp[1] = cost[1]; // 15
        for (int i = 2; i <= cost.length; i++) { // 4 <=
            dp[i] = Math.min(dp[i-2], dp[i-1])  // 15
                + ((i == cost.length) ? 0 : cost[i]); // 3==3 return 0
        }
        return dp[dp.length-1];
        // dp[2] = 20
        // dp[3] = 15  
    }
    
}