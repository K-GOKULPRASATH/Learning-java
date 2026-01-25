class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] h, int t) {
        int count =0; 
        for(int i: h){
            if(i >= t) count++;
        }   
        return count;
    }
}