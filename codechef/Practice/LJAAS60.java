// Problem: LJAAS60
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/java/LPJAAS06/problems/LJAAS60
// Solved on: 2026-09-12T06:08:26.267Z

import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner ip = new Scanner (System.in);
		int mark ;
		for(int i=0;i<3;i++){
		    mark = ip.nextInt();
		    if(mark > 90){
		        System.out.println("A");
		    }
		    else if(mark > 70){
		        System.out.println("B");
		    }
		    else if(mark >= 40){
		        System.out.println("C");
		    }
		    else{
		        System.out.println("F");
		    }
		}

	}
}
