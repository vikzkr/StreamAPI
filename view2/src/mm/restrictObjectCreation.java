package mm;

public class restrictObjectCreation {

	public static void main(String[] args) {

		person pe = person.getInstance(10, "vikas");
		person pe2 = person.getInstance(10, "vikas");
		person pe3 = person.getInstance(10, "vikas");
		person pe4 = person.getInstance(10, "vikas");
		System.out.println(pe.hashCode());
	}

}

class person {
	int age;
	String name;
	private static int objCount = 0;

	private person(int age, String name) {

	}

	public static person getInstance(int age, String name) {

		objCount++;
		if (objCount <= 3) {
			person p = new person(age, name);
			return p;
		} else {
			throw new RuntimeException("More Object Creation Not allowed");
		}

	}

}