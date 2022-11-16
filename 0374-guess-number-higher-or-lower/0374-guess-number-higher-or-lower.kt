/** 
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
        var low = 1
        var high = n
        
        while (low <= high) {
            val myGuess = (high - low) / 2 + low
            when (guess(myGuess)) {
                -1 -> high = myGuess - 1
                1 -> low = myGuess + 1
                0 -> return myGuess
            }
        }
        return low
    }
}