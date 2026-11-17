// Problem: LJAAS110
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/java/LPJAAS11/problems/LJAAS110
// Solved on: 2026-11-17T04:03:08.619Z

import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
        Scanner ip = new Scanner (System.in);
        int n = ip.nextInt();
        int fact = 1 ,i=1;
        do{
            fact = fact*i;
            i++;
        }while(i<=n);
        System.out.print(fact);
	}
}
