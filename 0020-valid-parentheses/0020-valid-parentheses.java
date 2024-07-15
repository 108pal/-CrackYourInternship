class Solution {
    public boolean isValid(String s) {
        Stack <Character> S1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
              S1.push(ch);  
            }
            else{
                if(S1.isEmpty()){
                    return false;
                }
                if(S1.peek()=='('&&ch==')'||S1.peek()=='{'&&ch=='}'||S1.peek()=='['&&ch==']'){
                    S1.pop();
                }else{
                    return false;
                }
            } 
        }
        return S1.isEmpty();
    }
}