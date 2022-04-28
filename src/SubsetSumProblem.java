import java.util.HashSet;

public class SubsetSumProblem {

	/**
	 * Given a set of non-negative integers, and a value sum, determine if there is
	 * a subset of the given set with sum equal to given sum. Input: set[] = {3, 34,
	 * 4, 12, 5, 2}, sum = 9 
	 * Output: True 
	 * There is a subset (4, 5) with sum 9.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] set = {3,34,4,12,5,2};

		int sum = 9;

		int setLength = set.length;
		boolean result = isSubsetSum(set,sum,setLength);

		System.out.println("Is there a subset of the given set with sum equal to given sum? " + result);

	}

	private static boolean isSubsetSum(int[] set, int sum, int n) {

		// Base Cases 
        if (sum == 0) 
            return true; 
        
        if (n == 0 && sum != 0) 
            return false; 
  
        // If last element is greater than 
        // sum, then ignore it 
        if (set[n - 1] > sum) 
            return isSubsetSum(set, n - 1, sum); 
  
        /* else, check if sum can be obtained  
        by any of the following 
            (a) including the last element 
            (b) excluding the last element */
        
        return isSubsetSum(set, n - 1, sum) 
            || isSubsetSum(set, n - 1, sum - set[n - 1]); 
	}

}
