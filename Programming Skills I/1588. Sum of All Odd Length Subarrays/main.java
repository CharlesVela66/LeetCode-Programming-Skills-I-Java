class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            int left = i + 1;
            int right = arr.length - i;
            int numOfArrays = left * right;
            int numOfOddArrays = numOfArrays / 2 + (numOfArrays % 2);
            sum += numOfOddArrays * arr[i];
        }
        return sum;
    }
}