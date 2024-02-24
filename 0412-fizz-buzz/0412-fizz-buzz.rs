impl Solution {
    pub fn fizz_buzz(n: i32) -> Vec<String> {
        let mut res: Vec<String> = Vec::new();
        
        for i in 1..=n {
            let m3 = i % 3 == 0;
            let m5 = i % 5 == 0;
            let s = match (m3, m5) {
                        (true, true) => String::from("FizzBuzz"),
                        (true, false) => String::from("Fizz"),
                        (false, true) => String::from("Buzz"),
                        _ => i.to_string(),
                    };
            res.push(s);
        }
        println!("{:?}", res);
        res
    }
}