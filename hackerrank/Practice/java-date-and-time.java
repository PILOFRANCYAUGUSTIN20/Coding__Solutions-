// Problem: Java Date and Time
// Platform: hackerrank
// Language: java
// Verdict: Accepted
// URL: https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
// Solved on: 2026-09-05T08:25:01.488Z



class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }

}

