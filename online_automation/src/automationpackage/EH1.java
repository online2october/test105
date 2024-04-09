package automationpackage;

public class EH1 {

	public static void main(String[] args) {
		
		try {
			int a = 5/0; //Arithmetic exception
		}catch(ArithmeticException a) {
			a.printStackTrace(); //give complete info
			System.out.println(a); // only info of exception
			
		}
		

	}

}
