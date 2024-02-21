impl Solution {
    pub fn length_of_last_word(s: String) -> i32 {
        s.trim()
            .split_whitespace()
            .collect::<Vec<&str>>()
            .last()
            .unwrap()
            .len() as i32
    }
}