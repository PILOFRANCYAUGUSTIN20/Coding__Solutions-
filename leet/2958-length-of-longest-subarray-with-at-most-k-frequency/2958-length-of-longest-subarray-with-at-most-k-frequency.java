class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer>freqCount = new HashMap<>();
        int start=0,end,maxLen=0;
        for(end=0;end<nums.length;end++){
            freqCount.put(nums[end],freqCount.getOrDefault(nums[end],0)+1);
            while(start<=end && freqCount.get(nums[end])>k){
                int key = nums[start];
                freqCount.put(key,freqCount.get(key)-1);
                start++;

            }
            maxLen=Math.max(end-start+1,maxLen);
        }
        return maxLen;
    }
}