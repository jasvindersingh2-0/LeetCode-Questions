class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>ans=new ArrayList();
        int n=words.length;
        for(int i=0;i<n;i++){
            String temp=words[i];
            int s=temp.length();
            for(int j=0;j<s;j++){
                if(temp.charAt(j)==x){
                    ans.add(i);
                    break;
                }
            }
            
        }
        return ans;
        
    }
}