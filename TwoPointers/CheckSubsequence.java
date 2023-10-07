package TwoPointers;

public class CheckSubsequence {
	
	public static boolean checkSubsequence(String str1, String str2) {
		int ptr1 = 0, ptr2 =0;
		while(ptr1< str1.length() && ptr2 < str2.length()) {
			if(str1.charAt(ptr1) == str2.charAt(ptr2)){
				ptr1++;
				ptr2++;
			} else {
				ptr1++;
			}
		}
		return ptr2==str2.length();
	}

	public static void main(String[] args) {
	//	boolean ans = checkSubsequence("ABDE","AB");
//		boolean ans = checkSubsequence("ABCDE","ACE");
		boolean ans = checkSubsequence("AB", "AC");
		System.out.println(ans);
	}

}
