class Solution {
    int sum = 0;
    public void helper(int i, int[]arr,int n,int curr){
        if(i==n){
            sum += curr;
            return;
        }
        helper(i+1,arr,n,curr^arr[i]);
        helper(i+1,arr,n,curr);

    }
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        helper(0,nums,n,0);
        return sum;
        
    }
}