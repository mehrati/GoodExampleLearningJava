public class MyThread {

	public static void main(String[] args) throws InterruptedException {
		Thread th1 =new Thread(new A());
		th1.start();
		//th1.setPriority(Thread.MAX_PRIORITY);
		th1.join();
		Thread th2 = new Thread(new B());
		th2.start();
	}

}

class A implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print("Class A : " + i + " ");
			System.out.print(Thread.currentThread().getName() + "-");
			System.out.println(Thread.currentThread().getId());
		}

	}

}

class B implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print("Class B : " + i + "-");
			System.out.print(Thread.currentThread().getName() + "-");
			System.out.println(Thread.currentThread().getId());
		}

	}

}
