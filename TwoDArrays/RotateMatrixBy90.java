package TwoDArrays;

/*
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
 * DO NOT allocate another 2D matrix and do the rotation.
 * 
 * Input: matrix = [[1,2,3],
 * 					[4,5,6],
 * 					[7,8,9]]
 * Output: [[7,4,1],
 * 			[8,5,2],
 * 			[9,6,3]]
 */

public class RotateMatrixBy90 {
	
	//m-1 
	//TC -> O(n^2) and SC -> O(n^2) 
	public static int[][] rotateMatrixBy90DegreeClockwiseM1(int arr[][]) {
		int row = arr.length;
		int column = arr[0].length;
		int matrix[][] = new int[row][column];
		
		for(int i = 0;i<row;i++) {
			for(int j = 0;j< column;j++) {
				matrix[j][row-1-i] = arr[i][j];
			}
		}
		return matrix;
	}
	//m-2
	//TC -> O(n^2) and SC -> O(1)
	public static int[][] rotateMatrixBy90DegreeClockwiseM2(int arr[][]) {
		int row = arr.length;
		int column = arr[0].length;
		
		//transpose of matrix
		for(int i = 0;i<=row-2;i++) {
			for(int j = i+1;j<=column-1;j++) {
				swap(i,j, arr);
			}
		}
		
		//reverse of matrix
		for(int i = 0 ;i< row;i++) {
			for(int j = 0;j< column/2;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][column-1-j];
				arr[i][column-1-j] = temp;
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
		int arr[][] = { { 1,2,3 }, {4,5,6}, {7,8,9} };
		int ans[][] = rotateMatrixBy90DegreeClockwiseM2(arr);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println("");
		} 
	}

}
