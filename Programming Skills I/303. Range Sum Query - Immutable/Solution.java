class NumArray {
    int [] arr;
    int n;
    public NumArray(int[] nums) {
        n = nums.length;
        arr = new int[n];
        arr = nums;
    }
    
    public int sumRange(int left, int right) {
        if (left < 0 || right >= n){
            return 0;
        }
        int sum = 0;
        for (int i = left; i <= right; i++){
            sum += arr[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */