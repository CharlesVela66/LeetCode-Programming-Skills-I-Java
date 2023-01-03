class Solution {
    public int diagonalSum(int[][] mat) {
        if (mat.length == 1){
            return mat[0][0];
        }
        int sum = 0;
        int n = mat.length;
        int i = 0;
        int j = 0;
        while (i < n){
            sum += mat[i][i];
            i++;
        }
        i = n - 1;
        while (i >= 0){
            if (n % 2 == 1 && i == j){

            }
            else {
                sum += mat[i][j];
            }
            i--;
            j++;
        }

        return sum;
    }
}