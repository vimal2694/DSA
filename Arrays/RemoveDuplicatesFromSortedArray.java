package Arrays;

public class RemoveDuplicatesFromSortedArray {
	
	public static int removeDuplicates(int arr[]) {
		int n = arr.length;
		int j=0;
		for(int i=0;i< n-1;i++) {
			if(arr[i]!= arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n-1];
		
		return j;
	}

	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3};
		int j = removeDuplicates(arr);
		for(int i = 0;i<j;i++) {
			System.out.println(arr[i]);
		}
	}

}
