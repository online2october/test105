package automationpackage;

public class variable1 {

	int a=6; // global variable
	static int b=8; // global variable
	
	public static void a()//user defined static method
	{
		System.out.println("hello world");
	}
	public static void b()//user defined static method
	{
		System.out.println("automation testing");
	}
	
	public static void main(String[] args) { // predefined main method
		  
		int a=20;
		System.out.println(a);

		float b = 20;
		System.out.println(b);
		
		char c='a';
		System.out.println(c);
		
		boolean d=true;
		d=false;
		System.out.println(d);

		System.out.println(4<1);
		//System.out.println(2==2);
		System.out.println(6>9);
		
		int e=88;
		int f=99;
		boolean y= e>f;
		System.out.println(y);
}

}
