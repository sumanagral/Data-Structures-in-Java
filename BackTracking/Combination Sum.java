// Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
// frequency
//  of at least one of the chosen numbers is different.

// The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

// Example 1:

// Input: candidates = [2,3,6,7], target = 7
// Output: [[2,2,3],[7]]
// Explanation:
// 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
// 7 is a candidate, and 7 = 7.
// These are the only two combinations.
// Example 2:

// Input: candidates = [2,3,5], target = 8
// Output: [[2,2,2,2],[2,3,3],[3,5]]
// Example 3:

// Input: candidates = [2], target = 1
// Output: []
 

// Constraints:

// 1 <= candidates.length <= 30
// 2 <= candidates[i] <= 40
// All elements of candidates are distinct.
// 1 <= target <= 40
class Solution {
  


     public void value(int i,int n,int target,int[] candidates,List<Integer> list, List<List<Integer>> answer)
     {
          System.out.println(list);
        if(i==n)
        {
            if(target==0)
            {
          
                answer.add(new ArrayList<>(list));
            }
                return;
        }
       
          if(candidates[i]<=target)
          {
              list.add(candidates[i]);
              value(i,n,target-candidates[i],candidates,list,answer);
              list.remove(list.size()-1);
             
          }
           value(i+1,n,target,candidates,list,answer);

     }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        int n = candidates.length;
           List<List<Integer>> answer = new ArrayList<>();
        value(0,n,target,candidates,new ArrayList<>(),answer);
        return answer;
    }
}