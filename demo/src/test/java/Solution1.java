/***
 * 装最多的水
 */

class Solution1 {
    public int maxArea(int[] height) {

        int max =  0 ;

        for(int i = 0 ;i<height.length ;i++){
            for(int j = i+1 ;j<height.length ;j++){

                int w  = j-i;

                int h = height[i] > height[j] ? height[j] : height[i];

                int  area  = w*h;

                if(area > max){

                    max = area;

                }

            }

        }


        return max;

    }
}