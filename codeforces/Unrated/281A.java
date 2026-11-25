// Problem: Word Capitalization
// Platform: codeforces
// Language: Java
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-25T08:25:17.762Z

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String str = ip.next();
		String res = str.substring(0,1).toUpperCase() + str.substring(1);
	    System.out.print(res);
	}
}