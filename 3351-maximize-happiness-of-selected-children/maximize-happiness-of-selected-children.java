class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue(Comparator.reverseOrder());
        for(int i : happiness){
            pq.offer(i);
        }
        long ans = 0;
        for(int i=0;i<k;i++){
            ans += Math.max(0,pq.poll()- i);
        }
        return ans;

    }
}