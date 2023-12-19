package Arrays;

import java.util.Arrays;

//Given an unsorted integer array nums, return the smallest missing positive integer.

//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

/*
 * Input: nums = [3,4,-1,1]
 * Output: 2
	Explanation: 1 is in the array but 2 is missing.
*/


public class FirstMissingPositive {
	
	//M-1  Time Complexity O(nlogn)+ O(n)
	/*
	  public static int missingInteger(int arr[]) {
		Arrays.sort(arr);  // -1,1,3,4
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>0 && arr[i-1]>0 && arr[i]!= arr[i-1]+1 && arr[i]!= arr[i-1]) {
				return arr[i]-1;
			}
			if(arr[i]> arr.length+1)
				return 1;
		}
		return 0;
	}
	 */
	
	//M-2 Optimized
	//TC -> O(2N) ; SC -> O(1)
	public static int missingInteger(int arr[]) {
		int i=0;
		while(i< arr.length) {
			if(arr[i]>0 && arr[i]< arr.length+1 && arr[i]!=arr[arr[i]-1]) {
				int j = arr[i]-1;
				int x = arr[i];
				
				//swap with x
				arr[i] = arr[j];
				arr[j] = x;
			} else {
				i++;
			}
		}
		
		for(i=0; i< arr.length;i++) {
			if(arr[i]!=i+1) {
				return i+1;
			}
		}
		return arr.length+1;
	}

	public static void main(String[] args) {
		//int nums[] = {3,4,-1,1,1};
		int nums[] = {3,4,-1,1};
		//int nums[] = {7,8,9,11,12};
		//int nums[] = {-2,11,1,-3,2,10,4};
		System.out.println(missingInteger(nums));
	}

}
