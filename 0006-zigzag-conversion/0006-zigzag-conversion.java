class Solution { /* 
n                 n-1       0            0
n+1         n-1   n+1       1        1   1
n+1    n-1        n+1       2    2       2
n+1               n+1       3            3       */
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int n = 0;
        boolean increase = true;
        int lastRow = numRows-1;
        int j = 0;
        while (j < s.length()) {
            rows[n].append(s.charAt(j));
            if (n == 0 || n == lastRow) {
                if (n == 0) increase = true;
                if (n == lastRow) increase = false;
            }
            if (increase) n++;
            else n--;
            j++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(rows[i].toString());
        }
        return result.toString();
    }
}