class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int count =0;
        for(String i : words){
            if(i.indexOf(x) != -1) list.add(count);
            count++;
        }
        return list;
    }
}