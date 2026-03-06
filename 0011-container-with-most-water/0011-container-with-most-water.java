class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxH = 0;

        while(left < right){
            int crntH = Math.min(height[left],height[right]) * (right - left);

            if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }

            if(crntH > maxH){
                maxH = crntH;
            }
        }
        return maxH;
        
    }
}