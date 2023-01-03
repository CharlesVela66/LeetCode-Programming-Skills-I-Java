class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> numberSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (numberSet.contains(nums[i])){
                return true;
            }
            else {
                numberSet.add(nums[i]);
            }
        }
        return false;
    }
}