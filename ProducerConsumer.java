
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> l = new LinkedList<>();

		Thread[] th = { new Producer(l), new Consumer(l), new Producer(l), new Consumer(l) };
		for (Thread t : th) {
			t.start();
		}
		for (Thread t : th) {
			t.join();
		}
	}

}

class Producer extends Thread {

	List<Integer> l;

	public Producer(List<Integer> l) {
		this.l = l;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			synchronized (l) {
				int p = new Random().nextInt();
				l.add(p);
				System.out.println("Produced " + p);
				l.notify();
			}
		}
	}

}

class Consumer extends Thread {

	List<Integer> l;

	public Consumer(List<Integer> l) {
		this.l = l;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			synchronized (l) {
				while (l.size() == 0) {
					try {
						l.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				System.out.println("Consumered " + l.remove(0));
			}
		}
	}

}

