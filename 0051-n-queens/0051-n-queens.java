class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res= new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        int []leftrow = new int[n];
        int []upperDiagonal = new int[2*n-1];
        int []lowerDiagonal = new int[2*n-1];
        solve(0, board, res, leftrow, upperDiagonal, lowerDiagonal);
        return res;
    }
    public static void solve(int col,char[][]board,List<List<String>>res,int []leftrow,int []upperDiagonal,int []lowerDiagonal){
        if(col==board.length){
            res.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(leftrow[row]==0 && lowerDiagonal[row+col]==0 
                && upperDiagonal[board.length-1+col-row]==0){
               board[row][col]='Q';
               leftrow[row]=1;
               lowerDiagonal[row+col]=1;
               upperDiagonal[board.length-1+col-row]=1;
               solve(col+1, board, res, leftrow, upperDiagonal, lowerDiagonal);
               board[row][col]='.';
               leftrow[row]=0;
               lowerDiagonal[row+col]=0;
               upperDiagonal[board.length-1+col-row]=0;
            }
        }
    }
    static List<String> construct(char [][]board){
        List<String> res=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String s =new String(board[i]);
            res.add(s);
        }
        return res;
    }
}