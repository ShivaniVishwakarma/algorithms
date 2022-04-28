
public class TrappingRainWater_M {

	public static int trap(int[] height) {
	     
        int max_height=0;
        int max_height_ind =0;
        int temp_store=0;
        int store=0;
        
        //Base condition
        if(height.length == 0 || height.length == 1)
        {
            return 0;
        }
        
        //find max height
        for(int i=0 ; i < height.length ; i++)
        {
            if(height[i] >= max_height)
            {
                max_height = height[i];
                max_height_ind = i;
            }
        }
        
        //left to max height
        for(int i=0, j=1; j<=max_height_ind ; )
        {
            if(height[i] > height[j]){
                temp_store += height[i]-height[j];
                j++;
            }
            else{
                store+=temp_store;
                temp_store=0;
                i=j;
                j++;
            }
        }
        
        //right to max height
        for(int i=height.length-1, j=i-1; j>=max_height_ind ; )
        {
            if(height[j] < height[i]){
                temp_store += height[i]-height[j];
                j--;
            }
            else{
                store+=temp_store;
                temp_store=0;
                i=j;
                j--;
            }
        }
        
        return store;
        
        
    }
	
	 public static void main(String ar[]) {
		
		int[] height = {2,0,2};
		int max_storage = trap(height);
		System.out.println("max_storage : " + max_storage);

	}
}
