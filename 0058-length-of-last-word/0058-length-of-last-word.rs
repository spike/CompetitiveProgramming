impl Solution {
    pub fn length_of_last_word(s: String) -> i32 {
        let mut res = 0;
        let mut count = 0;
        for c in s.bytes() {
            if c != b' ' {
                count += 1;
                res = count;
            } else {
                count = 0;
            }
        }
        res
    }
}