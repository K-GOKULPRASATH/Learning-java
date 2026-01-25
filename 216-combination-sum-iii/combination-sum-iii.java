class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Combination(1, k, n, list, result);
        return result;
    }
    public static List<List<Integer>> Combination (int start, int k, int n, List<Integer> list, List<List<Integer>> result){
        if(list.size() == k){
            int total =0;
            for(int x : list) total += x;
            if(total == n) result.add(new ArrayList(list));

            return result;
        }
        for(int i = start; i <= 9; i++){
            list.add(i);
            Combination(i+1, k, n, list, result);
            if(!list.isEmpty()) list.remove(list.size()-1);
        }
        return result;
    } 


}