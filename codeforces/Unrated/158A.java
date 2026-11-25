// Problem: Next Round
// Platform: codeforces
// Language: Java
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-25T07:24:26.337Z

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner ip =  new Scanner (System.in);
        int n = ip.nextInt();
        int k = ip.nextInt();
        int[] scores = new int[n];
        for(int i=0;i<n;i++){
           scores[i] = ip.nextInt();
        }
        int contestant =0 ;
        for(int i=0;i<n;i++){
            if( scores[i] >= scores[k-1] && scores[i] !=0 )
                contestant++;
        }
        System.out.println(contestant);
    }
}