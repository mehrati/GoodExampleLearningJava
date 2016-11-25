import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class reflection {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			ClassNotFoundException, NoSuchMethodException, SecurityException {

		Class oc1 = new Person().getClass();
		Class oc2 = Class.forName("Person");
		Class ocs = Person.class.getSuperclass();
		Constructor<Person> cons = oc1.getDeclaredConstructor(String.class);
		Person p = cons.newInstance("ali");
		Method mop = oc1.getDeclaredMethod("printName");
		mop.invoke(p);
        Method[] mo = oc1.getMethods();
        System.out.println(Arrays.toString(mo));
		
		
		
	}

}

class Person{
	String name;

	public Person() {
		name = "default";
	}

	public Person(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("name = " + name);
	}
}

