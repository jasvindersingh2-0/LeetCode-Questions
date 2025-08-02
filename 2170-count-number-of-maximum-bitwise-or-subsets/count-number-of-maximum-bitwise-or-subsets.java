class Solution {
    int ans = 0;
    public void helper(int i,int[] nums,int max,int or){
        if(i == nums.length)return;
        int op1 = 0;
        int op2 = 0;
       if((or|nums[i]) == max)ans++;
       helper(i+1,nums,max,or|nums[i]);
       helper(i+1,nums,max,or);
       return; 
    }
    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        for(int i: nums){
            max |= i;
        }
        helper(0,nums,max,0);
        return ans;
    }
}