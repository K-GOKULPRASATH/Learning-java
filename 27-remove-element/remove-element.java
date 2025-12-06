class Solution {
    public int removeElement(int[] nums, int val) {
        int tcount =0;
        
        for(int i=0; i< nums.length; i++){
            if(nums[i] ==val){
                nums[i] = 99;
                tcount++;
            }
        }
        Arrays.sort(nums);
        int count =nums.length-tcount;
        return count;
    }
}