class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int l=2765;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    int x=i; int y=j;
                    while(x>=0){
                        if(matrix[x][y]!=0)matrix[x][y]=l;
                        x--;
                    }
                    x=i;y=j;
                    while(x<n){
                        if(matrix[x][y]!=0)matrix[x][y]=l;
                        x++;
                    }
                    x=i;y=j;
                    while(y>=0){
                        if(matrix[x][y]!=0)matrix[x][y]=l;
                        y--;
                    }
                    x=i;y=j;
                    while(y<m){
                        if(matrix[x][y]!=0)matrix[x][y]=l;
                        y++;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==l)matrix[i][j]=0;
            }
        }
        
    }
}