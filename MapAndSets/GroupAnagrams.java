package MapAndSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	
	
	public static List<List<String>> groupAnagrams(List<String> inputStr) {
    	HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
		List<List<String>> list = new ArrayList<>();
		
		for(String str : inputStr) {
			String temp = str;
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String s = new String(ch);
			if(hashMap.containsKey(s)) {
				ArrayList<String> arrayList = hashMap.get(s);
				arrayList.add(temp);
				hashMap.put(s, arrayList);
			} else {
				ArrayList<String> arrayList = new ArrayList<>();
				arrayList.add(temp);
				hashMap.put(s, arrayList);
			}
		}
		
		for(ArrayList<String> s : hashMap.values()) {
			list.add(s);
		}
		return list;
    
	}

	public static void main(String[] args) {
		String[] arr = {"eat", "ate", "bat", "tan", "nat"};
		List<String> str = Arrays.asList(arr);
		System.out.println(groupAnagrams(str));
	}

}
