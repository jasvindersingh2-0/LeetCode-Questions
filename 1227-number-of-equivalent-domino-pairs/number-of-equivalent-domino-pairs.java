class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int n = dominoes.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int one = dominoes[i][0];
            int two = dominoes[i][1];
            for(int j=i+1;j<n;j++){
                if(dominoes[j][0]==one &&
                dominoes[j][1]==two)ans++;
                else if(dominoes[j][1]==one &&
                dominoes[j][0]==two)ans++; 

            }
        }
        return ans;
    }
}