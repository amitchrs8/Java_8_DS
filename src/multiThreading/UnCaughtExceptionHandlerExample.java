package multiThreading;

import java.lang.Thread.UncaughtExceptionHandler;




class RunnableTaskEx implements Runnable{

	@Override
	public void run() {
		System.out.println("Formating to Integer : "+Integer.parseInt("32"));
		System.out.println("Formating to Integer : "+Integer.parseInt("43"));
		System.out.println("Formating to Integer : "+Integer.parseInt("76"));
		System.out.println("Formating to Integer : "+Integer.parseInt("4g5"));
		System.out.println("Formating to Integer : "+Integer.parseInt("324"));
		System.out.println("Formating to Integer : "+Integer.parseInt("722"));
		System.out.println("Formating to Integer : "+Integer.parseInt("54322"));
	}
	
}
	class ExceptionHandlerImpl implements UncaughtExceptionHandler{

		@Override
		public void uncaughtException(Thread t, Throwable e) {
			System.out.println("Caught the Exception at Thread : "+t.getName()+", Exception : "+e.getMessage());
			new Thread(new RunnableTaskEx()).start();
		}
		
	}

public class UnCaughtExceptionHandlerExample {

public static void main(String[] args) {
	Thread obj = new Thread(new RunnableTaskEx());
	obj.setUncaughtExceptionHandler(new ExceptionHandlerImpl());
	obj.start();
}	
	
}
