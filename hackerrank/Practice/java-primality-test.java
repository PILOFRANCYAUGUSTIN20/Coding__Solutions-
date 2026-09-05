// Problem: Java Primality Test
// Platform: hackerrank
// Language: java8
// Verdict: Accepted
// URL: https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
// Solved on: 2026-09-05T08:53:54.044Z

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    static boolean isProbablePrime(int num){
        for(int i=2;i<=num/2;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        int count =2;
        int num = Integer.parseInt(n);
        boolean res = isProbablePrime(num);
        
        if(res){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        
    }
}
