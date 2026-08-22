class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        if(arr.length != arr1.length)
            return false;
        int[] freqCount = new int[256];
        for(int ind=0;ind<arr.length;ind++){
            char ch = arr[ind];
            char ch1 = arr1[ind];
            freqCount[ch-'a']++;
            freqCount[ch1-'a']--;
        }
        for(int val : freqCount){
            if(val!=0)
                return false;
        }
        return true;
    }
}