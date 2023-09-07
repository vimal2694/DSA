package Strings;

public class ReverseStringWordWise {
	
	public static String reverseString(String str) {
		String[] splitStr = str.split("\\s+");
		StringBuffer stringBuffer = new StringBuffer();
		for(int i= splitStr.length-1;i>=0;i--) {
			stringBuffer.append(splitStr[i]).append(" ");
		}
		return stringBuffer.toString().trim();
	}

	public static void main(String[] args) {
		String str = "Welcome to Coding Ninjas";
		System.out.println(reverseString(str));
	}

}
