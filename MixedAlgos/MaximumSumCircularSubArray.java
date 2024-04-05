package MixedAlgos;

/*
 * Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.

	A circular array means the end of the array connects to the beginning of the array. 
	Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].

	A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], 
	there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.
 
 	Example 1:

	Input: nums = [1,-2,3,-2]
	Output: 3
	Explanation: Subarray [3] has maximum sum 3.

	Example 2:

	Input: nums = [5,-3,5]
	Output: 10
	Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10.
 */

public class MaximumSumCircularSubArray {
	
	//TC -> O(n)    ;; SC-> O(1)
	public static int maximumSumCircularSubArray(int arr[]) {
		
		int currMax = 0;
		int globalMax = arr[0];
		
		int currMin = 0;
		int globalMin = arr[0];
		
		int sum =0;
		for(int i =0;i< arr.length;i++) {
			sum = sum+ arr[i];
			
			currMax = currMax + arr[i];
			currMin = currMin + arr[i];
			
			currMax = Math.max(currMax, arr[i]);
			globalMax = Math.max(currMax, globalMax);
			
			currMin = Math.min(currMin, arr[i]);
			globalMin = Math.min(currMin, globalMin);
		}
		
		
		// if all the elements in the array are negative
		if(globalMax<0)
			return globalMax;
		
		return Math.max(globalMax,sum - globalMin);
	}

	public static void main(String[] args) {
		//int ans[] = {5,-3,5};
		//int ans[] = {-1,-2,-3,-4};
		int ans[] = {1,-2,3,-2};
		System.out.println(maximumSumCircularSubArray(ans));
	}

}
