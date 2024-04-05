package Arrays;

public class ReverseArray {
	
	//Reverse array using two pointers approach
	//process is repeated for only the first n/2 elements where n = length of array.
	//TC -> O(n) : SC-> O(1)
	public static void reverseArrayM1(int arr[]) {
		int l = 0;
		int r = arr.length-1;
		while(l<r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}
	
	//TC -> O(n/2) : SC -> O(1) 
	public static void reverseArrayM2(int arr[]) {
		int n = arr.length;
		for(int i = 0;i< n/2;i++) {
			int temp  =  arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		reverseArrayM2(arr);
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}

}
