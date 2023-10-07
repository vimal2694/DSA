package MapAndSets;

import java.util.HashMap;

public class CountSubArraysHavingSumDivisibleByK {
	public static int countSubArrays(int arr[], int k) {
		int count =0, sum = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(0, 1);
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			
			int rem = sum % k;
			
			if(rem <0) {
				rem +=k;
			}
			
			if(hashMap.containsKey(rem)) {
				count += hashMap.get(rem);
				hashMap.put(rem, hashMap.get(rem)+1);
				
			} else {
				hashMap.put(rem,1);
			}
		}
		return count;
	}
	
	

	public static void main(String[] args) {
		int arr[]  = {4,5,0,-2,-3,1};
		int count = countSubArrays(arr, 5);
		System.out.println(count);
	}
}
