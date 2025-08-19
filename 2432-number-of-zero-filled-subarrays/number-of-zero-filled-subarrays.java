class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int ptr1 = 0;
        int ptr2 = 0;
        int n = nums.length;
        while(ptr2<n){
            while(ptr1<ptr2 && nums[ptr2] != 0){
                ptr1 = ptr2;
            }
            if(nums[ptr1]!= 0)ptr1++;
            ans += ptr2-ptr1+1;
            ptr2++;
        }
        return ans;
    }
}