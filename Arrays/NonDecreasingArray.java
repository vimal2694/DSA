package Arrays;

//Given an array nums with n integers, your task is to check if it could become non-decreasing 
//by modifying at most one element.

//We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).

public class NonDecreasingArray {

	public static boolean nonDecreasingArray(int arr[]) {
		boolean isNonDecreasing = true;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				isNonDecreasing = false;
				break;
			}
		}
		return isNonDecreasing;
	}

	public static void main(String args[]) {
		int arr[] = { -2, 7, -1, 0, 1, 2 };
		int count = 0;
		boolean flag = true;
		if (nonDecreasingArray(arr) == false) {

			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[i - 1]) {
					count++;
				}
			}
		}

		if (count > 1) {
			flag = false;
		}
		System.out.println(flag + "-- count----" + count);
	}
}
