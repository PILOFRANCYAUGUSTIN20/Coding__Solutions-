// Problem: Java Anagrams
// Platform: hackerrank
// Language: java
// Verdict: Accepted
// URL: https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
// Solved on: 2026-09-08T06:06:41.407Z



    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        if(a.length() != b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            int ind = b.indexOf(ch);
            if(ind != -1){
                b = b.substring(0,ind)+ b.substring(ind+1);
            }
            else{
                return false;
            }
        }
        return b.isEmpty();
    }

