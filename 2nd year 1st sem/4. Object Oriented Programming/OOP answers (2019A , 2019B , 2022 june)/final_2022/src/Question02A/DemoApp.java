package Question02A;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TCalculation<Integer> integer = new TCalculation<>();
		integer.append(12);
		integer.append(1);
		integer.append(23);
		integer.append(2);
		integer.append(20);
		
		TCalculation<Double> dob = new TCalculation<>();
		dob.append(11.0);
		dob.append(11.2);
		dob.append(12.2);
		dob.append(45.2);
		dob.append(14.2);
		
		
		System.out.println(integer.average());
		System.out.println("\n" + dob.average());

	}

}
