class NumMatrix {
    int[][] mat;
    HashMap<String, Integer> hm;
    public NumMatrix(int[][] matrix) {
        mat = matrix;
        hm = new HashMap();
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = 0;
        String key = row1 + "-" + col1 + "=" + row2 + "-" + col2;
        if (hm.containsKey(key)) {
            total = hm.get(key);
        } else {
            for (int row = row1; row <= row2; row++) {
                for (int col = col1; col <= col2; col++) {
                    total += mat[row][col];
                }
            }
            hm.put(key, total);
        }
        return total;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */