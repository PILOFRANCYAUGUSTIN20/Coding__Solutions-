// Problem: Java Static Initializer Block
// Platform: hackerrank
// Language: java
// Verdict: Accepted
// URL: https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
// Solved on: 2026-09-05T05:04:13.075Z


    static int B;
    static int H;
    static boolean flag = true;
    static {
        Scanner ip = new Scanner (System.in);
        B = ip.nextInt();
        H = ip.nextInt();
        if(B<=0 || H<=0){
            System.out.print("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }
    

