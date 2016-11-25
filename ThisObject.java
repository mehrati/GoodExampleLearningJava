public class ThisObject {

	public static void main(String[] srgs) {
		
		NewClass newclass = new NewClass();
		newclass.setVar(100);
		System.out.println(newclass.getVar());
		newclass.printVar(30);

	}

}

class NewClass {

	private int var;

	public int getVar() {
		return this.var;
	}

	public void setVar(int var) {
		this.var = var;
	}

	public void printVar(int i){
		this.setVar(i);
		System.out.println(this.getVar());
	}

}
