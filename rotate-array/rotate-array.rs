impl Solution {
    pub fn rotate(nums: &mut Vec<i32>, k: i32) {
        let lim = (k as usize) % nums.len();
        nums.reverse();
        nums[0..lim as usize].reverse();
        nums[lim as usize..].reverse();
    }
}