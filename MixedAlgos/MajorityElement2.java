package MixedAlgos;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
	
	public static List<Integer> majorityElement(int arr[]) {
		int count1 = 0,count2 = 0, element1 = 0, element2 = 0;
		int n = arr.length;
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i<n;i++) {
			if(count1 ==0 && arr[i]!=element2) {
				count1=1;
				element1 = arr[i];
			} else if(count2 ==0 && arr[i]!=element1) {
				count2 = 1;
				element2 =arr[i];
			} else if(arr[i]==element1) {
				count1++;
			} else if(arr[i]==element2) {
				count2++;
			}
			else {
				count1--;
				count2--;
			}
		}
		
		int count3 =0;
		int count4 =0;
		for(int i = 0 ; i< n;i++) {
			if(arr[i]==element1) {
				count3++;
			} else if(arr[i]== element2) {
				count4++;
			}
		}
		
		if(count3> n/3) {
			list.add(element1);
		}
		if(count4>n/3) {
			list.add(element2);
		}
		
		return list;
	}
	

	public static void main(String[] args) {
		int arr[] = {3,2,2,1,3,2,3,5};
		List<Integer> num = majorityElement(arr);
		for(int i: num) {
			System.out.println(i);
		}
	}

}
