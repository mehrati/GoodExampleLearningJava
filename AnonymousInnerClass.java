
public class AnonymousInnerClass {
	int v = 10;
	static int vs = 100;

	public void myMethod() {
		int g = 9;// you can't define local static variable
		A a = new A() {// anonymous inner Class

			@Override
			public void fuc() {
				System.out.println("anonymous inner Class" + v + vs + g);
				// local variable only Use you can't change it
			}
		};
		a.fuc();
	}

	public static void main(String[] args) {
		A a = new A() {// anonymous static inner Class
            int y =99;// you can't define local static variable
			@Override
			public void fuc() {
				System.out.println("anonymous static inner Class" + vs + y);

			}
		};
		a.fuc();
	}
}

interface A {
	void fuc();
}

