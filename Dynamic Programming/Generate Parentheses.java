// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

// Example 1:

// Input: n = 3
// Output: ["((()))","(()())","(())()","()(())","()()()"]
// Example 2:

// Input: n = 1
// Output: ["()"]
 

// Constraints:

// 1 <= n <= 8

class Solution {


    public void valid(List<String> list,int left,int right,String s,int n)
    {
       if(s.length()==n*2)
       {
            list.add(s);
            return;
       }
       if(left<n)
       {
           valid(list,left+1,right,s+"(",n);
       }
       if(right<left)
       {
            valid(list,left,right+1,s+")",n);
       }
      

    }

    public List<String> generateParenthesis(int n) {
        
        List<String> list = new ArrayList();
        String s = "";
        int left = 0;
        int right = 0;
        valid(list,left,right,s,n);
        return list;


    }
}