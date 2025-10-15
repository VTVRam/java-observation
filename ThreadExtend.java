class Mythread extends Thread{
	public void run(){
		System.out.println("Thread is executing");
	}
}
public class ThreadExtend{
	public static void main(String args[]){
		Mythread t = new Mythread();
		t.start();
	}
}
