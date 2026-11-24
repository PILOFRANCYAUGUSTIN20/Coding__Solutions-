// Problem: Petya and Strings
// Platform: codeforces
// Language: Java
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-24T05:46:31.227Z

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        String str = ip.next().toUpperCase();
        String str1 = ip.next().toUpperCase();
        
        int val = (str.compareTo(str1));
        if(val < 0)
            System.out.println(-1);
        else if(val >0)
            System.out.println(1);
        else    
            System.out.println(0);
        
    }
}