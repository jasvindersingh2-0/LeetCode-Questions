class Solution {
    public List<String> removeSubfolders(String[] folder) {
        HashSet<String>st = new HashSet<>();
        List<String>ans = new ArrayList<>();
        Arrays.sort(folder);
        boolean flag = false;
        for(String s : folder){
            flag = false;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) =='/'){
                    if(st.contains(s.substring(0,i))){
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag)st.add(s);
        }
        for(String s : st)ans.add(s);
        return ans;
    }
}