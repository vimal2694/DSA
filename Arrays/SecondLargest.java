package Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = {3,6,-5,6,1,2};
		int num = secondLargest(arr, arr.length);
		System.out.println(num);
	}
	
	private static int secondLargest(int arr[], int n) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(first < arr[i]) {
				second = first;
				first = arr[i];
			}
			if(second < arr[i] && arr[i]< first) {
				second = arr[i];
			}
		}
		return second;
	}

}
