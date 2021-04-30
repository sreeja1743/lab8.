package lab8;
import java.lang.Runnable;
import java.util.*;

public class ThreadDemo implements Runnable{
	
 public void run() {
	 for(int i = 0; i <= 10; i++) {
	 System.out.println("Time: "+java.time.LocalTime.now()); 
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	 
 }
       
 }
