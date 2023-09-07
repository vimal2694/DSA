package MapAndSets;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacterInString {
	
	public static int firstNonRepeatedChar(String str) {
		
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hashMap = new LinkedHashMap<>();
		
		for(char c : ch) {
			if(hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			} else {
				hashMap.put(c, 1);
			}
		}
		
		for(Entry<Character, Integer> entrySet : hashMap.entrySet()) {
			if(entrySet.getValue()==1) {
				return str.indexOf(entrySet.getKey());
			}
		}
		
		return -1;
	}
	

	public static void main(String[] args) {
		String str = "aabb";
		System.out.println(firstNonRepeatedChar(str));
	}
	
}
