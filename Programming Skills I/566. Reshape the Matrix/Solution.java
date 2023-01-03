class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int rows = mat.length;
       int columns = mat[0].length;
       if (rows * columns != r * c){
           return mat;
       } 
       int [][] newMat = new int [r][c];
       int rowNum = 0;
       int colNum = 0;
       for (int i = 0; i < mat.length; i++){
           for (int j = 0; j <mat[0].length; j++){
               newMat[rowNum][colNum] = mat[i][j];
               colNum++;
               if (colNum == c){
                   colNum = 0;
                   rowNum++;
               }
           }
       }
       return newMat;
    }
}