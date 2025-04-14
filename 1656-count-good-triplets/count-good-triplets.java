class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                if(Math.abs(arr[i]-arr[j])>a)continue;
                for(int k=j+1;k<n;k++){
                    int y = Math.abs(arr[j]-arr[k]);
                    int z = Math.abs(arr[i]-arr[k]);
                    if(y<=b && z<=c)ans++;
                }
            }
        }
        return ans;
    }
}