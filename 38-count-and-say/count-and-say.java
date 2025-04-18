class Solution {
    public String countAndSay(int n) {
        String s = "1";
        if (n == 1)
            return s;
        StringBuilder sec = new StringBuilder();
        char c = 'a';
        n--;
        while (n > 0) {
            if(s.length()>0)c = s.charAt(0);
            int count = 1;
            for (int i = 1; i < s.length(); i++) {
                if (c != s.charAt(i)) {
                    sec.append(count);
                    sec.append(c);
                    c = s.charAt(i);
                    count = 1;
                } else if(c ==s.charAt(i))
                    count++;
            }
            sec.append(count);
            sec.append(c);
            // System.out.println(sec);
            s = new String(sec);
            sec = new StringBuilder();
            n--;
        }
        return s;

    }
}