import java.util.*;

public class TwoSumInefficient {

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
	    
	        //Copy array
		   int[] nums_copy = new int[nums.length];
		   
		   //Sort the array
		   Arrays.sort(nums_copy);
		   
		   //Traverse the array to find the sum using 2 pointers
		   
		   
	        return new int[] { };
	    }

	public static void main(String[] args) {
	
		int[] nums = {2, 7, 11, 15};
		int target =9;
	
		int[] result = twoSum(nums,target);
		
		System.out.println("["+result[0]+" , "+result[1]+"]");
	}
}
