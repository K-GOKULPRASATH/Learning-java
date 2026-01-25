class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1;
        int a =0;
        while(n != 0){
            int temp = n%10;
            p*=temp;
            a+=temp;
            n/=10;
        }
        return p-a;
    }
}