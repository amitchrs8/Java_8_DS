package multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class PracticeMulti2 {

	class TaskCallable implements Callable<String> {

		@Override
		public String call() throws Exception {
			return Thread.currentThread().getName();
		}

	}

	public static void main(String[] args) {

		ScheduledExecutorService sexe = Executors.newScheduledThreadPool(3);
		PracticeMulti2.TaskCallable task = new PracticeMulti2().new TaskCallable();
		ScheduledFuture<String> schedule = sexe.schedule(task, 3, TimeUnit.SECONDS);

	}

}
