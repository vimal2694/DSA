package MixedAlgos;

import java.util.ArrayList;

public class MoveElementToEnd {
	
	// M-1 
	// TC-> O(2n)    SC-> O(n)
	public static int[] moveZeroesToEnd(int arr[]) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for(int i=0;i< arr.length;i++) {
			if(arr[i]!=0)
				arrayList.add(arr[i]);
		}
		
		for(int i =0;i< arrayList.size();i++) {
			arr[i] = arrayList.get(i);
		}
		
		for(int i = arrayList.size();i< arr.length;i++) {
			arr[i] = 0;
		}
		
		return arr;
	}
	
	
	//M-2 
	//TC -> O(n)  SC -> O(1)
	public static int[] moveZeroesToEndM2(int arr[]) {
		int j=-1;
		
		for(int i = 0;i< arr.length;i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
		}
		
		for(int i = j+1;i<arr.length;i++) {
			if(arr[i]!=0) {
				swap(i,j,arr);
				j++;
			}
		}
		
		return arr;
	}
	

	private static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


	public static void main(String[] args) {
		int arr[] = {0,1,-2,3,4,0,5,-27,9,0};
	//	int arr[] = {0,1,0,0,0,3,4,0};
		int result[] = moveZeroesToEndM2(arr);
		
		for(int i: result) {
			System.out.print(i+ " ");
		}
	}

}
