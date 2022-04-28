import java.util.Arrays;

public class ShrotestSubArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4};

		int target = 6;
		
		int result = shortestSubarray(arr,target);
		
		System.out.println(result);
	}

	private static int shortestSubarray(int[] arr, int target) {
		
		int shortestLen = arr.length + 1;
		int i=0, j=0;
		for(i=0; i<shortestLen; i++)
		{
			
			int currentSum=arr[i];
			
			if(currentSum>target) {
				return 1;
			}
			
			for(j= i+1; j<shortestLen; j++)
			{
				currentSum = currentSum + arr[j];
				
				if(currentSum > target && j-i+1 < shortestLen)
					shortestLen =j-i+1;
			}
		}
		System.out.println(Arrays.copyOfRange(arr, i, j).toString());
		
		return shortestLen;
	}

}
