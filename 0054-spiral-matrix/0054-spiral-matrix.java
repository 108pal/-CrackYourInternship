class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int startrow=0;
        int endrow=m-1;
        int startcol=0;
        int endcol=n-1;
        List<Integer>list=new ArrayList<>();
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int j=startcol;j<=endcol;j++){
                list.add(matrix[startrow][j]);
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                list.add(matrix[i][endcol]);
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                list.add(matrix[endrow][j]);
            }
            //left
            for(int i=endrow-1;i>startrow;i--){
                if(startcol==endcol){
                    break;
                }
                list.add(matrix[i][startcol]);
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        } 
        return list;
    }
}