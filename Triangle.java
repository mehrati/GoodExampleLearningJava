public class Triangle {
	public static void main(String[] args) {

		int n = 10;
		int s = 1;
		for (int i = 1; i < n; i += 2) {
		
			for (int k = 0; k < n-s; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
			s++;
		}

	}

}
