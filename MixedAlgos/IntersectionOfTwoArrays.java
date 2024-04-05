package MixedAlgos;

import java.util.ArrayList;
import java.util.List;

/*
 * You are given two arrays 'A' and 'B' of size 'N' and 'M' respectively. Both these arrays are sorted in non-decreasing order. 
 * You have to find the intersection of these two arrays.
 * Intersection of two arrays is an array that consists of all the common elements occurring in both arrays.
 * 
 * Input :
 * 	arr1 -> 1, 2, 2, 2, 3, 4
 * 	arr2 -> 2, 2, 3, 3
 * 
 * Output:
 *  2,2,3
 */

public class IntersectionOfTwoArrays {
	
	public static List<Integer> intersectionOfTwoArrays(int arr1[], int arr2[]) {
		List<Integer> list = new ArrayList<>();
		
		int ptr1 =0, ptr2=0;
		while(ptr1< arr1.length && ptr2<arr2.length) {
			if(arr1[ptr1]< arr2[ptr2]) {
				ptr1++;
			} else if(arr1[ptr1]> arr2[ptr2]) {
				ptr2++;
			} else {
				list.add(arr1[ptr1]);
				ptr1++;
				ptr2++;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int arr1[] = {1, 2, 2, 3};
		int arr2[] = {2, 3, 4};
		List<Integer> nums = intersectionOfTwoArrays(arr1, arr2);
		for(int num: nums) {
			System.out.println(num);
		}
	}

}
