package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*We can solve this using multiple things
1) We can sort the array and loop from 1 to N and 
   find the first missing positive number. 
   Time complexity=O(nlogn)
   Space complexity= O(1).
   
2) We can take a hashMap/Set (Set preferably) and 
   add all positive elements in that collection, loop from 1 to N and 
   search i in hashmap/set, return if not found and if we have all
   elements from 1 to N then it means N+1 is the next positiv integer.
   Time complexity = O(N)
   Space complexity = O(N). 
   
Expected : 
Time Complexity = O (N)
Space complexity= O(1).

Below is the optimized soltuion*/			

public class firstMissingPositive {
public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=0;i<N;i++){
			int n = sc.nextInt();
			int[] arr=new int[n];
			for(int j=0;j<n;j++) {
				arr[j]=sc.nextInt();
			}
			System.out.println(firstMissing(arr,n));	
		}
		
}
public static int firstMissing(int[] arr, int n) {

		boolean containsOne=false;
		for(int i:arr) {
			if(i==1) {
				containsOne=true;
				break;
			}
		}
		
		//One is the first positive number so if there is no one just return 1
		if(!containsOne) {
			return 1;
		}
		
//		//If there is one and array has only 1 element simply return 2.
//		if(arr.length < 2) {
//			return 2;
//		}
		
		/*The answer always will be from 1 to N and if not in between then N+1 will be next positive
		Integer. In the below loop we will mark all numbers < 0 or not in range 1 to N as "1".  */ 
		for(int i=0;i<n;i++){ 
			if(arr[i]<=0 | arr[i]>n){  // arr[i]<=0 is important to note we are also marking 0 values as it might give array index out of bound in ahead operations
				arr[i]=1;
			}
		}
		
/*		Basically below for loop will mark all the positions with values as -1
		eg : arr[4,2,0,1] will be arr[-4,-2,0,-1], hence the position not marked will be the missing
		positive number.
*/		
		for(int i=0;i<n;i++) {
			int c = Math.abs(arr[i]);
			if(arr[c-1]>0) {
				arr[c-1]*=-1;
			}
		}
		
		//Simply return the position with unmarked(+ve value) and if not return N+1
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				return i+1;
			}
		}
		return n+1;
		
	}
}
