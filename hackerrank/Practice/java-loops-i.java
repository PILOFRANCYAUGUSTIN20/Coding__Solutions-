// Problem: Java Loops I
// Platform: hackerrank
// Language: java
// Verdict: Accepted
// URL: https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
// Solved on: 2026-09-02T06:09:24.475Z

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1;i<11;i++){
            int pro = N*i ;
            System.out.println(N+" x " + i + " = " + pro);
        }
        bufferedReader.close();
    }
}
