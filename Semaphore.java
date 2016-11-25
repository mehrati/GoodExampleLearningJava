
import java.util.concurrent.Semaphore;

public class Semaphore {

	public static void main(String[] args) {
		Semaphore sem = new Semaphore(3);
		for (int i = 0; i < 10; i++)
			new Thread(new NewThread(sem)).start();

	}
}

class NewThread implements Runnable {

	Semaphore s;

	public NewThread(Semaphore s) {
		this.s = s;

	}

	@Override
	public void run() {

		try {
			s.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			System.err.println("Start Thread "+Thread.currentThread().getId());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("End Thread "+Thread.currentThread().getId());
		s.release();

	}
}

