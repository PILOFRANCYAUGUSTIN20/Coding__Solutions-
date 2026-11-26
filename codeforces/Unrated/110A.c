// Problem: Nearly Lucky Number
// Platform: codeforces
// Language: C
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-26T10:41:05.984Z

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String num = ip.next();
		int count = 0, i=0 ;
		while(i<num.length()){
		    char digit = num.charAt(i);
		    if(digit == '7' || digit == '4')
		        count++;
		    i++;
		}
		if(count == 7 || count == 4)
		    System.out.print("YES");
		else
		    System.out.print("NO");
	}
}
