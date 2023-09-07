package MapAndSets;

import java.util.HashMap;

/*
 * Given an array arr[] of size n containing integers. 
 * The problem is to find the length of the longest sub-array having sum equal to the given value k.
 * 
 * Examples: 

	Input: arr[] = { 10, 5, 2, 7, 1, 9 }, k = 15
	Output: 4
	Explanation: The sub-array is {5, 2, 7, 1}.
	
	Input: arr[] = {-5, 8, -14, 2, 4, 12}, k = -5
	Output: 5
 * 
 */


 // TC - O(n);  SC - O(n)  
// works for +ve's, -ve's and 0's
public class LongestSubArrayGivenSum {
	
	public static int longestSubArrayGivenSum(int arr[], int k) {
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int sum = 0;
		int maxLen = 0;
		for(int i = 0;i<arr.length;i++) {
			sum = sum + arr[i];
			if(sum==k) {
				maxLen = Math.max(maxLen, i+1);
			}
			
			int rem = sum -k;
			if(hashMap.containsKey(rem)) {
				int len = i- hashMap.get(rem);
				maxLen = Math.max(maxLen, len);
			}
			
			// for edge case {2,0,0,3}
			if(!hashMap.containsKey(sum)) {
				hashMap.put(sum, i);
			}
			
			// else 
			// hashMap.put(sum, i);
		}
		return maxLen;
		
	}

	public static void main(String[] args) {
		int arr[]  = {2,0,0,3};
		int length = longestSubArrayGivenSum(arr, 3);
		System.out.println(length);
	}

}
