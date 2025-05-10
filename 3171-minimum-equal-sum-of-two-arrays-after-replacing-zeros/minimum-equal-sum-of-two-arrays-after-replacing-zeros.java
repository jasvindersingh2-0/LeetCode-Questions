class Solution {
    // Tip ->It's actually really simple. Iterate over both arrays and get their sums and number of zeros. Every time you see a zero, add 1 to your sum count because that is the minimum possible value they could be. Next you will have num1's minimum possible sum and num2's minimum possible sum. We never want to make the larger of those two sums any greater. How can we determine whether or not the smaller sum can catch up?
    public long minSum(int[] nums1, int[] nums2) {
        long zero1 = 0;
        long zero2 = 0;
        long sum1 = 0;
        long sum2 = 0;
        for(int i : nums1){
            sum1+=i;
            if(i == 0){
                zero1++;
                sum1++;
            }
        }
        for(int i : nums2){
            sum2+=i;
            if(i ==0){
                sum2++;
                zero2++;
            }
        }
        // System.out.println("Sum1 "+sum1+" Zero1 "+zero1);
        // System.out.println("Sum2 "+sum2+" Zero2 "+zero2);
        if(sum1<sum2 && zero1 == 0)return -1;
        if(sum2<sum1 && zero2 == 0)return -1;
        return Math.max(sum1,sum2);
    }
}