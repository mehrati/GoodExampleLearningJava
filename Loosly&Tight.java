
// ************tight coupling***************

class Travel_tight {
	Car_tight c = new Car_tight();

	public void StartJourny() {
		c.Start();
	}
}

class Car_tight {

	public void Start() {
		System.out.println("OK Start");
	}
}
//************tight coupling***************


// *****************loose coupling*************
interface Vehicle {

	void Start();
}

class Car_loose implements Vehicle {

	@Override
	public void Start() {
		System.out.println("Car Start");

	}

}

class Bike implements Vehicle {

	@Override
	public void Start() {
		System.out.println("Bike Start");

	}

}

class Travel_loose {
	Vehicle v;

	public Travel_loose(Vehicle v) {
		this.v = v;
	}

	public void StartJourny() {
		v.Start();
	}

}
// *****************loose coupling*************
