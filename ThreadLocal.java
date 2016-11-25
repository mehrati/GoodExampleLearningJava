import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadLocal {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		NewThread nt = new NewThread();
		Executor ex = Executors.newFixedThreadPool(3);
		for(int i=0;i<10;i++)
		ex.execute(nt);

	}
}

class NewThread implements Runnable {
	ThreadLocal<Integer> tl = new ThreadLocal<>();
	@Override
	public void run() {
		long id= Thread.currentThread().getId();
		tl.set(tl.get()==null?1:tl.get()+1);
		System.out.println("thread = "+id+" Value is = "+tl.get());

	}

}
