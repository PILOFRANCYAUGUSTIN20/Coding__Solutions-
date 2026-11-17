// Problem: FLOW002
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/basic-math/BASICMATH/problems/FLOW002
// Solved on: 2026-11-17T05:07:05.106Z

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ip = new Scanner (System.in);
		int t = ip.nextInt();
		while(t-- > 0){
		    int a = ip.nextInt();
		    int b = ip.nextInt();
		    System.out.println( a%b);
		}

	}
}
