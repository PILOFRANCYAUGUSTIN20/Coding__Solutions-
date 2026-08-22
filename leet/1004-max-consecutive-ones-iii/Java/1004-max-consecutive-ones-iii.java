class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0,end,maxLen=0,maxFreq=0;
        int countOne =0;
        for(end=0;end<nums.length;end++){
            if(nums[end]==1)
                countOne++;
            while((end-start+1) - countOne >k) {
                if(nums[start]==1)
                    countOne--;
                start++;
            }
            maxLen = Math.max((end-start+1),maxLen);
        }
        return maxLen;
    }
}