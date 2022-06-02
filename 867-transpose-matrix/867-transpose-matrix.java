class Solution {
    // See the practice diary on my notes
    // Time O(n), Space O(n) (or O(1) output sensitive)
    public int[][] transpose(int[][] matrix) {
        int[][] matrix2 = new int[matrix[0].length][matrix.length];
        
        for (int rows = 0; rows < matrix2.length; rows++) {
            for (int cols = 0; cols < matrix2[0].length; cols++) {
                matrix2[rows][cols] = matrix[cols][rows];
            }
        }
        return matrix2;
    }
}