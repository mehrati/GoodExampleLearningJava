import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Executor1 {

	public static void main(String[] args) throws InterruptedException {

		NewThread nt = new NewThread();
		Executor ex = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			ex.execute(nt);
		}
		Thread.sleep(1000);
		System.out.println("Delay........");
		for (int i = 0; i < 10; i++) {
			ex.execute(nt);
		}
	}
}

class NewThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ID =" + Thread.currentThread().getId() + "--" + i);

		}
	}

}
