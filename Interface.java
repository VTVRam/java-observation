interface Flyable {
	void Takeoff();
	void Land();
}
class Airplane implements Flyable{
	public void Takeoff(){
		System.out.println("Airplane took off from mumbai");
	}
	public void Land(){
		System.out.println("Airplane landed at delhi");
	}
}

public class Interface{
	public static void main(String args[]){
		Airplane Bharath = new Airplane();
		Bharath.Takeoff();
		Bharath.Land();
	}
}
