use std::cmp;

impl Solution {
    pub fn maximum_wealth(accounts: Vec<Vec<i32>>) -> i32 {
        let mut max = 0;
        for person in accounts {
            let mut total = 0;
            for n in person {
                total += n
            }
            max = cmp::max(total, max);
        }
        max
    }
}