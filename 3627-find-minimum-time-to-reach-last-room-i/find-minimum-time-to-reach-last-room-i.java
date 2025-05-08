class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length;
        int n = moveTime[0].length;
        int[][]dis = new int[m][n];
        for(int[]i : dis)Arrays.fill(i,Integer.MAX_VALUE);
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->a[2]-b[2]);
        pq.offer(new int[]{0,0,0});
        while(!pq.isEmpty()){
            int[]curr = pq.poll();
            int u = curr[0];
            int v = curr[1];
            int w = curr[2];
            for(int[]i : new int[][]{{0,1},{1,0},{0,-1},{-1,0}}){
                int r = u + i[0];
                int c = v + i[1];
                if(r<0 || c<0 || r>=m || c>=n)continue;
                int cost = Math.max(moveTime[r][c],dis[u][v]+1);
                if(dis[r][c]>cost){
                    dis[r][c] = cost;
                    pq.offer(new int[]{r,c,cost});
                }
            }
        }
        return dis[m-1][n-1]+1;
    }
}