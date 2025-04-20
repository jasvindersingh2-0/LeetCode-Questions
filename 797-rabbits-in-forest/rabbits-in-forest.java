class Solution {
    public int numRabbits(int[] answers) {
        // Approach -> use map to see how many are saying ki mere jese itne hai
        // like in ex1 2 are saying ke mere jesa 2 or hai.
        // baaki wrong ansers jo submit hue hai uss se samajh aayega

        // wo while loop isliye ki maan lo 3 ne kah mere jesa ek or hai , to 2 to pair ho gaye like pahal red bole mere jesa ek or or dusra red bhi same kahe par, 3 jo blue hai usne kah mere jesa ek or hai par dusre blue ne jawab hi nahi diya isliye i+1 minus kiya hai taki ek baar mein ek colour hata sake;
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