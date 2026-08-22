class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> list = new ArrayList<>();
        int left=0,right= matrix[0].length-1;
        int top=0,bottom=matrix.length-1;
        while(top<=bottom && left<=right){
            for(int ind=left;ind<=right;ind++)
                list.add(matrix[top][ind]);
            top++;
            for(int ind=top;ind<=bottom;ind++)
                list.add(matrix[ind][right]);
            right--;
            if(top<=bottom){
                for(int ind=right;ind>=left;ind--)
                    list.add(matrix[bottom][ind]);
                bottom--;
            }
            if(left<=right){
                for(int ind=bottom;ind>=top;ind--)
                    list.add(matrix[ind][left]);
                left++;
            }
        }
            return list;
    }
}