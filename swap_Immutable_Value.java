import java.lang.reflect.Field;

public class swap_Immutable_Value {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Integer i1 = 10;
		Integer i2 = 20;
		swap(i1,i2);
		
		System.out.println(i1);
		
		
		
	}
	
	public static void swap(Integer i1,Integer i2) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		Class<Integer> i = Integer.class;
		Field f = i.getDeclaredField("value");
		f.setAccessible(true);
		Object temp = f.get(i1);
		f.set(i1,i2);
		f.set(i2, temp);
		f.setAccessible(false);
		
	}


}
