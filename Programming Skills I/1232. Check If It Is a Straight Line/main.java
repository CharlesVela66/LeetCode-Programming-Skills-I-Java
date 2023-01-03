class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if (n == 2){
            return true;
        }
        int [] arr1 = new int []{coordinates[1][0] - coordinates[0][0], coordinates[1][1] - coordinates[0][1]};
        for (int i = 2; i < coordinates.length; i++){
            int [] arr2 = new int []{coordinates[i][0] - coordinates[i - 1][0], coordinates[i][1] - coordinates[i - 1][1]};
            if(arr1[0]*arr2[1] - arr1[1]*arr2[0] != 0) return false;
        }
        return true;
    }
}