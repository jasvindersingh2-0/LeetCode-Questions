class Solution {
    public boolean doesAliceWin(String s) {
        int count = 0;
        for(char c : s.toCharArray()){
            if(c=='a'||c =='e'||c=='i'||c=='o'||c =='u'){
                count++;
            }
        }
        if(count == 0)return false;
        return true;
    }
}