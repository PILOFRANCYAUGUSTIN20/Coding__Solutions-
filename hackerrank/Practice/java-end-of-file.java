// Problem: Java End-of-file
// Platform: hackerrank
// Language: java
// Verdict: Accepted
// URL: https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
// Solved on: 2026-09-02T07:01:17.276Z

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ip = new Scanner (System.in);
        int numLine = 1 ;
        while(ip.hasNext()){
            String line = ip.nextLine();
            if(line.contains("end-of-file")){
                System.out.println(numLine +" "+line );
                break;
            }
            System.out.println(numLine +" "+line );
            numLine++;
        }
         ip.close();
    }
}
