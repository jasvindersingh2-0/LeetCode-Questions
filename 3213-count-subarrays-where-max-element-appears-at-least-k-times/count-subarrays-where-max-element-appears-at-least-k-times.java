class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        for(int i : nums){
            max = Math.max(i,max);
        }
        int ptr1 = 0;
        int ptr2 = 0;
        int count = 0;
        long ans = 0;
        while(ptr2<n){
            if(nums[ptr2]==max)count++;
            while(count>=k){
                if(nums[ptr1]==max){
                    count--;
                }
                ans += n-ptr2;
                ptr1++;
            }
            ptr2++;
        }
        return ans;
        
    }
}