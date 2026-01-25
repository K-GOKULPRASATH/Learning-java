class Solution {
    public int differenceOfSums(int n, int m) {
        int d =0;
        int notd =0;
        for(int i = 1; i <= n; i++){
            if(i%m ==0) d += i;
            else notd += i;
        }
        return notd - d;
    }
}