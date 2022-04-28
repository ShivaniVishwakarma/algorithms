
public class LongestCommonSubsequence {

	
	/**
	 * LCS Problem Statement: Given two sequences, find the length of longest subsequence present in both of them. 
	 * A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.
	 */
	
	public static void main(String[] args) {

		String text1 = "AGGTAB";
		String text2 = "GXTXAYB";
		//ACAF=4

		char[] s1 = text1.toCharArray();
		char[] s2 = text2.toCharArray();

		int s1Length = s1.length;
		int s2Length = s2.length;

		System.out.println("Longest common subsequence of strings " + text1 + " and " + text2 + " is : "
				+ longestCommonSubsequence(s1, s2, s1Length, s2Length));
	}

	private static int longestCommonSubsequence(char[] s1, char[] s2, int m, int n) {
		
		if(m==0 || n==0) {
			return 0;
		}
		
		if(s1[m-1]==s2[n-1]) {
			return 1 + longestCommonSubsequence(s1, s2, m-1, n-1);
		}
		
		else {
			return Math.max(longestCommonSubsequence(s1, s2, m-1, n),longestCommonSubsequence(s1, s2, m, n-1));
		}
		
	}

}
