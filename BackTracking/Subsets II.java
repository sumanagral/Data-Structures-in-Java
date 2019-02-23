// Given an integer array nums that may contain duplicates, return all possible 
// subsets
//  (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

 

// Example 1:

// Input: nums = [1,2,2]
// Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
// Example 2:

// Input: nums = [0]
// Output: [[],[0]]
 

// Constraints:

// 1 <= nums.length <= 10
// -10 <= nums[i] <= 10
class Solution {
    public void sub(int i,int n,int[] arr,HashSet<List<Integer>> ans,ArrayList<Integer> list)
{
    if(i==n)
    {
        ans.add(new ArrayList<Integer>(list));
        return;
    }
    list.add(arr[i]);
    sub(i+1,n,arr,ans,list);
    list.remove(list.size()-1);
    sub(i+1,n,arr,ans,list);
}

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        sub(0,n,nums,ans,new ArrayList<Integer>());
        List<List<Integer>> answer = new ArrayList<>(ans);
        
        return answer;
    }
}