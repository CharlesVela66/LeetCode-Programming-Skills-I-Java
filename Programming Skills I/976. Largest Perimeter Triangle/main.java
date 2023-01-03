class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = n - 1; i >= 2; i--){
            if (isValidTriangle(nums[i], nums[(i - 1)], nums[(i - 2)])){
                return nums[i] + nums[(i - 1)] + nums[(i - 2)];
            }
        }
        return 0;
    }
    public boolean isValidTriangle(int a, int b, int c){
        return a + b > c && a + c > b && b + c > a;
    }
}