package Question01A;

public class Demo {

	public static void main(String[] args) {

		Pet squirrel = new Squirrel("run3");
		squirrel.cuddle();
		squirrel.feed();
		squirrel.GetTotalPoints();
		
		System.out.println();
		
		Pet squirrel2 = new Squirrel("Run5");
		squirrel2.cuddle();
		squirrel2.feed();
		squirrel2.GetTotalPoints();
		
		System.out.println();
		
		Pet garfield = new Cat();
		garfield.clean();
		garfield.feed();
		garfield.cuddle();
		garfield.GetTotalPoints();
		
		System.out.println();
		
		Pet parrot1 = new Parrot("walk");
		parrot1.feed();
		parrot1.GetTotalPoints();
		
		
	}

}
