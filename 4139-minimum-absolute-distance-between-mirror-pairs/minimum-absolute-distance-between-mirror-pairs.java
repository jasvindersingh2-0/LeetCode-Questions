class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        Map<Integer,Integer>mp = new HashMap();
        for(int i=0;i<n;i++){
            int curr = nums[i];
            if(mp.containsKey(curr)){
                ans = Math.min(ans,i-mp.get(curr));
            }
            int rev = reverse(nums[i]);
            mp.put(rev,i);
            
        }
        return ans == Integer.MAX_VALUE?-1:ans;
    }
    public int reverse(int num){
        int ans = 0;
        while(num%10 == 0){
            num = num/10;
        }
        while(num>0){
            ans *=10;
            ans+=  num%10;
            num /=10;
        }
        return ans;
    }
    
}