class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiag = 0;
        int maxArea = 0;
        for(int[]i : dimensions){
            double diag = Math.sqrt((i[0]*i[0])+(i[1]*i[1]));
            int area = i[0]*i[1];
            // System.out.println(diag+" "+area);
            if(diag>maxDiag){
                maxDiag = diag;
                maxArea = area;
            }
            if(diag == maxDiag){
                maxArea = Math.max(area,maxArea);
            }
        }
        return maxArea;

    }
}