class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        long sum2 = 0;
        long zero1 = 0;
        long zero2 = 0;
        for(int i : nums1){
            if(i==0)zero1++;
            sum1+=i;
        }
        for(int i : nums2){
            if(i==0)zero2++;
            sum2+=i;
        }
        // System.out.println("sum1 "+sum1+" "+"zero1 "+zero1);
        // System.out.println("sum2 "+sum2+" "+"zero2 "+zero2);
        if(sum1 == sum2){
            if(zero1 == 0 && zero2 == 0)return sum1;
            else if(zero1 == 0 && zero1 != 0)return -1;
            else if(zero1 != 0 && zero2 == 0)return -1;
            else return sum1 + Math.max(zero1 , zero2);
        }
        if(sum1 != sum2 &&(zero1 == 0 && zero2 ==0))return -1;
        if(sum1 == sum2 && (zero1 != 0 && zero2 != 0))return sum1 + Math.max(zero1,zero2);
        
        // if(zero1 == 0 || zero2 == 0)return -1;
        int max = 0;
        if(sum1>sum2 && zero1>=zero2){
            if(zero2 == 0)return -1;
            // if(zero2>sum1-sum2)return -1;
            return sum1+zero1;
        }
        else if(sum1>sum2 && zero1<zero2){
            if(sum1<sum2+zero2 && zero1 == 0)return -1;
            if(sum1+zero1>=sum2+zero2)return sum1+zero1;
            else return sum2+zero2;
        }
        else if(sum2>sum1 && zero2>=zero1){
            if(zero1==0)return -1;
            return sum2+zero2;
        }
        else if(sum2>sum1 && zero1>zero2){
            if(sum2<sum1+zero1 && zero2 == 0)return -1;
            if(sum2+zero2>sum1+zero1)return sum2+zero2;
            else return sum1+zero1;
        }
        
        else{
            if(zero1 == 0)return -1;
            if(zero1>sum2-sum1)return -1;
            return sum2+zero2;
        }
        // return 0;
    }
}