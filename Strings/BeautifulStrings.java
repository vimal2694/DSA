package Strings;

public class BeautifulStrings {
	
	public static int beautifulString(String str) {
		char ch[] = str.toCharArray();
		int count= 0;
		for(int i=1; i < ch.length; i++) {
			if(!(ch[i-1]=='0' && ch[i] == '1')) {
				count++;
			} 
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(beautifulString("1010"));
	}

}
