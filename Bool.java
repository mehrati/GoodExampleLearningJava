public class Bool{

	public static void main(String[] args) {
	
		boolean b = false;
		if(b = !b){
			System.out.println(b+"1");//run
		};
		if(b = !b){
			System.out.println(b+"2");//not run
		};
		if(b = !b){
			System.out.println(b+"3");//run
		};
		
		
	}

}

