class Solution {
    // Approach -> get all pairs which have sum less than lower, and pairs which have sum less than or equal upper it will cancel pairs from 0 to lower and only lower to upper will be remaining ones
    public long countFairPairs(int[] nums, int lower, int upper) {
    Arrays.sort(nums);
    return getPairsLessThan(nums, upper+1)-getPairsLessThan(nums, lower);    
    }
    public long getPairsLessThan(int nums[], int val)
    {
      int left = 0, right = nums.length-1;
      long res = 0;
      while(left<=right)
      {
        if((nums[left]+nums[right])<val)
        {
            res += right-left; // this will give count of all pairs of lower value till right(0,1)(0,4)(0,4)(0,5)
            left++;
        }
        else
             right--;
      }  
      return res;
    }
}