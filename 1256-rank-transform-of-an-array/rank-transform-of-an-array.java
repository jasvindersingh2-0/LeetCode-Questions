class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<n;i++){
            pq.offer(new int[]{arr[i],i});
        }
        int count = 1;
        int pre = Integer.MAX_VALUE;
        while(!pq.isEmpty()){
            int[]num = pq.poll();
            
            if(pre == num[0]){
                arr[num[1]] = count-1;
            }
            else{
                arr[num[1]] = count++;
                pre = num[0];
            }
        }
        return arr;


    }
}