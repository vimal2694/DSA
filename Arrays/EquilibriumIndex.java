package Arrays;

//Given an array of integers nums, calculate the equilibrium index of this array.

//The equilibrium index is the index where the sum of all the numbers strictly to the left of the index is 
//equal to the sum of all the numbers strictly to the index's right.

//If the index is on the left edge of the array, then the left sum is 0 
//because there are no elements to the left. This also applies to the right edge of the array.

//Return the leftmost equilibrium index. If no such index exists, return -1.

public class EquilibriumIndex {
	
//	public static int equilibriumIndex(int arr[]) {
//		int n = arr.length;
//		int temp[] = new int[n];
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			temp[i] = arr[i] + sum;
//			sum = temp[i];
//		}
//		
//		int total = temp[temp.length-1];
//		int lSum, rSum = 0;
//		for(int i=1;i< n-1;i++) {
//			
//			
//			lSum = temp[i]-arr[i];
//			rSum = total - temp[i];
//			
//			if(lSum==rSum) {
//				return i;
//			}
//		}
//		
//		return 0;
//	}
	
	
	//Method 2
	
	public static int equilibriumIndex(int arr[]) {
		int n = arr.length;
		int sum=arr[0];
		
		int lSum, rSum = 0;
		int total = 0;
		for(int i=0;i<n;i++) {
			total+=arr[i];
		}
		
		for(int i=1;i< n-1;i++) {
			
			sum = sum+arr[i];
			
			lSum = sum-arr[i];
			rSum = total - sum;
			
			if(lSum==rSum) {
				return i;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,6,4,0,-1};
		int equilibriumIndex = equilibriumIndex(arr);
		System.out.println(equilibriumIndex);
	}

}
