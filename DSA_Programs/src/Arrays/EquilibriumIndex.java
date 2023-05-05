package Arrays;

/*Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
Given an array, your task is to find the index of first Equilibrium point in the array.
*/
public class EquilibriumIndex {
	 public static int findEquilibrium(int arr[], int n)
     {
         int sum=0;
         int leftSum=0;
   
         //Add all elements and store in Sum 
         for(int i:arr){
             sum+=i;
         }
         
         for(int i=0;i<n;i++){
             
             //Subtract the ith element from Sum starting with i=1, basically this will give you the sum of all eleents on right part of ith element
             sum=sum-arr[i];
             
             //check if letfSum and rightSum are equal and if not add ith element in leftSum
             if(sum==leftSum){
                 return i;
             }
             else{
                 leftSum+=arr[i];
             }
         }
         return -1;      
     }
}
