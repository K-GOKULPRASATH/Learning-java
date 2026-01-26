class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i =0; i < nums.length; i+=2){
            size += nums[i];
        }
        int [] target = new int [size];
        int pointer = 0;
        for(int i =0; i<nums.length; i+=2){
            int times = nums[i];
            int val = nums[i+1];
            for(int j =0 ; j< times; j++){
                target[pointer++] = val;
            }
        }
        return target;
    }
}