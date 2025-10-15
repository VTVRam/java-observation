interface swimmer {
	void swim();
}
interface runner {
	void run();
}
class Athelete implements swimmer,runner{
	public void swim(){
		System.out.println("Swimmer is swimming in the pool");
	}
	public void run(){
		System.out.println("runner is running at the track");
	}
}
public class MultipleInheritance{
	public static void main(String args[]){
		Athelete Arjun = new Athelete();
		Arjun.swim();
		Arjun.run();
	}
}
