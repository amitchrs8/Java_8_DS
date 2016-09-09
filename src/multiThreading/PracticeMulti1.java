package multiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class PracticeMulti1 {

	
	public static void main(String[] args) {
		Runnable task = ()->{
			String threadName = Thread.currentThread().getName();
			System.out.println("Thread "+threadName+" is Going to sleep for 2 sec !! ");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread "+threadName+" has Slept for 2 sec !! ");
		};
	
	
	Thread t1 = new Thread(task);
//	t1.start();
//	t1.run();
	
	
	
//		ExecutorService exeService = Executors.newFixedThreadPool(4);
//		Long startTime  = System.currentTimeMillis();
//		System.out.println("Start Time of Execution ==> "+System.currentTimeMillis());
//		for(int i=0;i<20;i++){
//			exeService.submit(task);
//		}
//		exeService.shutdown();
//		Long endTime = System.currentTimeMillis();
//		System.out.println("Time taken to execute !! "+(endTime - startTime)%1000);
	
	
		Callable<Integer> callTask = ()-> {
			System.out.println("Executoing a callable task");
			TimeUnit.SECONDS.sleep(1);
			return new Double(Math.random()*121321).intValue();
		};
	
		ExecutorService exeService2 = Executors.newFixedThreadPool(3);
//		List<Future<Integer>> futureList = new ArrayList<Future<Integer>>();
//		for(int i=0;i<20;i++){
//			try {
//				TimeUnit.SECONDS.sleep(1);
//			} catch (InterruptedException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			Future<Integer> futureTask = exeService2.submit(callTask);
//			
//			if(futureTask.isDone()){
//				try {
//					System.out.println("Result of Thread "+Thread.currentThread().getName()+" is "+futureTask.get());
//				} catch (InterruptedException | ExecutionException e) {
//					e.printStackTrace();
//				}
//			}
//			else {
//				System.out.println(" taks is not yet finished so ading to list ");
//				futureList.add(futureTask);
//			}
//		}
//		exeService2.shutdown();
//		System.out.println("Now going to get the result of remaining task");
//		futureList.stream().filter(t-> {
//			return t.isDone();
//		}).forEach(result -> {
//			try {
//				System.out.println("Remaninig Task ==>> Result of Thread "+Thread.currentThread().getName()+" is "+result.get());
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		});;
		ExecutorService exeWorkStealer = Executors.newWorkStealingPool(2);
		List<Callable<Integer>> listCallable = new ArrayList<Callable<Integer>>();
		listCallable.add(callTask);
		listCallable.add(callTask);
		listCallable.add(callTask);
		listCallable.add(callTask);
		listCallable.add(callTask);
		listCallable.add(callTask);
		listCallable.add(callTask);
		listCallable.add(callTask);
		listCallable.add(callTask);
		listCallable.add(callTask);
		listCallable.add(callTask);
		listCallable.add(callTask);
		listCallable.add(callTask);
		listCallable.add(callTask);
		System.out.println("Calling invokeAll for multiple tasks");
		try {
			exeWorkStealer.invokeAll(listCallable).stream().map(fut -> {
					try {
						return fut.get();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return fut;
			}).forEach(System.out::println);;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
