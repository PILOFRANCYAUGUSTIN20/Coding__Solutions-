// Problem: ONEFULPAIRS
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/java/PJA03/problems/ONEFULPAIRS
// Solved on: 2026-10-06T04:27:02.229Z

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// write your code here
		int pro = a*b;
		int sum = a+b+pro;
		if(sum == 111){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
		
	}
}
