// Problem: Way Too Long Words
// Platform: codeforces
// Language: Java
// Verdict: Accepted
// URL: 
// Solved on: 2026-11-25T07:20:51.409Z

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner ip =  new Scanner (System.in);
		int n = ip.nextInt();
		String[] a = new String[n];
		for(int i=0;i<n;i++){
		    a[i] = ip.next();
		}
		for(int i=0;i<n;i++){
		    if(a[i].length() <= 10){
		        System.out.println(a[i]);
		    }
		    else{
		        int num = a[i].length()-2 ;
		        String res = a[i].charAt(0) + String.valueOf(num) + a[i].charAt(a[i].length()-1);
		        System.out.println(res);
		    }
		}
	}
}