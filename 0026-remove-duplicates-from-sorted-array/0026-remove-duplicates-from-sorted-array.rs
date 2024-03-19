impl Solution {
    pub fn remove_duplicates(nums: &mut Vec<i32>) -> i32 {
        let mut temp: Vec<i32> = Vec::new();
        temp.push(nums[0]);
        for i in 1..nums.len() {
            if nums[i] != nums[i-1] {
                temp.push(nums[i]);
            }
        }
        for i in 0..temp.len() {
            nums[i] = temp[i];
        }
        temp.len() as i32
    }
}