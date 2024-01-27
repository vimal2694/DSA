package TwoDArrays;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * 
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */

public class SpiralMatrix {

	public static List<Integer> spriralMatrix(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		List<Integer> ans = new ArrayList<>();

		int startRow = 0;
		int startCol = 0;
		int endCol = col - 1;
		int endRow = row - 1;

		while (startRow <= endRow && startCol <= endCol) {
			for (int i = startCol; i <= endCol; i++) {
				ans.add(arr[startRow][i]);
				
			}

			for (int i = startRow + 1; i <= endRow; i++) {
				ans.add(arr[i][endCol]);
			}

			for (int i = endCol - 1; i >= startCol; i--) {
				if(startRow == endRow) break; // edge case when there is a single row in the middle of the matrix
				ans.add(arr[endRow][i]);
			}

			for (int i = endRow - 1; i > startRow; i--) {
				if(startCol == endCol) break; // edge case when there is a single column in the middle of the matrix
				ans.add(arr[i][startCol]);
			}

			startRow++;
			endRow--;
			endCol--;
			startCol++;
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		List<Integer> ans = spriralMatrix(arr);
		
		for(int i : ans) {
			System.out.print(i+ " ");
		}
	}

}
