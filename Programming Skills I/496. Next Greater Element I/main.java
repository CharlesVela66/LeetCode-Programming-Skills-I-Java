class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] output = new int [nums1.length];
        for (int i = 0; i < nums1.length; i++){
            int index = -1;
            for (int j = 0; j < nums2.length; j++){
                if (nums1[i] == nums2[j]){
                    index = j;
                    break;
                }
            }
            if (index == -1 || index == nums2.length - 1){
                output[i] = -1;
            }
            for (int k = index + 1; k < nums2.length; k++){
                if (nums2[index] < nums2[k]){
                    output[i] = nums2[k];
                    break;
                }
                else{
                    output[i] = -1;
                }
            }
        }
        return output;
    }
}