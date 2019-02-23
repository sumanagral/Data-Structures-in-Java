// Given two binary strings a and b, return their sum as a binary string.

 

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"
 

// Constraints:

// 1 <= a.length, b.length <= 104
// a and b consist only of '0' or '1' characters.
// Each string does not contain leading zeros except for the zero itself.
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        int i = a.length()-1;
        int j = b.length()-1;
        int sum = 0;
        int carry = 0;
      
        while(i>=0 && j>=0)
        {
            // int a_val = a_array[i] - '0'; 
            // int b_val = b_array[j] - '0';
            int aval = ch1[i] - '0';
            int bval = ch2[j] - '0';
            
            sum = aval + bval + carry;
            
            if(sum % 2 ==0 )
            {
                str.append("0");
            }
            else
            {
                str.append("1");
            }
       
            carry = sum>=2?1:0;
            i--;
            j--;
          
        }
        while(i>=0)
        {
           int aval = ch1[i] - '0';
            sum = aval +carry;
                if(sum % 2 ==0 )
            {
                str.append("0");
            }
            else
            {
                str.append("1");
            }
             carry = sum>=2?1:0;
            i--;
          
        }
        while(j>=0)
        {
             int bval = ch2[j] - '0';
            sum = bval +carry;
                if(sum % 2 ==0 )
            {
                str.append("0");
            }
            else
            {
                str.append("1");
            }
             carry = sum>=2?1:0;
            j--;
        }
        
    if(carry==1)
    {
        str.append("1");
    }
       str.reverse();
        
        return str.toString();
       
    }
}