class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        int res = 0;
        for(int[]i : dominoes){
            int val = Math.min(i[0],i[1])*10 + Math.max(i[0],i[1]);
            int count = mp.getOrDefault(val,0);
            res += count;
            mp.put(val,count+1);
        }
        return res;

    }
}