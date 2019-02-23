// Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// Example 2:

// Input: nums = [0,1]
// Output: [[0,1],[1,0]]
// Example 3:

// Input: nums = [1]
// Output: [[1]]
 

// Constraints:

// 1 <= nums.length <= 6
// -10 <= nums[i] <= 10
// All the integers of nums are unique.
class Solution {

 private void permutations(int[] nums,List<List<Integer>> answer,boolean[] freq,List<Integer> list)
 {
   if(list.size()==nums.length)
   {
       answer.add(new ArrayList<Integer>(list));
       return;
   }
for(int i=0;i<nums.length;i++)
{
if(!freq[i])
{
    freq[i] = true;
    list.add(nums[i]);
    permutations(nums,answer,freq,list);
    list.remove(list.size()-1);
    freq[i] = false;
}
 }
 }
    public List<List<Integer>>  permute(int[] nums){

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permutations(nums,answer,freq,list);
        return answer;
        
    }
}