class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l=0;
        int r=n-1;
        int area =0;
        int max = 0;
        
        while(l<r) {
            area = (r - l) * Math.min(heights[l], heights[r]);
            max = Math.max(max, area);
            
           if (heights[l] < heights[r]) {
                l++;            // left line is shorter, move it
            } else {
                r--;            // right is shorter (or equal), move it
            }
        }
        return max;
        
    }
}
