class NumMatrix {
    int[][] mat;
    public NumMatrix(int[][] matrix) {
        mat = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = 0;
        for (int row = row1; row <= row2; row++) {
            for (int col = col1; col <= col2; col++) {
                total += mat[row][col];
            }
        }
        return total;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */