import java.util.HashMap;

public class TwoSum {
	/**
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 * Given nums = [2, 7, 11, 15], target = 9,
	 * Because nums[0] + nums[1] = 2 + 7 = 9,
	 * return [0, 1].
	 * @param nums
	 * @param target
	 * @return
	 */
	
	   public static int[] twoSum(int[] nums, int target) {
	    
	        HashMap<Integer, Integer> map = new HashMap<>();
	        //key = 2 , value = 0
	        //key = 7 , value = 1
	        
	        for(int i = 0; i < nums.length; i++){
	        	System.out.println("target - nums[i] : " + (target - nums[i]));
	            if(map.containsKey(target - nums[i])){
	                return new int[] {map.get(target - nums[i]), i};
	            }
	            else{
	                map.put(nums[i], i);
	            }
	        }
	        return new int[] { };
	    }

	public static void main(String[] args) {
	
		int[] nums = {2, 7, 11, 15};
		int target =9;
	
		int[] result = twoSum(nums,target);
		
		System.out.println("["+result[0]+" , "+result[1]+"]");
	}

}
