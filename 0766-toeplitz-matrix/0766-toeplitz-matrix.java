class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean answer = true;
//(0,0) (0,1) (0,2) (0,3)
//(1,0) (1,1) (1,2) (1,3)
//(2,0) (2,1) (2,2) (2,3)
        
        for(int i = 0; i < matrix.length-1; i++) {
            for(int j = 0; j < matrix[i].length-1; j++) {
                if(matrix[i][j] != matrix[i+1][j+1]) {
                    return false;
                }
            }
        }
        
        return answer;
    }
}