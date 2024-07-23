class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int islands=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    islands++;
                    dfs(i,j,grid);
                }
            }
        }
        return islands;
    }
    public static void dfs(int i,int j,char[][] grid){
        int row = grid.length;
        int col=grid[0].length;

        if( i<0 || i>=row || j<0 || j>=col || grid[i][j]=='0' ){
            return;
        }

        grid[i][j]='0';

        dfs(i-1,j,grid);//up
        dfs(i+1,j,grid);//down
        dfs(i,j-1,grid);//left
        dfs(i,j+1,grid);//right

    }
    
}