package strings;

import java.util.Scanner;

/*Q: A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.   

Input: s = "())"
Output: 1*/
	
	
public class MinimumParenthesis {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int ans = minAddToMakeValid(input);
        System.out.println(ans);
    }	 
	
	public static int minAddToMakeValid(String s) {
        int c=0;
        int p=0;
        int l=s.length();

        for(int i=0;i<l;i++){
            char a=s.charAt(i);
            
            if(a=='('){
                c ++;
            }
            
            //Means we have encountered '(' already before which makes this closing parenthesis for that.
            else if(a==')' && c>0){
                c--;
            }
            
            //encountered ')' before '('
            else if(a==')'){
                p++;
            }
        }
        
        //Here C contains all the '(' without its closing and p contains ')' without its openings
        return c+p;
    }
}
