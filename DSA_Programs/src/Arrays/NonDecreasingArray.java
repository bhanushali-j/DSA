package Arrays;

/*Q : given array nums with n integers, your task is to check if it could become non-decreasing by 
	 modifying at most one element.
    We define an array is non-decreasing if a[i] <= a[i+1] holds for every index (0-based) such that (0 <= i <= n-2).
*/
public class NonDecreasingArray {
	public static boolean isPossible(int[] arr, int n) {
		// Write your code here
			boolean modify=false;  // We can modify at most one element

			for(int i=0;i<n-1;i++){
				if(arr[i]>arr[i+1]){
					
					// return false if one element is already modified 
					if(modify){
						return false;
					}
					
					/*							4	2
					 * In [3,4,2] when i=1, arr[i]>a[arri+1], we can change arr[i] to arr[i+1]
					 * to satisfy condition where arr[i]<=arr[i+1], however it breaks with arr[i-1] (3)
					 * and arr[i] (2, if changed), hence we cannot change arr[i] to arr[i+1] but can do arr[i+1] to
					 * arr[i]
					 */
					if(i==0 || arr[i+1]>=arr[i-1]){  
						arr[i]=arr[i+1];
					}
					else{
						arr[i+1]=arr[i];		
					}
					modify=true;
				}	
			}   
		return true;
	}
}
