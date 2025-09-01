class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]>pq = new PriorityQueue<>((a,b)->Double.compare(a[0]/a[1] - (a[0]+1)/(a[1]+1),b[0]/b[1]-(b[0]+1)/(b[1]+1)));
        for(int[]i : classes){
            pq.offer(new double[]{i[0],i[1], (double) i[0] /i[1]});
        }
        while(extraStudents > 0){
            double[]i = pq.poll();
            pq.offer(new double[]{i[0]+1,i[1]+1,(double)(i[0]+1)/(i[1]+1)});
            extraStudents--;
        }
        double ans = 0;
        while(!pq.isEmpty()){
             double[]i = pq.poll();
            //  System.out.println(Arrays.toString(i));
            ans += i[2];
        }
        ans/=classes.length;
        return ans;
    }
}