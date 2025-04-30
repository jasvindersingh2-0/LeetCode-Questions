class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i : nums){
            String temp = i+"";
            if(temp.length()%2 == 0)ans++;
        }
        return ans;
    }
}