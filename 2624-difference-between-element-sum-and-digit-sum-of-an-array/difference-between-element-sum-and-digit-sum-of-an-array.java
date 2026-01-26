class Solution {
    public int differenceOfSum(int[] arr) {
        int sum1 = 0; 
        int sum2 = 0;
        for(int i = 0; i< arr.length; i++){
            sum1 += arr[i];
            if(arr[i] >=1 && arr[i] <=9) sum2 += arr[i];
            else{
                sum2 += sum(arr[i], 0);
            }
        }
        return Math.abs(sum1 - sum2);
        
    }
    public static int sum(int a, int sum){
        if(a == 0) return sum;
        return sum += a%10 + sum(a/10, sum);
    }
}