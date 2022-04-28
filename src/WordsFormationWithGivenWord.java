public class WordsFormationWithGivenWord {

    public static void main(String[] args)
    {
        //int[] digits = { 1, 2, 2 };
        String nums = "1201";

        System.out.println(testUtil(nums, 0, nums.length()));

    }
    
    public static int testUtil(String num, int i, int n) {
        if (i == n) {
            return 1;
        }
        
        if(num.charAt(0)==0)
        	return 0;
 
        
        int twoClub = 0;
        int oneClub = 0;

        if (i < n-1 && Integer.parseInt(num.substring(i, i + 2)) <= 26 && num.charAt(i) != '0')         {
            twoClub = testUtil(num, i + 2, n);
        }

        if (num.charAt(i) != '0') 
        {
            oneClub = testUtil(num, i + 1, n);
        }

        return twoClub + oneClub;
    }


}