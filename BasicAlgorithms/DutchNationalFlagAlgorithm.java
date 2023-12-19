package BasicAlgorithms;

/*
 * Given an array nums with n objects colored red, white, or blue, 
 * sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * You must solve this problem without using the library's sort function.
 * Example 1:
 * Input: nums = [2,0,2,1,1,0] 
 * Output: [0,0,1,1,2,2] 
 */

public class DutchNationalFlagAlgorithm {

	// Better approach { TC-> O(2N) and SC-> O(1) }

//	public static int[] sort0and1and2(int arr[]) {
//		int count0 = 0, count1 = 0, count2 = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 0) {
//				count0++;
//			} else if (arr[i] == 1) {
//				count1++;
//			} else {
//				count2++;
//			}
//		}
//
//		for (int i = 0; i < count0; i++) {
//			arr[i] = 0;
//		}
//		for (int i = count0; i < count0 + count1; i++) {
//			arr[i] = 1;
//		}
//		for (int i = count0 + count1; i < count0 + count1 + count2; i++) {
//			arr[i] = 2;
//		}
//
//		return arr;
//	}
	 

	// Optimal approach(DNF algorithm)
	// TC-> O(2N) and SC-> O(1) 
	public static int[] sort0and1and2(int arr[]) {
		int n = arr.length;
		int mid = 0, low = 0, high = n - 1;
		while (mid<= high) {
			if (arr[mid] == 0) {
				swap(low, mid, arr);
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {
				swap(mid, high, arr);
				high--;
			}
		}
		return arr;
	}

	private static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int arr[] = {0,1,1,0,1,2,1,2,0,0,0};
		sort0and1and2(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
