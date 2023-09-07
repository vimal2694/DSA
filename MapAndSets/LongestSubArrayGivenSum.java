package MapAndSets;

import java.util.HashMap;

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
