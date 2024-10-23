class Solution {
    public List<String> generateParenthesis(int n) {
        int open =n;
        int close=n;
        List<String> ans= new ArrayList<>();
        String op="";
        solve(open , close , op , ans);
        return ans;


    }
    public void solve(int open , int close , String op ,List<String> ans ){
        if( open ==0 && close ==0){
        ans.add(op);
        return ;
        }
       
        if(close>open){
            //both choics
            String op1=op;
            String op2=op;
            if(open !=0){
                op1+="(";
                solve(open-1, close , op1, ans );

            }
            op2+=")";
            solve(open , close -1, op2, ans );



        }
        else if(open !=0){
            //only open bracket
            op+="(";
            solve(open-1,close ,op,ans);




        }
    }
}