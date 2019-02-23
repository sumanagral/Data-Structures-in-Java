// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
 

// Constraints:

// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lowercase English letters.
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // System.out.println(strs[0].charAt(0));
        int n = 201;
        // System.out.println("value"+strs[0]);
        //  System.out.println("value"+strs[0].length);
         // char[] arr = new char[];
        for(int i = 0; i<strs.length; i++)
        {
            if(strs[i].length()<n)
            {
                n  = strs[i].length();
            }
             // arr[i] = strs.toCharArray();
        }
       
       
        
        StringBuilder str = new StringBuilder();
        // int col = strs[0].length();
        int row = strs.length;
        
        for(int i=0;i<n;i++)
        {
            
            char ch = strs[0].charAt(i);
            for(int j=0;j<row;j++)
            {
                if(ch == strs[j].charAt(i))
                {
                    continue;
                }
                else
                {
                    return str.toString(); 
                }
            }
            str.append(ch);
        }
         return str.toString();
        
        
    }
}