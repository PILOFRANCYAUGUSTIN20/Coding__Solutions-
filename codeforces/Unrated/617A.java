// Problem: Elephant
// Platform: codeforces
// Language: Java
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-25T08:27:18.442Z

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int destination  = ip.nextInt();
		int minStep = (destination + 4)/5;
		
		System.out.println(minStep);
	}
}