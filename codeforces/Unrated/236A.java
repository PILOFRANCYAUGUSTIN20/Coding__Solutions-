// Problem: Boy or Girl
// Platform: codeforces
// Language: Java
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-25T07:31:09.913Z

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        String str = ip.next().toUpperCase();
        
        Set <Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        if(set.size() %2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}