
public class CuttingRod {
	
	/**
	 * Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n. 
	 * Determine the maximum value obtainable by cutting up the rod and selling the pieces. 
	 * For example, if length of the rod is 8 and the values of different pieces are given as following, 
	 * then the maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)
	 * @param args
	 */

	static int[] dp = new int[8];
	
	public static void main(String[] args) {
		
		int[] rodLengths = {1,2,3,4,5,6,7,8};
		int[] prices = {1,5,8,9,10,17,17,20};
		int n = rodLengths.length;
		
		int result = cutRod(prices,  n);
		
		System.out.println(result);
	}

	private static int cutRod(int[] price, int n) {
		
		if(n <= 0 )
		return 0;
		
		if(dp[n]!=0) {
			return dp[n];
		}
		
		int max_val = Integer.MIN_VALUE; 
		  
        // Recursively cut the rod in different pieces and 
        // compare different configurations 
        for (int i = 0; i<n; i++) 
            max_val = Math.max(max_val,price[i] + cutRod(price, n-i-1)); 
  
        dp[n] = max_val;
        
        return max_val; 
	}

}
