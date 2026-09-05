// Problem: Java Loops II
// Platform: hackerrank
// Language: java
// Verdict: Accepted
// URL: https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
// Solved on: 2026-09-05T04:40:20.578Z

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a,pow =1;
            for(int j = 0;j<n;j++){
                res+=pow*b;
                System.out.print(res + " ");
                pow*=2;
            }
            System.out.println();
        }
        in.close();
    }
}
