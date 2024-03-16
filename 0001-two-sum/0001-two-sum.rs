use std::collections::HashMap;

impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut hm: HashMap<i32, usize> = HashMap::with_capacity(nums.len());
        for (i, n) in nums.into_iter().enumerate() {
            let comp = target - n;
            match hm.get(&comp) {
                Some(&prev) => return vec![prev as i32, i as i32],
                None => { hm.insert(n, i); }
            }
        }
        unreachable!()
    }
}

// brute force solution actually works in Rust
// impl Solution {
//     pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
//         for i in 0..nums.len() {
//             for j in i+1..nums.len() {
//                 if (nums[i] + nums[j]) == target {
//                     return vec![i as i32, j as i32];
//                 }
//             }
//         }        
//         unreachable!();
//     }
// }
