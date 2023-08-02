package Arrays;

public class RotateAnArrayByK {
	
//	public static void rotateArrayByK(int arr[], int k) {
//		int temp = arr[0];
//		
//		for(int i = 1;i<arr.length;i++) {
//			arr[i-1] = arr[i];
//		}
//		arr[arr.length-1] = temp;
//		for(int i : arr) {
//			System.out.println(i);
//		}
//	}
	
	
	// Method 1 - Brute force approach
//	public static void rotateArrayByK(int arr[], int d) {
//		
//		
//		
//		int n = arr.length;
//		int k = d%n;
//		int temp[] = new int[k];
//		for (int i = 0;i<k;i++) {
//			temp[i] = arr[i];
//		}
//		
//		for(int i = 0;i<n-k;i++) {
//			arr[i] = arr[k+i];
//		}
//		
//		for(int i = n-k; i<n;i++) {
//			arr[i] = temp[i-(n-k)];
//		}
//		
//		for(int i: arr) {
//			System.out.println(i);
//		}
//		
//	}
	
	// method-2 Optimal Solution
	public static void rotateArrayByK(int arr[], int d) {
		int n = arr.length;
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, n-1);
		reverseArray(arr, 0, n-1);
		
		for(int i=0;i< arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void reverseArray(int arr[], int start, int end) {
		
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		rotateArrayByK(arr, 3);
	}

}
