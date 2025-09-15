class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character>st = new HashSet();
        for(char c : brokenLetters.toCharArray()){
            st.add(c);
        }
        String[]arr = text.split(" ");
        int ans = 0;
        for(String s : arr){
            boolean flag = true;
            for(char c : s.toCharArray()){
                if(st.contains(c)){
                    flag = false;
                    break;
                }
            }
            if(flag)ans++;
        }
        return ans;
    }
}