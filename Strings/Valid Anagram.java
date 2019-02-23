// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false
 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.
class Solution {
    public boolean isAnagram(String s, String t) {

     if(s.length()!=t.length())
     {
return false;
     }

      Map<Character,Integer> map =  new HashMap<>();

       for(int i = 0 ;i<s.length();i++)
       {
           int value = map.getOrDefault(s.charAt(i),0);
           map.put(s.charAt(i),value+1);
       }
         

         for(int i=0;i<t.length();i++)
         {
             int value = map.getOrDefault(t.charAt(i),0);
             map.put(t.charAt(i),value-1);
         }
         System.out.println(map);

         for(int val : map.values())
         {
             if(val !=0)
             {
                 return false;
             }
         }
       return true;
    }
}