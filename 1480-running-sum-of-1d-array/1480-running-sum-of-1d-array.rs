impl Solution {
    pub fn running_sum(nums: Vec<i32>) -> Vec<i32> {
        let mut v: Vec<i32> = Vec::new();
        let mut total = 0i32;
        for n in nums {
            total += n;
            v.push(total);
        }
        v
    }
}