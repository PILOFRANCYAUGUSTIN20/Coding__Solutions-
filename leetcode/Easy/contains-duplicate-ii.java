// Problem: Contains Duplicate II
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/contains-duplicate-ii/
// Solved on: 2026-10-01T08:47:56.299Z

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int index=map.get(nums[i]);
                if(i-index<=k)
                    return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}