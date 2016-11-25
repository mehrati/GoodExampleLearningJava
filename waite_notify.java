import java.util.ArrayList;
import java.util.List;

public class waite_notify {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		Thread[] th = { new Thread(new Producer(l)), new Thread(new Consumer(l)) };
		for (Thread s : th) {
			s.start();
		}

	}
}

class Consumer implements Runnable {

	List<Integer> l;

	public Consumer(List<Integer> l) {
		this.l = l;

	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {

			synchronized (l) {
				while (l.size() == 0) {
					try {
						l.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Removed: " + i);
				l.remove(0);
			}
		}
	}

}

class Producer implements Runnable {
	List<Integer> l;

	public Producer(List<Integer> l) {
		this.l = l;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			synchronized (l) {
				System.out.println("add: " + i);
				l.add(i);
				l.notify();

			}
		}

	}

}
