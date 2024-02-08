impl Solution {
    pub fn first_uniq_char(s: String) -> i32 {
        let mut arr = [0;26];
        for c in s.bytes() {
            arr[(c - b'a') as usize] += 1;
        }
        for (i,c) in s.bytes().enumerate() {
            if arr[(c-b'a') as usize] == 1 {
                return i as i32;
            }
        }
        -1
    }
}
