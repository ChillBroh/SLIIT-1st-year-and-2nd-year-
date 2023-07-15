package Paper02A;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AscendingTable<Integer, String> myTable = new AscendingTable<>();
		
		myTable.add(40, "ddd");
		myTable.add(10, "ccc");
		myTable.add(20, "eee");
		myTable.add(30, "aaa");
		
		AscendingTable<Integer, Double> myTableD = new AscendingTable<>();
		
		myTableD.add(40 , 10.123);
		myTableD.add(10 , 23.456);
		myTableD.add(30 , 45.213);
		myTableD.add(20 , 12.154);
		
		AscendingTable.display(myTable);
		AscendingTable.display(myTableD);
		
		

	}

}
