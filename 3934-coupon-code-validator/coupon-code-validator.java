class Solution {
    // My Solution
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int n = code.length;
        for(int i=0;i<n;i++){
            if(!isActive[i])continue;
            String s = code[i];
            if(s.length() ==0){
                isActive[i] = false;
                continue;
            }
            String b = businessLine[i];
            if(!b.equals("electronics") && !b.equals("grocery") && !b.equals("pharmacy") && !b.equals("restaurant")){
                isActive[i] = false;
                continue;
            }
            for(char c : s.toCharArray()){
                if(!(c>='a' && c<='z') && !(c>='A' && c<='Z') && !(c>= '0' && c<='9') && !(c =='_')){
                    isActive[i] = false;
                    break;
                }
            }

        }
        ArrayList<String>ans = new ArrayList<>();
        ArrayList<ArrayList<String>>groups = new ArrayList();
        for(int i=0;i<n;i++){
            if(isActive[i]){
                ArrayList<String>temp = new ArrayList();
                temp.add(businessLine[i]);
                temp.add(code[i]);
                groups.add(temp);
            }
        }
        
        Collections.sort(groups,((a,b)->a.get(0).equals(b.get(0))?a.get(1).compareTo(b.get(1)):a.get(0).compareTo(b.get(0))));

        for(ArrayList<String>i : groups){
            ans.add(i.get(1));
        }
        return ans;
    }
}