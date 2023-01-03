class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = arr.length - 1; i >= 1; i--){
            if (arr[i] - arr[i - 1] != diff){
                return false;
            }
        }
        return true;
    }
}