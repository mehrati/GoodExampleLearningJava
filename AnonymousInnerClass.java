public class AnonymousInnerClass {

	int v1 = 10;//Global Var
	static int vs = 100;//Static Var

	public void myMethod() {
		int v2 = 9;// you can't define local static variable
		interfaceA obja = new interfaceA() {// anonymous inner Class

			@Override
			public void methodA() {
				System.out.print("anonymous inner Class");
				// local variable only Use you can't change it
				System.out.printf(" access to Global variable %d and Static Variable %d and local %d", v1, vs, v2);
			}
		};
		obja.methodA();
	}

	public static void main(String[] args) {
		interfaceA obja = new interfaceA() {// anonymous static inner Class
			int v3 = 99;// you can't define local static variable
			@Override
			public void methodA() {
				System.out.print("anonymous static inner Class");
				System.out.printf(" access to Static Variable %d and local %d \n", vs, v3);
			}
		};
		obja.methodA();
		AnonymousInnerClass aic = new AnonymousInnerClass();
		aic.myMethod();
	}
}

interface interfaceA {
	void methodA();
}

