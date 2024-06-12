impl Solution {
    pub fn sort_colors(nums: &mut Vec<i32>) {
        let mut zeros = 0;
        let mut ones = 0;
        for i in 0..nums.len() {
            if nums[i] == 0 {
                zeros += 1;
            } else if nums[i] == 1 {
                ones += 1;
            }
        }
        for i in 0..zeros { nums[i] = 0; }
        for i in zeros..zeros+ones { nums[i] = 1;}
        for i in zeros+ones..nums.len() { nums[i] = 2;}
    }
}