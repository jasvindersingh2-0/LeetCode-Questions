class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int ans = 0;
        int i = 0;

        while (i < n) {
            if (freq.size() == n - i) break; // All remaining are unique

            for (int j = 0; j < 3 && i + j < n; j++) {
                int val = nums[i + j];
                freq.put(val, freq.get(val) - 1);
                if (freq.get(val) == 0) freq.remove(val);
            }

            i += 3;
            ans++;
        }

        return ans;
    }
}
