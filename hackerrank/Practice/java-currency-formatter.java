// Problem: Java Currency Formatter
// Platform: hackerrank
// Language: java
// Verdict: Accepted
// URL: https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
// Solved on: 2026-09-05T08:27:41.576Z

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

         DecimalFormat indiaFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        DecimalFormatSymbols symbols = indiaFormat.getDecimalFormatSymbols();
        symbols.setCurrencySymbol("Rs."); 
        indiaFormat.setDecimalFormatSymbols(symbols);
         
        String us = usFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        String india = indiaFormat.format(payment);
        
         india = india.replace("Rs. ", "Rs.");

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
