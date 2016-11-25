package mainpackage;

public class Enum {

	public static void main(String[] args) {
		Color r1 = Color.RED;
		Color r2 = Color.valueOf("RED");
		Color[] g = Color.values();
        System.out.println(r1.equals(r2));
        System.out.println(r2.getNumber());
        for(Color c : g){
        System.out.println(c.name());
        }
	}
}

enum Color{
	RED(1),BLUE(2),GREEN(3),GRAY(4),BLACK(5),YELLOW(6),WHITE(7);
	private int number;
	private Color(int var){
		this.number = var;
	}
	public int getNumber(){
		return this.number;
	}
}
