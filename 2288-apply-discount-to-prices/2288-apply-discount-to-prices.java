class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() < 2) continue;
            if (word.charAt(0) != '$') continue;
            
            if (isValid(word.substring(1))) {
                words[i] = "$" + format(word.substring(1), discount);    
            }
        }
        return String.join(" ", words);
    }
    private boolean isValid(String num) {
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c < '0' || c > '9') return false;
        }
        return true;
    }
    private String format(String num, int discount) {
        double n = Long.parseLong(num) * ((100-discount) / 100d);
        return String.format("%.2f", n);
    } 
    
}