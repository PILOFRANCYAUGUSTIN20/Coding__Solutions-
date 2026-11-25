// Problem: Helpful Maths
// Platform: codeforces
// Language: Java
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-25T08:24:13.082Z

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String str = ip.next();
		String s = str.replace("+"," ");
		String[] arr = s.split(" ");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]);
		    if(i<arr.length-1)
		        System.out.print("+");
		}
	}
}
