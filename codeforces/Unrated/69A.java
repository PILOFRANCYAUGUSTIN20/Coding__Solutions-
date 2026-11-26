// Problem: Young Physicist
// Platform: codeforces
// Language: Java
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-26T10:41:58.743Z

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		int[][] vectors = new int[n][3];
		int xSum = 0, ySum = 0, zSum = 0;
		for(int i=0;i<n;i++){
		    xSum += ip.nextInt();
		    ySum += ip.nextInt();
		    zSum += ip.nextInt();
		}
		if(xSum == 0 && ySum == 0 && zSum == 0 )
		    System.out.println("YES");
		else
		    System.out.println("NO");
	}
}