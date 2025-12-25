class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans = 0;
        int count = 0;
        for(int i=happiness.length-1;i>=0;i--){
            if(k<=0)return ans;
            k--;
            ans += Math.max(0, happiness[i]-count++);

        }
        return ans;

    }
}