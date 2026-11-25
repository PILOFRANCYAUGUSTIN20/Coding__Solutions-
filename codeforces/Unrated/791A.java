// Problem: Bear and Big Brother
// Platform: codeforces
// Language: Java
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-25T08:26:19.057Z

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int l = ip.nextInt();
		int b = ip.nextInt();
		if(l==b)
		    System.out.println(1);
		else{
		    int i=1;
		    while(true){
		        l=l*3;
		        b=b*2;
		        if(l>b)
		            break;
		        i++;
		    }
		    System.out.print(i);
		}
	}
}
