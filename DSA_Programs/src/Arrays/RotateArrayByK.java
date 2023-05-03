
//Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to the left by d positions.

package Arrays;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class RotateArrayByK {
	
public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		
		rotateArray(arr,n,k);
	}

	public static void rotateArray(int[] arr, int n, int k){
	
	//Create an ArrayDeque and add the array values in it
	Queue<Integer> rotatequeue=new ArrayDeque<>();
	for(int i=0;i<n;i++) {
		rotatequeue.add(arr[i]);
	}
	
	//remove d elements from back and add in front 
	for(int i=0;i<k;i++){
		int temp=rotatequeue.remove();
		rotatequeue.add(temp);
	}
	
	//print the elements of arrayDeque
	for(Integer i:rotatequeue) {
		System.out.print(i+" ");
	}
}

}


