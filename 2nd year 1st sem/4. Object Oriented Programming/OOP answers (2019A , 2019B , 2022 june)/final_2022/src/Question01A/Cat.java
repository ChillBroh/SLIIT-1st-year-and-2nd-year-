package Question01A;

public class Cat extends Pet {

	@Override
	public void GetTotalPoints() {

		System.out.println("Total point is " + getters());
	}

	public void feed() {
		System.out.println("feeding the Cat");
		setter(getters()+5);
	}

	public void clean() {

		System.out.println("cleanig the Cat");
		setter(getters() + 10);
	}

	public void cuddle() {

		System.out.println("cuddling the Cat");
		setter(getters() + 15);

	}
}
