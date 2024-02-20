use std::collections::HashSet;

impl Solution {
    pub fn missing_number(nums: Vec<i32>) -> i32 {
        let mut res: i32 = 0;
        for (i, n) in nums.iter().enumerate() {
            res ^= (i as i32 + 1) ^ n;
        }
        res
    }
}