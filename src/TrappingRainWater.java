
public class TrappingRainWater {
	/**
	 * Given n non-negative integers representing an elevation map where the width of each bar is 1, 
	 * compute how much water it is able to trap after raining.
	 * Examples:
	 * Input: arr[]   = {2, 0, 2}
	 * Output: 2
	 * 
	 * | |water| |
	 * | |water| |
	 */

	public static void main(String[] args) {
		
		int[] waterArray = {2,0,2};
		System.out.println(trap(waterArray));
		
	}
	
	public static int trap(int[] height) {
        
        int vol = 0;
        int leftmax = 0;
        int rightmax = 0;
        int low = 0;
        int high = height.length-1;
        
        while(low < high){
          if(height[low] < height[high]){ 
            if(leftmax < height[low])
                leftmax = height[low];
            else{
                
                vol = vol + leftmax-height[low];
            }
            low++;
            }
            
            else{ 
            if(rightmax < height[high])
                rightmax = height[high];
            else{
                vol = vol + rightmax-height[high];
            }
            high--;
            }
        }
       return vol; 
    }
}
