class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int min,water,max=0;
        while(left<right){
            min=(height[left]<height[right] ? height[left]:height[right]);
            water = min*(right-left);
            max = (water>max)? water:max;
            while(left<right && height[left]<=min)
                left++;
            while(left<right && height[right]<=min)
                right--;
        }
        return max;
    }
}