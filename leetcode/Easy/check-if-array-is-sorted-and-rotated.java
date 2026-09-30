// Problem: Check if Array Is Sorted and Rotated
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
// Solved on: 2026-09-30T07:53:39.144Z

class Solution {
    public boolean check(int[] nums) {
        int k=nums.length;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        while(k!=0){
            int first=arr[0];
            for(int i=1;i<arr.length;i++){
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=first;
            k--;
            if(Arrays.equals(nums,arr)){
                return true;
            }
        }
        return false;
    }
}