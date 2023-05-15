package MultiDimensionalArrays;

import java.util.ArrayList;

/*Q - In a binary matrix of m*n size. Find the sum of coverages of all 0s. Coverage for a 0 is defined as total no of
    1s around it.(immediate left, right, top and bottom positions).*/

/*Input : 
2 2  // m*n
1 0
0 1

Output : 
4*/
public class SumOfZereos {
	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

		int n=mat.size();
		int m=mat.get(0).size();
		int sum=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(mat.get(i).get(j)==0){
					
					//Immediate top position
					if(i>0 && mat.get(i-1).get(j)==1){
						sum++;
					}
					
					//Immediate left position
					if(j>0 && mat.get(i).get(j-1)==1){
						sum ++;
					}
					
					//Immediate bottom position
					if(i<n-1 && mat.get(i+1).get(j)==1){
						sum++;
					}
					
					//Immediate right position
					if(j<m-1 && mat.get(i).get(j+1)==1){
						sum++;
					}
				}
			}
		}
		if(sum!=0){
			return sum;
		}
		return 0;
	}
}
