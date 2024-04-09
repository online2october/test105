package automationpackage;

public class EH2 {
	
	public static void a(int age) {
		try {
			if(age<18) {
			
				throw new ArithmeticException("not applicable");
			}else {
				System.out.println("applicale");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
			throws InterruptedException,NullPointerException,ArithmeticException,ArrayIndexOutOfBoundsException {
		Thread.sleep(2000);
		a(15);
		a(19);
		
	}

}
