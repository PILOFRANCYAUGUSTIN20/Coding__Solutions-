// Problem: Java Datatypes
// Platform: hackerrank
// Language: java
// Verdict: Accepted
// URL: https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true
// Solved on: 2026-09-05T06:26:59.072Z

import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x >= Short.MIN_VALUE  && Short.MAX_VALUE>=x ){
                    System.out.println("* short");
                }
                if(x >= Integer.MIN_VALUE && Integer.MAX_VALUE >= x){
                    System.out.println("* int");
                }
                if(x >= Long.MIN_VALUE && Long.MAX_VALUE >= x){
                    System.out.println("* long");
                }
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



