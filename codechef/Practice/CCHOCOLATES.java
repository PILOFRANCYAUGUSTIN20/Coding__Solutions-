// Problem: CCHOCOLATES
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/basic-math/BASICMATH/problems/CCHOCOLATES
// Solved on: 2026-11-17T05:03:29.109Z

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            // Your code goes here
            int rupees = (x*5) + (y*10);
            System.out.println( rupees / z);
        }
    }
}
