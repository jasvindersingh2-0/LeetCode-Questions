class Solution {
    public int countSubarrays(int[] nums) {
        int ans = 0;
        for(int i=0;i+2<nums.length;i++){
            if(nums[i]+nums[i+2] == nums[i+1]/2.0)ans++;
        }
        return ans;
    }
}