class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer>mp = new HashMap();
        int max = 0;
        for(int i=1;i<=n;i++){
            int temp = i;
            int sum = 0;
            while(temp>0){
                sum += temp%10;
                temp/=10;
            }
            // System.out.println(sum);
            mp.put(sum,mp.getOrDefault(sum,0)+1);
            max = Math.max(max,mp.get(sum));
        }
        int ans=0;
        for(int i : mp.keySet()){
            if(mp.get(i)==max)ans++;
        }
        // System.out.println(mp.get(4));
        return ans;
    }
}