/*
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
 * 
 * 1 | 1 | 1 | 1                 1 | 0 | 0 | 1
 * 1 | 0 | 0 | 1       =>        0 | 0 | 0 | 0 
 * 1 | 1 | 0 | 1				 0 | 0 | 0 | 0
 * 1 | 1 | 1 | 1                 1 | 0 | 0 | 1
 */

package TwoDArrays;

public class SetMatrixZeroes {

	// TC -> O(n x m)*O(n + m)+O(n x m) :: SC -> O(1)
	public static void setMatrixZeroM1(int arr[][]) {
		int row = arr.length;
		int column = arr[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (arr[i][j] == 0) {
					markRow(i, arr);
					markColumn(j, arr);
				}
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (arr[i][j] == -1) {
					arr[i][j] = 0;
				}
			}
		}
	}

	private static void markColumn(int j, int[][] arr) {
		for (int k = 0; k < arr.length; k++) {
			if (arr[k][j] != 0) {
				arr[k][j] = -1;
			}
		}
	}

	private static void markRow(int i, int[][] arr) {
		for (int k = 0; k < arr.length; k++) {
			if (arr[i][k] != 0) {
				arr[i][k] = -1;
			}
		}
	}

	// TC-> O(2xnxm) : SC-> O(n) + O(m)
	public static void setMatrixZeroM2(int arr[][]) {
		int row = arr.length;
		int column = arr[0].length;
		int tempCol[] = new int[column];
		int tempRow[] = new int[row];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (arr[i][j] == 0) {
					tempCol[j] = 1;
					tempRow[i] = 1;
				}
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (tempRow[i] == 1 || tempCol[j] == 1) {
					arr[i][j] = 0;
				}
			}
		}
	}

	// TC-> O(n^2) : SC-> O(1)
	public static void setMatrixZeroM3(int arr[][]) {
		// int col[0] = arr[0][col];
		// int row[0] = arr[row][0];
		int col0 = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 0) {
					arr[i][0] = 0;
					if (j != 0) {
						arr[0][j] = 0;
					} else {
						col0 = 0;
					}
				}
			}
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				if (arr[i][j] != 0) {
					if (arr[0][j] == 0 || arr[i][0] == 0) {
						arr[i][j] = 0;
					}
				}
			}
		}

		if (arr[0][0] == 0) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[0][j] = 0;
			}
		}

		if (col0 == 0) {
			for (int i = 0; i < arr.length; i++) {
				arr[i][0] = 0;
			}
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 1, 1 }, { 1, 0, 0, 1 }, { 1, 1, 0, 1 }, { 1, 1, 1, 1 } };
		setMatrixZeroM2(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
