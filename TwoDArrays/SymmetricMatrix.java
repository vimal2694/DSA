package TwoDArrays;

public class SymmetricMatrix {
	
	public static boolean isSymmetricMatrix(int arr[][]) {
		int n = arr.length;
		boolean flag = true;
		
		for(int i = 0;i<= n-2;i++) {
			for(int j = i+1;j<=n-1;j++) {
				if(arr[i][j]!=arr[j][i]) {
					flag = false;
				}
			}
		}
			
		return flag;
	}

	public static void main(String[] args) {
		int arr[][] = {{1,2,3}, {2,4,5}, {3,5,8}};
		System.out.println(isSymmetricMatrix(arr));
	}

}
