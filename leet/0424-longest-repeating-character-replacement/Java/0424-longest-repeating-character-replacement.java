class Solution {
    public int characterReplacement(String s, int k) {
        int start=0,end,maxLen=0,maxfreq=0;
        int[] freq =new int[26];
        char [] strArr = s.toCharArray();
        for(end=0;end<strArr.length;end++){
            freq[strArr[end]-'A']++;
            maxfreq = Math.max(freq[strArr[end]-'A'],maxfreq);
            while((end-start+1)-maxfreq>k){
                freq[strArr[start]-'A']--;
                start++;
            }
            maxLen = Math.max(end-start+1 , maxLen);
        }
        return maxLen;
    }
}