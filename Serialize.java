import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize {

	public static void main(String[] srgs) throws IOException, ClassNotFoundException {

		Person person = new Person("Mahdi", "Robatipoor", "password");
		FileOutputStream fos = new FileOutputStream("file.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(person);
		oos.close();
		fos.close();
//		deserialize
		//FileInputStream fis = new FileInputStream(new File("file.ser"));
		//ObjectInputStream ois = new ObjectInputStream(fis);
		//Object Obj =ois.readObject();
		//Person persond = (Person)Obj;
		//System.out.println("Name : "+ person.name);
		//System.out.println("LastName : "+ person.lastname);
		//System.out.println("Password : "+ person.password);// is null because define transient
	}

}

class Person implements Serializable {
	public String name;
	public String lastname;
	protected transient String password;

	public Person(String name, String lastname, String password) {
		this.name = name;
		this.lastname = lastname;
		this.password = password;
	}

}

