// Problem: Theatre Square
// Platform: codeforces
// Language: Java
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-25T07:27:46.017Z

import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner ip = new Scanner(System.in);
        long n = ip.nextInt();
        long m = ip.nextInt();
        long a = ip.nextInt();
        
        long row = (n+a-1)/a;
        long col = (m+a-1)/a;
        
        System.out.println(row*col);
    }
}