// Problem: Team
// Platform: codeforces
// Language: Java
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-25T07:22:27.185Z

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner ip =  new Scanner (System.in);
		int problems = ip.nextInt();
		int ableToSolve = 0;
		while(problems-- > 0){
		    int petya = ip.nextInt();
		    int vasya = ip.nextInt();
		    int tonya = ip.nextInt(); 
		    
		    int count = 0;
		    if(petya == 1)
		        count++;
		    if(vasya == 1)
		        count++;
		    if(tonya == 1)
		        count++;
		    if(count >= 2)
		        ableToSolve++;
		    
		}
		System.out.println(ableToSolve);
	}
}