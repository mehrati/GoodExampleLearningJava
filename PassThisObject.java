public class PassThisObject {

	public static void main(String[] srgs) {
		NewClass newclass = new NewClass(23);
		System.out.println(NewClass.getVar(newclass));
		newclass.printVar();

	}
}

class NewClass {

	private int var;

	public NewClass(int var) {

		this.var = var;
	}
	public static int getVar(NewClass nc) {

		return nc.var;
	}
        public void printVar() {
        //pass this Obj
		System.out.println(getVar(this));
	}

}
