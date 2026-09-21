// Problem: Permutations
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/permutations/
// Solved on: 2026-09-21T16:07:25.060Z

class Solution {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void permuteHelper(int[] arr, int l, int r, List<List<Integer>> res) {
        
        if (l == r) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : arr) {
                currentPermutation.add(num); 
            }
            res.add(currentPermutation);
            return;
        }

        for (int i = l; i <= r; i++) {
            swap(arr, l, i);                    
            permuteHelper(arr, l + 1, r, res);   
            swap(arr, l, i);                   
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        permuteHelper(nums, 0, nums.length - 1, res);
        return res;
    }
}
