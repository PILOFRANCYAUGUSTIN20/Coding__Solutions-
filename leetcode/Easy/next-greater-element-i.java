// Problem: Next Greater Element I
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/next-greater-element-i/
// Solved on: 2026-08-28T17:42:47.165Z

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            int value = nums1[i];
            int pos = -1;

            // Find value in nums2
            for (int j = 0; j < nums2.length; j++) {

                if (nums2[j] == value) {

                    // Search for next greater element
                    for (int k = j + 1; k < nums2.length; k++) {

                        if (nums2[k] > value) {
                            pos = nums2[k];
                            break;
                        }
                    }

                    break;
                }
            }

            ans[i] = pos;
        }

        return ans;
    }
}