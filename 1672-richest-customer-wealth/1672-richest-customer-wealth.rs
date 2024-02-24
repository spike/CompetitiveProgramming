use std::cmp;

impl Solution {
    pub fn maximum_wealth(accounts: Vec<Vec<i32>>) -> i32 {
        let mut richest: i32 = 0;
        
        for customer in accounts {
            let mut total = 0;
            for money in customer {
                total += money;
            }
            richest = cmp::max(total, richest);
        }
        richest
    }
}