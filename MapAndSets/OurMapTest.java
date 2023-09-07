package MapAndSets;


public class OurMapTest {

	public static void main(String[] args) {
		
		OurMap<Integer, String> nameToLen = new OurMap<>();
		nameToLen.put(1, "a");
		nameToLen.put(6, "riddhi");
		nameToLen.put(5, "absxd");
		nameToLen.put(3, "abc");
		nameToLen.put(5, "riddd");
//		nameToLen.remove(3);
		
		System.out.println(nameToLen.get(5));
		System.out.println(nameToLen.get(1));
		System.out.println(nameToLen.get(6));
		System.out.println(nameToLen.get(3));
		System.out.println(nameToLen.get(7));
		
	}

}
