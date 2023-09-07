package Strings;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringEncoding {
	
	public static String stringencoding(String str) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		char[] ch = str.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for(char c: ch) {
			if(hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			} else {
				hashMap.put(c, 1);
			}
		}
		
		for(Entry<Character, Integer> e: hashMap.entrySet()) {
			stringBuffer.append(e.getKey()).append(e.getValue());
		}
		return stringBuffer.toString().trim();
	}

	public static void main(String[] args) {
		String str = "aaabb";
		System.out.println(stringencoding(str));
	}

}
