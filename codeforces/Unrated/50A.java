// Problem: Domino piling
// Platform: codeforces
// Language: Java
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-25T07:25:36.175Z

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int M = ip.nextInt();
        int N = ip.nextInt();
        int res = ( M*N )/2 ;
        System.out.println(res);
    }
}