class Solution {
    public long distributeCandies(int n, int limit) {
        long ans = 0;
        for(int i=0;i<=Math.min(limit,n);i++){
            int rem = n-i;
            if(rem > 2*limit)continue;
            int j = Math.max(0,rem-limit);
            int k = Math.min(limit,rem);
            ans += k-j+1;
        }
        return ans;
    }
}