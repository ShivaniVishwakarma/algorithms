
public class MinInitialEnergyReqToCrossStreet {
	
	/**
	 * Given an array containing positive and negative numbers. 
	 * The array represents checkpoints from one end to other end of street. 
	 * Positive and negative values represent amount of energy at that checkpoint. 
	 * Positive numbers increase the energy and negative numbers decrease. 
	 * Find the minimum initial energy required to cross the street such that
	 * Energy level never becomes 0 or less than 0.
	 * Note : The value of minimum initial energy required will be 1 even if 
	 * we cross street successfully without loosing energy to less than and equal to 0 at any checkpoint. 
	 * The 1 is required for initial check point.
	 * 
	 * Input : arr[] = {4, -10, 4, 4, 4}
	 * Output: 7
	 * 
	 */

	public static void main(String[] args) {
		
		int arr[] = {4, -10, 4, 4, 4}; 
	    int n = arr.length; 
	    System.out.print(minInitialEnergy(arr, n));

	}
	

	static int minInitialEnergy(int arr[], int n)  
	{ 

	    int initMinEnergy = 0; 

	    int currEnergy = 0; 
	  
	    // flag to check if we have successfully crossed the street without any energy  
	    // loss <= o at any checkpoint 
	    boolean flag = false; 
	  
	    // Traverse each check point linearly 
	    for (int i = 0; i < n; i++) { 
	    currEnergy += arr[i]; 
	  
	    // If current energy, becomes negative or 0,  
	    // increment initial minimum energy by the negative 
	    // value plus 1. to keep current energy 
	    // positive (at least 1). Also 
	    // update current energy and flag.
	    
	    if (currEnergy <= 0) { 
	        initMinEnergy += Math.abs(currEnergy) + 1; 
	        currEnergy = 1; 
	        flag = true; 
	    } 
	    } 
	  
	    // If energy never became negative or 0, then 
	    // return 1. Else return computed initMinEnergy 
	    
	    return (flag == false) ? 1 : initMinEnergy; 
	} 

}
