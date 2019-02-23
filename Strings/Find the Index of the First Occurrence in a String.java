// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

// Constraints:

// 1 <= haystack.length, needle.length <= 104
// haystack and needle consist of only lowercase English characters.
class Solution {
    public int strStr(String haystack, String needle) {
       int index = 0;
        if(!haystack.contains(needle))
        {
       index = -1;
        return index;
        }
     int start = 0;
     int end = needle.length(); 
     
     for(int i=0;i<haystack.length();i++)
     {
       if(i+end<=haystack.length())
       {
        String sub = haystack.substring(i,i+end);
        System.out.println("sub"+sub);
          if(sub.contains(needle))
          {
              return i;
          }
       }   
     }
       return index;
    }
}