package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import com.sun.prism.paint.Stop;

public class PracticeMulti3_Lock {

	int count = 0;

	void incrementCount() {
		count++;
		System.out.println("Count Value : "+count);
	}

	void callIncrement() {
		ExecutorService execService = Executors.newFixedThreadPool(4);
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				incrementCount();
			}
		};
		IntStream.range(0, 1000).forEach(i -> execService.submit(runnable));
//		execService.shutdown();
//		try {
//			execService.awaitTermination(5, TimeUnit.SECONDS);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(execService.isTerminated()){
//			System.out.println("Task has been terminated , hence Shutting down the Thread");
//			execService.shutdownNow();
//		}
	}

	public static void main(String[] args) {
		PracticeMulti3_Lock obj = new PracticeMulti3_Lock();
		obj.callIncrement();
		System.out.println("Final Value of Count : "+obj.count);

	}

}
