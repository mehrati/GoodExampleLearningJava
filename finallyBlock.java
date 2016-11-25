public class finallyBlock {

	public static void main(String[] args) {
		while (true) {
			try {
				System.out.println("Every Thing...");
				break;// or return;
			} catch (Exception e) {
				System.out.println("Catch Block");
			} finally {//this block execute 
				System.out.println("Finally Block");
			}
			System.out.println("End...");
		}
	}
}

