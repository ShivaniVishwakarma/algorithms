import java.util.ArrayList;

public class PartitionProblem {

	/**
	 * Partition problem is to determine whether a given set can be partitioned into two subsets 
	 * such that the sum of elements in both subsets is same.
	 * arr[] = {1, 5, 11, 5}
	 * Output: true 
	 * The array can be partitioned as {1, 5, 5} and {11}
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int[] set = {1,5,11,5};
		int n = set.length;
		int sum = 0;
		for(int i=0 ; i<n; i++) {
			sum = sum + set[i];
		}
		if(sum%2!=0)
		{
			System.out.println("Can't be partitioned into two subsets..");
		}
		else {
			
		int sumOfNewArray = sum/2;
		boolean result = isSubsetSum(set,n,sumOfNewArray);
		}
	}

	private static boolean isSubsetSum(int[] set, int n , int sum) {
		
		return isSubsetSum (set, n-1, sum) || 
	               isSubsetSum (set, n-1, sum-set[n-1]);
		
		
	}

	
}
