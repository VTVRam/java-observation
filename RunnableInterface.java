class Mytask implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName() + " is executing");
	}
}
public class RunnableInterface{
	public static void main(String args[]){
		Mytask task = new Mytask();
		
		Thread t1 = new Thread(task,"Thread-1");
		Thread t2 = new Thread(task,"Thread-2");
		t1.start();
		t2.start();
	}
}
