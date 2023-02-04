class Solution { /*
length of s1
sliding window on s2
use a broken rolling hash
double check with countmap of each

*/
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() == 0) return false;
        if (s1.length() > s2.length()) return false;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            sum1 = (sum1 + s1.charAt(i)-'a') % Integer.MAX_VALUE;
            sum2 = (sum2 + s2.charAt(i)-'a') % Integer.MAX_VALUE;
        }
        int j = s1.length()-1;
        for (int i = 0;;) {
            //System.out.println(sum1+" == "+sum2);
            if (sum1 == sum2) {
               // System.out.println("equal...");
                if (checkCountMaps(s1, s2.substring(i, j+1))) {
                    return true;
                }
            }
            i++;
            j++;
            if (i + s1.length()-1 >= s2.length()) break;
            sum2 = sum2 - (s2.charAt(i-1)-'a');
          //  System.out.println("removing: " + s2.charAt(i-1) 
          //                     +" "+ (s2.charAt(i-1)-'a')
           //                    +" " + sum2);
            sum2 = (sum2 + (s2.charAt(j)-'a')) % Integer.MAX_VALUE;
          //  System.out.println("adding  : " + s2.charAt(i+s1.length()-1) +" " + sum2);
            //System.out.println("--------");
        }
        return false;
    }
    public boolean checkCountMaps(String str1, String str2) {
       // System.out.println("checking...."+str1 +" " + str2);
        int[] alpha = new int[26];
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            alpha[str1.charAt(i)-'a']++;
            alpha[str2.charAt(i)-'a']--;
        }
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] != 0) return false;
        }
        return true;
    }
}