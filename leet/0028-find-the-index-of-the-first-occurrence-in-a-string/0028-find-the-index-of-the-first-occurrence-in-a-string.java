class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for(int txt=0;txt<=n-m;txt++){
            int pat=0;
            for(pat=0;pat<m;pat++){
                if(needle.charAt(pat)!= haystack.charAt(txt+pat))
                    break;
            }
            if(pat == m){
                return txt;
            }
        }
        return -1;
    }
}