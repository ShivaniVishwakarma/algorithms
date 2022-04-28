
public class FibbonacciRecursive {

	
	 static int fib(int n, int a, int b ) 
	    {  
	          
	        if (n == 0) 
	            return a; 
	        if (n == 1) 
	            return b; 
	        return fib(n - 1, b, a + b); 
	    } 
	      
	    public static void main (String[] args)  
	    { 
	        int n = 9; 
	        System.out.println("fib(" + n +") = "+  
	                                 fib(n,0,1) );  
	    } 
}
