// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]"
// Output: false
 

// Constraints:

// 1 <= s.length <= 104
// s consists of parentheses only '()[]{}'.
class Solution {
    public boolean isValid(String s) {
       boolean answer   = false;
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        // for(int i=0;i<ch.length;i++)
        // {
           
        // }
        // System.out.println(stack);
        
        for(int i=0;i<ch.length;i++)
        {
             if(ch[i]=='{'|| ch[i] == '(' || ch[i] =='[')
            {
                stack.push(ch[i]);
            }
           else
           {
               if(stack.isEmpty())
               {
                   return false;
               }
          System.out.println("inn for loop" + stack);
           char chValue = ch[i];
           char value = stack.pop();
           if((value == '(' && chValue == ')')
           || (value == '[' && chValue == ']') || 
           (value == '{' && chValue == '}'))
           {
               continue;   
           }
           else
           { 
              return false;
           }
               }  
            }
        return stack.isEmpty();

    }
}