// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int lengthOfLIS(int[] nums) {
       int n = nums.length;
       int[] dp = new int[n];
       Arrays.fill(dp,1);
       int max = 1;
       for(int i = 1; i < n; i++){
           for(int j = 0; j < i; j++){
               if(nums[i] > nums[j]){
                   dp[i] = Math.max(dp[i],1+dp[j]);
                   max = Math.max(max,dp[i]);
               }
           }
       }
       return max; 
    }
}