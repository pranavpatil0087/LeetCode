class Solution {
    public int maxArea(int[] height) {

         int maxWater = 0;
        int left = 0;
        int  right = height.length -1;
        while(left < right){
            int w = right - left;
            int height1 = Math.min(height[left], height[right]);
            int current = w * height1;
            maxWater = Math.max(maxWater, current);
           if(height[left] < height[right]){
    left++;
}else{
    right--;
}
        } 
        return maxWater;
    }
}



        // for (int i = 0; i < height.length; i++) {

        //     for (int j = i + 1; j < height.length; j++) {

        //         // Width between the two lines
        //         int w = j - i;

        //         // Height is the smaller of the two lines
        //         int height1 = Math.min(height[i], height[j]);

        //         // Current water stored
        //         int current = w * height1;

        //         // Update maximum water
        //         maxWater = Math.max(maxWater, current);
        //     }
        // }

        // return maxWater;