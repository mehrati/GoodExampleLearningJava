public class CallByValueAndReference {

	public static void main(String[] srgs) {

		int x1 = 10;// -> Primitive Data Type like long,char,float,...
		Number x2 = new Number(10);// -> Reference Data Type like Array,Set,List,...
		System.out.println("Before Increment x1 = " + x1);
		System.out.println("Before Increment x2 = " + x2.x);
		Increment1(x1); // CallByValue
		Increment2(x2); // CallByReference
		System.out.println("After Increment x1 = " + x1);
		System.out.println("After Increment x2 = " + x2.x);
	}

	public static void Increment1(int x) { // copy Value Number in Parameter
		x++;
	}

	public static void Increment2(Number a) {// copy Address Object in Parameter Not Value
		a.x++;
	}

}

class Number {
	int x;

	public Number(int x) {
		this.x = x;
	}
}
