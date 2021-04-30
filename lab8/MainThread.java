package lab8;

public class MainThread {
     public static void main(String[] args) {
		ThreadDemo obj = new ThreadDemo();
		Thread t = new Thread(obj);
		
		t.start();
	}
}
