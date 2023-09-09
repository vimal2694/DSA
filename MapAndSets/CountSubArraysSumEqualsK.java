package MapAndSets;

import java.util.HashMap;

//TC = O(N x logN) and SC = O(N)
public class CountSubArraysSumEqualsK {

	
	public static int countSubArrays(int arr[], int k) {
		int count =0;
		int sum =0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(0, 1);
		for(int i=0;i<arr.length;i++) {
		 sum += arr[i];
		 
		 int remove = sum -k;
		 
		 count += hashMap.getOrDefault(remove, 0);
		 
		 hashMap.put(sum, hashMap.getOrDefault(sum, 0)+1);
			
		}
		return count;
	}
	
	

	public static void main(String[] args) {
		int arr[]  = {1,2,3,-3,1,1,1,4,2,-3};
		int count = countSubArrays(arr, 3);
		System.out.println(count);
	}

}
