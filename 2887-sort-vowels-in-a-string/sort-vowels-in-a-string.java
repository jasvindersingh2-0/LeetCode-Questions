class Solution {
    public String sortVowels(String s) {
        ArrayList<Character>arr = new ArrayList();
        for(char c : s.toCharArray()){
            if(c=='A' || c =='E' ||c=='I' || c == 'O' || c == 'U' ||
            c=='a' || c =='e'|| c=='i' || c == 'o' || c == 'u'){
                arr.add(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        Collections.sort(arr);
        // System.out.println()
        int i = 0;
        for(char c : s.toCharArray()){
            if(c=='A' || c =='E' ||c=='I' || c == 'O' || c == 'U' ||
            c=='a' || c =='e' || c=='i' || c == 'o' || c == 'u'){
               ans.append(arr.get(i++));
            }
            else ans.append(c);
    }
        return ans.toString();
}
}