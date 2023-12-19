package BasicAlgorithms;

/*
 * Given an integer array nums, find the subarray(including empty subarray) with the largest sum, and return its sum.
 * 
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */


// TC-> O(n) ;; SC -> O(1)
//Kadane's Algo
public class MaximumSubArraySum {
	
	public static int maxSubArraySum(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		int sum=0;
		for(int i =0;i<arr.length;i++) {
			sum +=arr[i];
			
			if(sum<0) {
				sum=0;
			} else {
				maxSum = Math.max(maxSum, sum);
			}
		}
		
		return maxSum<0 ? 0:maxSum;   // if maxSum is lesser than 0
	}

	public static void main(String[] args) {
		int arr[] = {-2,-3,-4,-1,-2,-1,-5,-3};
		System.out.println(maxSubArraySum(arr));
	}

}
