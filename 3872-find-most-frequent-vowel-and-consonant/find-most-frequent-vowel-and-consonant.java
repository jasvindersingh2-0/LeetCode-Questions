class Solution {
    public int maxFreqSum(String s) {
        int maxCon = 0;
        int maxVov = 0;
        int[]arr = new int[26];
        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                maxVov = Math.max(maxVov,++arr[c-'a']);
               
            }
            else{
                maxCon = Math.max(maxCon,++arr[c-'a']);
            }
        }
        return maxVov + maxCon;
    }
}