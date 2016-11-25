public class NullPointerException {

	public static void main(String[] srgs) {

		Person[] nm = new Person[10];
		for (int i = 0; i < nm.length; i++) {
			nm[i] = new Person();//if comment this statement NullPointerException occur
		}
		nm[0].setName("Mahdi");
		nm[0].setFamily("Robatipoor");
		System.out.print(nm[0].getName() + " ");
		System.out.println(nm[0].getFamily());
	}

}

class Person {
	private String name;
	private String family;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

}

