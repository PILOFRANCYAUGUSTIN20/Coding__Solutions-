// Problem: SNDMAX
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/basic-math/BASICMATH/problems/SNDMAX
// Solved on: 2026-11-17T04:53:44.713Z

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner ip = new Scanner (System.in);
        int N = ip.nextInt();
        int[][] arr = new int[N][N];
        for(int i=0;i<N;i++){
            int a = ip.nextInt();
            int b = ip.nextInt();
            int c = ip.nextInt();
            int secondLargest ;
            if((a >= b && a <= c) || (a >= c && a <= b)){
                secondLargest = a ;
            }else if ((b >= a && b <= c) || (b >= c && b <= a)){
                secondLargest = b;
            }else{
                secondLargest = c ;
            }
            System.out.println(secondLargest);
        }
	}
}
