// Problem: Watermelon
// Platform: codeforces
// Language: Java
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-25T07:19:46.279Z

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ip = new Scanner (System.in);
        int watermelon = ip.nextInt();
        if( watermelon % 2 == 0 && watermelon > 2){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
    
}