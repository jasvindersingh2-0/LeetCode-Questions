class Solution {
    public void sortColors(int[] nums) {
        int zer = 0;
        int one = 0;
        int two = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0)zer++;
            else if(nums[i] == 1)one++;
            else two++;
        }
        for(int i=0;i<nums.length;i++){
            if(zer>0){
                nums[i] = 0;
                zer--;
            }
            else if(one>0){
                nums[i] = 1;
                one--;
            }
            else nums[i] = 2;
        }
        // return nums;

    }
}