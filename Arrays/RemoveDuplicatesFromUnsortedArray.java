package Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;

class RemoveDuplicatesFromUnsortedArray
{
	public static HashMap<Integer, Boolean> removeDups(int[] arr, int n)
	{
		HashMap<Integer,
				Boolean> hashMap = new LinkedHashMap<>();

		for (int i = 0; i < n; ++i)
		{
			if(!hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], true);
			}
		}
		return hashMap;
	}

	// Driver Code
	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };
		int n = arr.length;
		HashMap<Integer, Boolean> hashMap = removeDups(arr, n);
		for(Integer keySet : hashMap.keySet()) {
			System.out.println(keySet.intValue());
		}
	}
}