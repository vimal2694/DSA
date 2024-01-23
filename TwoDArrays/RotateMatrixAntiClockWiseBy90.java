package TwoDArrays;

public class RotateMatrixAntiClockWiseBy90 {
	
	
	//TC -> O(n^2) : SC -> O(n^2)
	public static int[][] rotateArrayBy90AntiClockWiseM1(int arr[][]) {
		int n = arr.length;
		int matrix[][] = new int[n][n];
		
		for(int i = 0;i< n;i++) {
			for(int j =0;j<n;j++) {
				matrix[n-i-1][j] = arr[j][i];
			}
		}
		return matrix;
	}

	//m-2
	//TC -> O(n^2) and SC -> O(1)
	public static int[][] rotateArrayBy90AntiClockWiseM2(int arr[][]) {
		int n = arr.length;
		
		for(int i = 0;i<= n-2;i++) {
			for(int j =i+1;j<=n-1;j++) {
				swap(i,j,arr);
			}
		}
		
		for(int i = 0;i< n;i++) {
			for(int j=0;j< n/2;j++) {
				int temp = arr[j][i];
				arr[j][i] = arr[n-1-j][i];
				arr[n-1-j][i] = temp;
			}
		}
		
		return arr;
	}
	
	private static void swap(int i, int j, int[][] arr) {
		int temp = arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i] = temp;
	}


	public static void main(String[] args) {
	//	int arr[][] = { { 1,2,3,4 }, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
		int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int ans[][] = rotateArrayBy90AntiClockWiseM2(arr);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println("");
		} 

	}

}
