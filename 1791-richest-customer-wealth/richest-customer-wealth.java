class Solution {
    public int maximumWealth(int[][] a) {
        int max = Integer.MIN_VALUE;
        for(int i =0; i<a.length; i++){
            int count =0;
            for(int j=0; j<a[i].length; j++){
                count +=a[i][j];
            }
            if(count > max) max =count;
        }
        return max;
    }
}