class Solution {
    public int numSpecial(int[][] mat) {
        boolean flag;
        int count =0;
        for(int i =0; i <mat.length; i++){
            flag = false;
            for(int j =0; j< mat[i].length; j++){
                if(mat[i][j] == 1){
                    flag = functionCall(mat,i,j);
                }
            }
            if(flag) count++;
        }
        return count;
    }
    public static boolean functionCall(int [][]mat, int i, int j){
        for( int k =0;k< mat.length; k++){
            if(mat[k][j] ==1 && k != i) return false;
        }
        for( int k =0;k< mat[i].length; k++){
            if(mat[i][k] ==1 && k != j) return false;
        }
        return true;
    }
}