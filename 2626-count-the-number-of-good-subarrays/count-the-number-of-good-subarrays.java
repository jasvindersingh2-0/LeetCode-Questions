class Solution {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        int ptr1 = 0;
        int ptr2 = 0;
        int curPairs = 0;
        HashMap<Integer,Integer>mp = new HashMap<>();
        long ans = 0;
        while(ptr2<n){
            mp.put(nums[ptr2],mp.getOrDefault(nums[ptr2],0)+1);
            curPairs += mp.get(nums[ptr2])-1;
            // if(curPairs>=k)ans++;
            while(ptr1<ptr2 && curPairs>=k){
                // choota karne ke liye
                ans+= (n-ptr2);
                mp.put(nums[ptr1],mp.get(nums[ptr1])-1);
                curPairs -= mp.get(nums[ptr1]);
                ptr1++;
            }
            ptr2++;

        }
        return ans;
    }
}