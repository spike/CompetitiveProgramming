impl Solution {
    pub fn running_sum(nums: Vec<i32>) -> Vec<i32> {
        let mut res: Vec<i32> = Vec::new();
        let mut tot = 0;
        for n in nums {
            tot += n;
            res.push(tot);
        }
        res
    }
}