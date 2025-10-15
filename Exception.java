public class Exception {
	public static void main(String args[]){
		try{
			int result = 10/0;
		}
		catch(ArithmeticException e){
			System.out.println("Error : can't divide by 0");
		}
		finally{
			System.out.println("unable to proceed");
		}
	}
}
