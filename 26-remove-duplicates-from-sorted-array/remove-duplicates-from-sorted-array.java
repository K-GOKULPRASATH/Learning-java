class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        boolean flag = true;
        for(int i=0; i<nums.length; i++){
            flag = true;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    flag = false;
                }
            }
            if(flag){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}