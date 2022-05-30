class Solution:
    def discountPrices(self, sentence: str, discount: int) -> str:
        words = sentence.split()
        
        for i in range(len(words)):
            word = words[i]
            if word[0] == "$" and word[1:].isnumeric():
                amount = float(word[1:])
                amount = amount * (100 - discount) / 100
                words[i] = "$" + "{:.2f}".format(amount)
        
        return " ".join(words)