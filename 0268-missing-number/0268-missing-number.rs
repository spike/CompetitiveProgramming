use std::collections::HashSet;

impl Solution {
    pub fn missing_number(nums: Vec<i32>) -> i32 {
        let mut hs: HashSet<i32> = HashSet::new();
        let len = nums.len();
        for (i, n) in nums.iter().enumerate() {
            hs.insert(*n);
        }
        for i in 0..len+1 {
            let n = i as i32;
            if !hs.contains(&n) {
                return n
            }
        }
        return -1
    }
}