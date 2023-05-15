package MultiDimensionalArrays;

/*Q - Find if the marix is symmetric(matrix and its transpose are same).

Input : 
1 2 3
2 4 5 
3 5 8

output : 
True*/
public class SymmetrixMatrix {
	public static boolean isMatrixSymmetric(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]!=matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
