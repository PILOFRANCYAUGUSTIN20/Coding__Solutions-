// Problem: Intersection of Two Arrays
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/intersection-of-two-arrays/
// Solved on: 2026-09-24T04:35:49.911Z

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> a =  Arrays.stream(nums1).boxed().collect(Collectors.toCollection(HashSet::new));
        Set <Integer> b =  Arrays.stream(nums2).boxed().collect(Collectors.toCollection(HashSet::new));
        a.retainAll(b);
        int[] arr = new int[a.size()];
        int i=0;
        for(Integer num : a)
            arr[i++] = num;
        return arr;
    }
}