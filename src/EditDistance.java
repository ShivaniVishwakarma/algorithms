
public class EditDistance {

	/**
	 * Given two strings str1 and str2 and below operations that can performed on str1. 
	 * Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’. 
	 * Insert
	 * Remove
	 * Replace
	 */
	
	public static void main(String[] args) {
		
		String s1 = "geeks";
		String s2 = "grteks";
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		int m = c1.length;
		int n = c2.length;
		
		int maxEdits = countEdits(c1, c2, m, n);
		
		System.out.println("Minimum no. of operations required are : " + maxEdits);

	}

	private static int countEdits(char[] c1, char[] c2, int m, int n) {
		
		// If first string is empty, the only option is to 
        // insert all characters of second string into first 
		if(m==0)
		return n;
		
		// If second string is empty, the only option is to 
        // remove all characters of first string 
		if(n==0)
		return m;
		
		// If last characters of two strings are same, nothing 
        // much to do. Ignore last characters and get count for 
        // remaining strings. 
		if(c1[m-1] == c2[n-1])
			return countEdits(c1, c2, m-1, n-1);
		 
		return 1 + min(countEdits(c1, c2, m, n-1),  //insert
				countEdits(c1, c2, m-1, n-1),	//replace
				countEdits(c1, c2, m-1, n));	//remove
		
	}
	
	static int min(int x, int y, int z) 
    { 
        if (x <= y && x <= z) 
            return x; 
        if (y <= x && y <= z) 
            return y; 
        else
            return z; 
    }

}
