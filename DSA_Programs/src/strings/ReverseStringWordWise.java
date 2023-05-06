package strings;

import java.util.Scanner;

/*Q : Given a String S, reverse the string without reversing its individual words. 
      Words are separated by spaces.*/

/*Test Case :Hello I am jay bhanushali
output :bhanushali jay am I Hello*/

public class ReverseStringWordWise {
	
	static String reverseStringWordWise(String input) {
        String[] arr=input.split(" ");
		
        /*
		 * As string is immutable it will create a new everytime in memory if we concat
		 * strings hence we have use StringBuilder or StringBuffer. 
		 * StringBuffer is thread Safe and hence a little slow then StringBuilder.
		 * Hence when a program requires multithreading we should use StringBuffer.
		 */ 
        
        StringBuilder str=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(i==0){
                str.append(arr[i]); 
            }
            else{
                str.append(arr[i]+" ");
            }
        }
        return str.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
