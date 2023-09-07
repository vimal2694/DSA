package MapAndSets;

import java.util.HashMap;

public class MakeUniqueArray {
	
	public static int minElementsToRemove(int arr[]) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int count =0;
		for(int a : arr) {
			if(hashMap.containsKey(a)) {
				count++;
			} else {
				hashMap.put(a, 1);
			}
		}
//		
//		for(Integer a : hashMap.values()) {
//			if(a>1){
//				count += (a-1);
//			}				
//		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3,3};
		System.out.println(minElementsToRemove(arr));
	}

}
