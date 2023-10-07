package TwoPointers;

public class ContainerWithMostWater {
	
	public static int containerWithMostWater(int arr[]) {
		int left =0;
		int right = arr.length-1;
		int maxArea = 0;
		while(left< right) {
			maxArea = Math.max(maxArea, Math.min(arr[left], arr[right])*(right-left));
			if(arr[left]<=arr[right]) {
				left++;
			} else {
				right--;
			}
		}
		
		return maxArea;
	}

	public static void main(String[] args) {
		//int arr[] = {1,8,6,2,5,4,8,3,7};
		//int arr[] = {12,4,6,8,1};
		//int arr[] = {1,2,1};
		int arr[] = {1,2,3};
		System.out.println(containerWithMostWater(arr));
	}

}
