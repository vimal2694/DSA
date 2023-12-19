package BasicAlgorithms;

import java.util.HashMap;
import java.util.Map.Entry;

/*
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. 
 * You may assume that the majority element always exists in the array.
 * 
 * Example:-
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */

public class MajorityElement {
	
	/*  ------Brute Force ---------- */
	// TC -> O(n^2) and SC -> O(1)
//	public static int majorityElement(int arr[]) {
//		
//		int n = arr.length;
//		for(int i=0;i< n;i++) {
//			int count =0;
//			for(int j=0;j< n;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//			}
//			if(count> n/2) {
//				return arr[i];
//			}
//		}
//		
//		return 0;
//	}
	
	/*  ------Better approach ---------- */
	//TC -> O(NlogN) + O(N) for ordered map
	//SC -> O(N)
//	public static int majorityElement(int arr[]) {
//		int n = arr.length;
//		HashMap<Integer, Integer> hashMap = new HashMap<>();
//		for(int i: arr) {
//			if(hashMap.containsKey(i)) {
//				hashMap.put(i, hashMap.get(i)+1);
//			} else {
//				hashMap.put(i, 1);
//			}
//		}
//		
//		for(Entry<Integer, Integer> entrySet: hashMap.entrySet()) {
//			if(entrySet.getValue()> n/2) {
//				return entrySet.getKey();
//			}
//		}
//		return 0;
//	}
	
	/*--------- Optimal approach --------*/
	//TC -> O(n)+O(n) &  SC -> O(1)
	public static int majorityElement(int arr[]) {
		int n = arr.length;
		int count = 0, element =0;
		for(int i=0;i<n;i++) {
			if(count == 0) {
				count=1;
				element = arr[i];
			} 
			else if(arr[i]== element) {
				count++;
			} else {
				count--;
			}
		}
		
		int count1=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==element) {
				count1++;
			}
		}
		
		if(count1>n/2) {
			return element;
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = {2,2,1,1,1,1,2};
		int majorityElement = majorityElement(arr);
		System.out.println(majorityElement);
	}

}
