class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>mp = new HashMap();
        int n = arr.length;
        int ans = -1;
        int ansf = 0;
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(int i : mp.keySet()){
             int freq = mp.get(i);
            if(i == freq && freq>ansf){
                ansf = freq;
                ans =i;
            }
        }
        return ans;
    }
}