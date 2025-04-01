class Solution {
    public long helper(int i,int[][]questions,long[]dp){
        if(i >= questions.length)return 0;
        if(dp[i]!= -1)return dp[i];
        long op1 = questions[i][0] + helper(i+questions[i][1]+1,questions,dp);
        long op2 = helper(i+1,questions,dp);
        return dp[i] = Math.max(op1,op2);
    }
    public long mostPoints(int[][] questions) {
        long[]dp = new long[questions.length+2];
        Arrays.fill(dp,-1);
        return helper(0,questions,dp);
    }
}