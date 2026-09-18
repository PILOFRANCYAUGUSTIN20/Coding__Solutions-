// Problem: Majority Element II
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/majority-element-ii/
// Solved on: 2026-09-18T04:48:27.307Z

class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> counts = new HashMap<>();

        int target = nums.length / 3;

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > target) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}