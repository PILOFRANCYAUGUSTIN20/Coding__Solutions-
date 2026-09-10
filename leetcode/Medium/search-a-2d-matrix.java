// Problem: Search a 2D Matrix
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/search-a-2d-matrix/
// Solved on: 2026-09-10T06:45:48.103Z

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length,m=matrix[0].length;
        int low=0 ,high = n*m-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            int row = mid / m;
            int col = mid %m ;
            if(matrix[row][col] == target) 
                return true;
            else if(matrix[row][col]<target)
                low = mid+1;
            else
                high = mid-1;
        }
        return false;
    }
}