// Problem: Java Output Formatting
// Platform: hackerrank
// Language: java
// Verdict: Accepted
// URL: https://www.hackerrank.com/challenges/java-output-formatting/submissions/code/480921066
// Solved on: 2026-10-05T04:25:58.522Z

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");

    }
}



