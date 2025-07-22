class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int ptr1 = 0;
        int ptr2 = 0;
        int sum = 0;
        int res = 0;
        HashSet<Integer>st = new HashSet();
        while(ptr2<n){
            while(ptr1<=ptr2 && st.contains(nums[ptr2])){
                st.remove(nums[ptr1]);
                sum -=nums[ptr1];
                ptr1++;
            }
            st.add(nums[ptr2]);
            sum += nums[ptr2];
            res = Math.max(res,sum);
            ptr2++;
        }
        return res;
    }
}