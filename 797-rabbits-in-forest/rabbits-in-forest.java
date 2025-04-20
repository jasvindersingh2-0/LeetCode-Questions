class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        int ans = 0;
        for(int i : answers){
           mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i : mp.keySet()){
            if(mp.get(i)>i+1){
                while(mp.get(i)>0){
                    ans += i+1;
                    mp.put(i,mp.get(i)-(i+1));
                }
            }
            else ans += i+1;
        }
        return ans;
    }
}