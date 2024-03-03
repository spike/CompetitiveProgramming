impl Solution {
    pub fn can_construct(r: String, m: String) -> bool {
        let mut arr = [0i32; 26];
        for c in r.bytes() {
            arr[(c-b'a') as usize] -= 1;
        }
        for c in m.bytes() {
            arr[(c-b'a') as usize] += 1;
        }
        for n in arr {
            if n < 0 {
                return false;
            }
        }
        true
    }
}