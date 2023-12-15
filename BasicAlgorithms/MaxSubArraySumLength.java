package BasicAlgorithms;

/*
 * Given an integer array nums, find the subarray (including empty subarray) with the largest sum, and return its length.
 * 
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 4
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6 with length 4.
 */

public class MaxSubArraySumLength {
	
	public static int maxSubArraySumLength(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		int sum =0, startIdx =0;
		int start = -1, end=-1;
		
		for(int i=0;i< arr.length;i++) {
			
			if(sum==0) {
				startIdx =i;
			}
			sum+= arr[i];
			
			if(sum<0) {
				sum=0;
			} else {
				maxSum = Math.max(maxSum, sum);
				start = startIdx;
				end = i;
			}
		}
		
		return end -start-1;
	}

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArraySumLength(nums));
	}

}
