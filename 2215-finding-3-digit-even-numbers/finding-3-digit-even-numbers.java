class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = digits.length;
        HashMap<Integer, Integer> digitFreq = new HashMap<>();

        for (int d : digits) {
            digitFreq.put(d, digitFreq.getOrDefault(d, 0) + 1);
        }

        HashMap<Integer, Integer> numFreq = new HashMap<>();
        for (int i = 100; i <= 999; i++) {
            if (i % 2 != 0) continue; // must be even
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;

            if (a == 0) continue; // leading 0 not allowed

            numFreq.put(a, numFreq.getOrDefault(a, 0) + 1);
            numFreq.put(b, numFreq.getOrDefault(b, 0) + 1);
            numFreq.put(c, numFreq.getOrDefault(c, 0) + 1);

            boolean valid = true;
            for (int d : numFreq.keySet()) {
                if (numFreq.get(d) > digitFreq.getOrDefault(d, 0)) {
                    valid = false;
                    break;
                }
            }

            if (valid) ans.add(i);
            numFreq.clear();
        }

        Collections.sort(ans);
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}
