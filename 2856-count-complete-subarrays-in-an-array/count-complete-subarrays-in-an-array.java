class Solution {
    // Approah -> agar ek sub array ke distinct elements total distict element ke equal hai matlab jis point par apan khade hai uske aage ke jitne bhi sub arrays aayenge unke distinct elements bhi total ke equal hi honge(ex - agar ek array mein 3 distinct element hai or ek subarray mein bhi utne hi distinct ele hai to aage mtlab koi naya element to ho nahi sakta to yahi se aage ke sab array ko le lo) to unn sab lo issi point par jode liya
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        HashSet<Integer>st = new HashSet();
        for(int i : nums){
            st.add(i);
        }
        int total = st.size();
        HashMap<Integer,Integer>mp = new HashMap<>();
        int ptr1 = 0;
        int ptr2 = 0;
        int ans = 0;
        while(ptr2<n){
            mp.put(nums[ptr2],mp.getOrDefault(nums[ptr2],0)+1);
            while(ptr1<=ptr2 && mp.size()==total){
                ans += n - ptr2; // adding all subarrays including this to end of array
                mp.put(nums[ptr1],mp.get(nums[ptr1])-1);
                if(mp.get(nums[ptr1]) == 0)mp.remove(nums[ptr1]);
                ptr1++;
            }
            ptr2++;
        }
        return ans;
    }
}