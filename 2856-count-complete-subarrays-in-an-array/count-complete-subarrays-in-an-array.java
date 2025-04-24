class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        HashSet<Integer>st = new HashSet();
        for(int i : nums){
            st.add(i);
        }
        int total = st.size();
        st.clear();
        HashMap<Integer,Integer>mp = new HashMap<>();
        int ptr1 = 0;
        int ptr2 = 0;
        int ans = 0;
        while(ptr2<n){
            mp.put(nums[ptr2],mp.getOrDefault(nums[ptr2],0)+1);
            while(ptr1<=ptr2 && mp.size()==total){
                ans += n - ptr2;
                mp.put(nums[ptr1],mp.get(nums[ptr1])-1);
                if(mp.get(nums[ptr1]) == 0)mp.remove(nums[ptr1]);
                ptr1++;
            }
            ptr2++;
        }
        return ans;
    }
}