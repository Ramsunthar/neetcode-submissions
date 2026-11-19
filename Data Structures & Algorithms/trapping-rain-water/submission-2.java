class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxL = 0;
        int maxR = 0;
        int vol = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                maxL = Math.max(maxL, height[l]);     // tallest bar seen from the left
                vol += maxL - height[l];              // water above this bar
                l++;
            } else {
                maxR = Math.max(maxR, height[r]);     // tallest bar seen from the right
                vol += maxR - height[r];
                r--;
            }
        }
        return vol;
    }
}