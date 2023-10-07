package TwoPointers;

public class MoveAllNegativeNumsToStart {
	
	public static int[] moveAllNumsToStart(int arr[]) {
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left<right) {
			if(arr[left]< 0) {
				left++;
			}
			if (arr[right]>0) {
				right--;
			} else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {-12,11,-13,-5,6,-7,5};
		arr = moveAllNumsToStart(arr);
		for(int x:arr) {
			System.out.println(x);
		}
	}

}
