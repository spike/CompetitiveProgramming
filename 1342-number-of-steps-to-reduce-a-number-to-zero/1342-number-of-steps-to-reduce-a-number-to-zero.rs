impl Solution {
    pub fn number_of_steps(num: i32) -> i32 {
        let mut counter = 0;
        let mut n = num;
        while n > 0 {
            counter += 1;
            if n % 2 == 0 {
                n /= 2;
            } else {
                n -= 1;
            }
        }
        counter
    }
}