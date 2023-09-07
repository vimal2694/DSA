package MapAndSets;


//TC = O(2N) and SC = O(1)
public class LongestSubArraySumForOnlyPositiveNums {

	public static int longestSubArrayGivenSum(int arr[], int k) {

		int rightPtr = 0;
		int leftPtr = 0;		
		int maxLength = 0;
		int sum = arr[0];
		int n = arr.length;
		while (rightPtr < n) {
			while(leftPtr<=rightPtr && sum > k) {
				sum -= arr[leftPtr];
				leftPtr++;
			}
			if(sum == k ) {
				maxLength = Math.max(maxLength, rightPtr - leftPtr+1);
			}
			rightPtr++;
			if(rightPtr < n) {
				sum += arr[rightPtr];
			} 
		}
		return maxLength;
		
	}

	public static void main(String[] args) {
		int arr[]  = {1,2,3,1,1,1,1,3,3};
		int length = longestSubArrayGivenSum(arr, 6);
		System.out.println(length);
	}
}
