impl Solution {
    pub fn is_palindrome(x: i32) -> bool {
        if x < 0 { return false }
        if x == 0 { return true}
        let mut v = Vec::new();
        let mut n = x;
        while n > 0 {
            v.push(n % 10);
            n /= 10;
        }
        let len = v.len();
        
        for i in 0..len/2 {
            if v[i] != v[len-i-1] {
                return false
            }
        }
        return true
    }
}