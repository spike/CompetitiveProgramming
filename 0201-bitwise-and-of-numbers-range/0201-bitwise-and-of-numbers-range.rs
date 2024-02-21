impl Solution {    
    pub fn range_bitwise_and(left: i32, right: i32) -> i32 {
        let mut res = right;
        for i in left..right { 
            res &= i;
        }
        res
    }
}