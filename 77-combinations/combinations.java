class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combi = new ArrayList<>();
        return rec(1, n, k, combi, res);
    }
    public static List<List<Integer>> rec(int st, int n, int k, List<Integer> combi, List<List<Integer>> res){
        if(combi.size() == k){
            res.add(new ArrayList<>(combi));
            return res;
        }
        for(int start = st; start <= n; start++){
            combi.add(start);
            rec(start+1, n, k, combi, res);
            combi.remove(combi.size()-1);
        }
        return res;
    }
}