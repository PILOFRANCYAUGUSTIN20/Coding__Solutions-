class Solution {
    private boolean isAlphaNumeric(char ch){
        if(ch >= 'a' && ch <= 'z' || ch >='0' && ch <= '9')
            return true ;
        return false ;
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int left=0,right=arr.length-1;
        while(left<right){
            while(left<right &&  !isAlphaNumeric(arr[left]))
                left++;
            while(left<right && !isAlphaNumeric(arr[right])){
                right--;}
            if(arr[left]!=arr[right])
                return false;
            left++;
            right--;
        }
        return true ;
    }
}