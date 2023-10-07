package TwoPointers;



public class PairSum {
	
	public static int pairSum(int arr[], int sum) {
		int left = 0;
		int right = arr.length-1;
		int count=0;
		while(left< right) {
			if(arr[left]+ arr[right]>sum) {
				right--;
			} else if(arr[left]+arr[right]==sum) {
				count++;
				left++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println(pairSum(arr, 6));
	}

}
