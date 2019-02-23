// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

// Example 1:

// Input: s = "leetcode"
// Output: 0
// Example 2:

// Input: s = "loveleetcode"
// Output: 2
// Example 3:

// Input: s = "aabb"
// Output: -1
 

// Constraints:

// 1 <= s.length <= 105
// s consists of only lowercase English letters.
class Solution {
    public int firstUniqChar(String s) {
        char[] str=s.toCharArray();
       Map<Character,Integer> map=new HashMap<>();
       System.out.println(str.length);
       for(int i=0;i<str.length;i++)
       {
           char ch = str[i];
           map.put(ch,map.getOrDefault(ch,0)+1);
       }

       for(int i=0;i<str.length;i++)
       {
           char ch = str[i];
           if(map.get(ch)==1)
           {
               return  i; 
           }
           
       }
       return -1;

      // System.out.println(map);
        //int answer = 0;
        //return answer;
    }
}