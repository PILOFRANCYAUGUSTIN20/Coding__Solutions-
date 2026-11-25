// Problem: Beautiful Matrix
// Platform: codeforces
// Language: Java
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-25T07:26:55.631Z

import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner ip = new Scanner(System.in);
        int moves = 0 ;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int value = ip.nextInt();
                if(value == 1)
                    moves = Math.abs(i-3) + Math.abs(j-3);
            }
        }
        System.out.println(moves);
    }
}