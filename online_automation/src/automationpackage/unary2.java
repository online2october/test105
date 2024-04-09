package automationpackage;

public class unary2 {

	public static void main(String[] args) {
		 
		int a=8; //local variable
		int b=9; //local variable
		
		System.out.println(a++ + b++); // 17
		System.out.println(++a + ++b); //21
		System.out.println(a-- + b--); //21
		System.out.println(--a + --b); //17
		System.out.println(a); //8
		System.out.println(b); //9
		

	}

}
