// Problem: Top K Frequent Elements
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/top-k-frequent-elements/
// Solved on: 2026-08-31T16:12:38.480Z

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] freq = new int[200001];
        for (int num : nums) {
            freq[num + 100000]++;
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            int max = 0;
            int index = 0;
            for (int j = 0; j < freq.length; j++) {
                if (freq[j] > max) {
                    max = freq[j];
                    index = j;
                }
            }
            ans[i] = index - 100000;
            freq[index] = 0;
        }
        return ans;
    }
}