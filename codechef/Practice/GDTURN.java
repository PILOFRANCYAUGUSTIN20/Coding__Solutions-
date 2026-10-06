// Problem: GDTURN
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/java/PJA05/problems/GDTURN
// Solved on: 2026-10-06T04:36:21.833Z

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		// write your code here
    		if(x+y <= 6){
    		    System.out.println("NO");
    		}
    		else{
    		    System.out.println("YES");
    		}
		}
		
	}
}
