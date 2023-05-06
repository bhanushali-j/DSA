package strings;

import java.util.Scanner;

/*Q: Return the run length encoding of a given String. basicaly return the repeated successive characters as 
   chracater and a single count. 
   
   Test case :
   Input : abbdcaas
   output : a1b2d1c1a2s1*/

public class EncodingString {
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        String input = sc.nextLine();
	        String ans = encode(input);
	        System.out.println(ans);
	    }	 
	 public static String encode(String message) {
			char chr=message.charAt(0);
			int count = 1;
			StringBuilder sb=new StringBuilder();
			for(int i=1;i<message.length();i++){
				if(chr==message.charAt(i)){
					count++;
				}
				else{
					sb.append(chr);
					sb.append(count);
					chr=message.charAt(i);
					count=1;
				}
			}
			//append the last character and its count
			sb.append(chr); 
			sb.append(count);
			return sb.toString();
		}
}
