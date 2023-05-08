package strings;

import java.util.Scanner;

/*Q: Given a binary string, that is it contains only 0s and 1s. We need to make this string a sequence of alternate characters by flipping some of the bits, our goal is to minimize the number of bits to be flipped.

Example 1:

Input:
S = "001"
Output: 1
Explanation: 
We can flip the 0th bit to 1 to have
101.*/

public class MakeBeautiful {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int ans = makeBeautiful(input);
        System.out.println(ans);
    }	
	 public static int makeBeautiful(String str) {

		 
			/*
			 * We can either start with 1 or start with 0. So basically we will check the
			 * number of minimum modifications required if start with 1 or 0 and return it
			 */ 
		 int oneAtEven=0;
	     int oneAtOdd=0;

	        for(int i=0;i<str.length();i++){
	            if((i & 1)>0){
	                if(str.charAt(i)!='1')
	                {
	                    oneAtOdd++;
	                }else{
	                    oneAtEven++;
	                }
	            }else{
	                if(str.charAt(i)!='1'){
	                    oneAtEven++;
	                }
	                else{
	                    oneAtOdd++;
	                }
	            }
	        }
	        return Math.min(oneAtEven,oneAtOdd);
	    }
}
