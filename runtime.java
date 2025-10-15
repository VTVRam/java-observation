class  Parent{
	void print(){
	System.out.println("Parent class");
	}
}
class Child extends Parent{
	void print(){
	System.out.println("Child class");
	}
}
public class runtime{
	public static void main(String args[]){
		Parent obj = new Child();
		obj.print();
	}
}
