package Paper03B;

public class GenericTest {

	public static void main(String[] args) {

		AscendingList<Integer> ascendingList = new AscendingList<>();
		ascendingList.add(80);
		ascendingList.add(80);
		ascendingList.add(70);
		ascendingList.add(50);
		ascendingList.add(10);
		ascendingList.add(20);
		ascendingList.add(10);
		ascendingList.add(50);
		
		AscendingList<String> ascendingList2 = new AscendingList<>();
		ascendingList2.add("aaa");
		ascendingList2.add("bbb");
		ascendingList2.add("ddd");
		ascendingList2.add("bbb");
		ascendingList2.add("ddd");
		ascendingList2.add("ccc");
		
		ascendingList.displayMyList(ascendingList);
		System.out.println();
		ascendingList2.displayMyList(ascendingList2);
	}

}
