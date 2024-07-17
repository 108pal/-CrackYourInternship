class Solution {
    public String reverseWords(String s) {
        String []str=s.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            res.append(str[i]+" ");
        }
        return res.toString().trim();
    }
}